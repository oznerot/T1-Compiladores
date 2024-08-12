lexer grammar Lalex;

PALAVRA_CHAVE: 'algoritmo' | 'declare' | 'literal' | 'inteiro' | 'leia' | 'escreva' | 'fim_algoritmo' |
 ':' | '(' | ')' | ',' | '/' | 'real' | 'tipo' | 'ou' | 'e' | 'se' | 'entao' | 'senao' | 'fim_se' | 'nao'
| 'funcao' | 'retorne' | 'fim_funcao' | 'enquanto' | 'fim_enquanto' | 'falso' | 'verdadeiro'
| 'para' | 'ate' | 'faca' | 'fim_para' | 'procedimento' | 'fim_procedimento' | 'registro' | 'fim_registro' |
'caso' | 'fim_caso' | 'seja' | 'leia' | 'escreva' | 'logico' | 'var' | 'constante' |
'<=' | '>=' | '=' | '<' | '<>' | '>' | '^' | '&' | '[' | ']' | '+' | '-' | '..' | '*' | '%' | ':' | '.' | '(' | ')' 
| ',' | '/' | '<-' ;

NUM_INT: '0' | ('1'..'9')('0'..'9')* ;

NUM_REAL: ('0'..'9')+ ('.'('0'..'9')+)? ;

CADEIA: '"' ~('\n' | '"') '"' ;

WS: (' ' | '\t' | '\r' | '\n') -> skip;

IDENT: LETRA (LETRA | DIGITO | '_')*;

//  Comentarios na Linguagen Algoritmica começam e terminam com {} e
//  pode possuir qualquer caractere dentro excetro \n

COMENTARIO: '{' .* '}' -> skip;

ERRO_CADEIA: '"' ~('\n'|'"')* '\n';

ERRO_COMENTARIO: '{' ~('\n'|'}')* '\n';

NAO_RECONHECIDO: '~' | '}' | '$';

fragment
LETRA: ('a'..'z') | ('A'..'Z');

fragment
DIGITO: ('0'..'9');