package plp.enquanto;

import java.util.ArrayList;
import java.util.List;
import plp.enquanto.Linguagem.*;
import plp.enquanto.parser.EnquantoBaseListener;
import plp.enquanto.parser.EnquantoParser.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import static java.lang.Integer.parseInt;

public class Regras extends EnquantoBaseListener {
	private final Leia leia;
	private final Skip skip;
	private final Propriedades valores;

	private Programa programa;

	public Regras() {
		leia = new Leia();
		skip = new Skip();
		valores = new Propriedades();
	}

	public Programa getPrograma() {
		return programa;
	}

	@Override
	public void exitLeia(LeiaContext ctx) {
		valores.insira(ctx, leia);
	}

	@Override
	public void exitSe(SeContext ctx) {
		Bool condicao = valores.pegue(ctx.booleano(0));
		Comando entao = valores.pegue(ctx.comando(0));

		Comando senao;
		if (ctx.comando().size() > 1) {
			senao = valores.pegue(ctx.comando(1));
		} else {
			senao = skip;
		}

		valores.insira(ctx, new Se(condicao, entao, senao));
	}

	@Override
	public void exitInteiro(InteiroContext ctx) {
		valores.insira(ctx, new Inteiro(Integer.parseInt(ctx.getText())));
	}

	@Override
	public void exitSkip(SkipContext ctx) {
		valores.insira(ctx, skip);
	}

	@Override
	public void exitPrograma(ProgramaContext ctx) {
		final List<Comando> cmds = valores.pegue(ctx.seqComando());
		programa = new Programa(cmds);
		valores.insira(ctx, programa);
	}

	@Override
	public void exitId(IdContext ctx) {
		valores.insira(ctx, new Id(ctx.ID().getText()));
	}

	@Override
	public void exitSeqComando(SeqComandoContext ctx) {
		final List<Comando> comandos = new ArrayList<>();
		for (ComandoContext c : ctx.comando()) {
			comandos.add(valores.pegue(c));
		}
		valores.insira(ctx, comandos);
	}

	@Override
	public void exitBloco(BlocoContext ctx) {
		final List<Comando> cmds = valores.pegue(ctx.seqComando());
		valores.insira(ctx, new Bloco(cmds));
	}

	@Override
	public void exitOpBin(OpBinContext ctx) {
		final Expressao esq = valores.pegue(ctx.expressao(0));
		final Expressao dir = valores.pegue(ctx.expressao(1));
		final String op = ctx.getChild(1).getText();
		final Expressao exp = switch (op) {
			case "**" -> new ExpPotencia(esq, dir);
			case "*" -> new ExpMult(esq, dir);
			case "-" -> new ExpSub(esq, dir);
			case "/" -> new ExpDiv(esq, dir);
			default -> new ExpSoma(esq, dir);
		};
		valores.insira(ctx, exp);
	}

	@Override
	public void exitEnquanto(EnquantoContext ctx) {
		final Bool condicao = valores.pegue(ctx.booleano());
		final Comando comando = valores.pegue(ctx.comando());
		valores.insira(ctx, new Enquanto(condicao, comando));
	}

	@Override
	public void exitELogico(ELogicoContext ctx) {
		final Bool esq = valores.pegue(ctx.booleano(0));
		final Bool dir = valores.pegue(ctx.booleano(1));
		valores.insira(ctx, new ELogico(esq, dir));
	}

	@Override
	public void exitBoolPar(BoolParContext ctx) {
		final Bool booleano = valores.pegue(ctx.booleano());
		valores.insira(ctx, booleano);
	}

	@Override
	public void exitNaoLogico(NaoLogicoContext ctx) {
		final Bool b = valores.pegue(ctx.booleano());
		valores.insira(ctx, new NaoLogico(b));
	}

	@Override
	public void exitExpPar(ExpParContext ctx) {
		final Expressao exp = valores.pegue(ctx.expressao());
		valores.insira(ctx, exp);
	}

	public void exitExiba(ExibaContext ctx) {
		if (ctx.TEXTO() != null) {
			String t = ctx.TEXTO().getText();
			valores.insira(ctx, new Exiba(t.substring(1, t.length() - 1)));
		} else if (ctx.INT() != null) {
			valores.insira(ctx, new Exiba(ctx.INT().getText()));
		} else if (ctx.ID() != null) {
			valores.insira(ctx, new Exiba(ctx.ID().getText()));
		}
	}

	public void exitOpRel(OpRelContext ctx) {
		final Expressao esq = valores.pegue(ctx.expressao(0));
		final Expressao dir = valores.pegue(ctx.expressao(1));
		final String op = ctx.getChild(1).getText();
		final Bool exp = switch (op) {
			case "==" -> new ExpIgual(esq, dir);
			case "<=" -> new ExpMenorIgual(esq, dir);
			case ">=" -> new ExpMaiorIgual(esq, dir);
			case "<" -> new ExpMenor(esq, dir);
			case ">" -> new ExpMaior(esq, dir);
			case "<>" -> new ExpDiferente(esq, dir);
			default -> new ExpIgual(esq, esq);
		};
		valores.insira(ctx, exp);
	}
}
