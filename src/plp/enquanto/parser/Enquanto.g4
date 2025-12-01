grammar Enquanto;

programa : seqComando;     // sequência de comandos

seqComando: (comando PONTOVIRGULA)+ ;

comando: ID (',' ID)* ':=' expressao (',' expressao)*    # atribuicao
       | 'skip'                                          # skip
       | 'se' booleano 'entao' comando ('senaose' comando)* 'senao' comando   # se
       | 'enquanto' booleano 'faca' comando              # enquanto
       | 'exiba' (TEXTO | INT)                                   # exiba
       | 'escreva' expressao                             # escreva
       | 'para' ID 'de' expressao 'ate' expressao 'faca' (comando)+ 
       | 'repita' expressao 'vezes' (comando)+
       | 'escolha' expressao (INT ':' expressao)+ '_' ':' expressao
       | '{' seqComando '}'                              # bloco
       ;

expressao: INT                                           # inteiro
         | 'leia'                                        # leia
         | ID                                            # id
         | expressao ('**' expressao)
         | expressao ('*' | '/') expressao               # opBin
         | expressao ('+' | '-') expressao               # opBin
         | '(' expressao ')'                             # expPar
         ;

booleano: BOOLEANO                                       # bool
        | expressao '=' expressao                        # opRel
        | expressao '<=' expressao                       # opRel
        | expressao '>=' expressao
        | expressao '>' expressao
        | expressao '<' expressao
        | expressao '<>' expressao
        | 'nao' booleano                                 # naoLogico
        | booleano 'e' booleano                          # eLogico
        | booleano 'ou' booleano                         # ouLogico
        | booleano 'xor' booleano
        | '(' booleano ')'                               # boolPar
        ;

BOOLEANO: 'verdadeiro' | 'falso';
INT: ('0'..'9')+ ;
ID: ('a'..'z')+;
TEXTO: '"' .*? '"';

PONTOVIRGULA: ';';


Comentario: '#' .*? '\n' -> skip;
Espaco: [ \t\n\r] -> skip;