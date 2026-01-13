grammar Enquanto;

programa: seqComando;

seqComando: (comando PONTOVIRGULA)+;

comando:
	ID (',' ID)* ':=' expressao (',' expressao)*	# atribuicao
	| 'skip'										# skip
	| 'se' booleano 'entao' comando (
		'senaose' booleano 'entao' comando
	)* 'senao' comando												# se
	| 'enquanto' booleano 'faca' comando							# enquanto
	| 'escreva' expressao											# escreva
	| 'para' ID 'de' expressao 'ate' expressao 'faca' (comando)+	# iteracao
	| 'repita' expressao 'vezes' (comando)+							# iteracao2
	| 'escolha' ID (INT ':' comando)+ '_' ':' comando				# switchcase
	| '{' seqComando '}'											# bloco
	| 'exiba' (TEXTO | INT | ID)									# exiba;

expressao:
	INT									# inteiro
	| 'leia'							# leia
	| ID								# id
	| expressao ('**' expressao)		# opBin
	| expressao ('*' | '/') expressao	# opBin
	| expressao ('+' | '-') expressao	# opBin
	| '(' expressao ')'					# expPar;

booleano:
	BOOLEANO					# opRel
	| expressao '==' expressao	# opRel
	| expressao '<=' expressao	# opRel
	| expressao '>=' expressao	# opRel
	| expressao '>' expressao	# opRel
	| expressao '<' expressao	# opRel
	| expressao '<>' expressao	# opRel
	| 'nao' booleano			# naoLogico
	| booleano 'e' booleano		# eLogico
	| booleano 'ou' booleano	# ouLogico
	| booleano 'xor' booleano	# xor
	| '(' booleano ')'			# boolPar;

BOOLEANO: 'verdadeiro' | 'falso';
INT: ('0' ..'9')+;
ID: ('a' ..'z')+;
TEXTO: '"' .*? '"';

PONTOVIRGULA: ';';

Comentario: '#' .*? '\n' -> skip;
Espaco: [ \t\n\r] -> skip;