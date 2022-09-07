/*-***
 *
 * This file defines a stand-alone lexical analyzer for a subset of the Pascal
 * programming language.  This is the same lexer that will later be integrated
 * with a CUP-based parser.  Here the lexer is driven by the simple Java test
 * program in ./PascalLexerTest.java, q.v.  See 330 Lecture Notes 2 and the
 * Assignment 2 writeup for further discussion.
 *
 */


import java_cup.runtime.*;


%%
/*-*
 * LEXICAL FUNCTIONS:
 */

%cup
%line
%column
%unicode
%class Lexer

%{

/**
 * Return a new Symbol with the given token id, and with the current line and
 * column numbers.
 */
Symbol newSym(int tokenId) {
    return new Symbol(tokenId, yyline, yycolumn);
}

/**
 * Return a new Symbol with the given token id, the current line and column
 * numbers, and the given token value.  The value is used for tokens such as
 * identifiers and numbers.
 */
Symbol newSym(int tokenId, Object value) {
    return new Symbol(tokenId, yyline, yycolumn, value);
}

%}


/*-*
 * PATTERN DEFINITIONS:
 */
number = -?[0-9]+
id = [a-zA-Z]+
letter = [[[^\n]&&[^\t]]&&[[^\\][^\"]]]|\\\\|\\\"
string = \"{letter}*\"
whitespace = [ \n\t\r]



%%
/**
 * LEXICAL RULES:
 */
start           {return newSym(sym.START, "start");}
end             {return newSym(sym.END, "end");}
{id}            {return newSym(sym.ID, yytext());}
in              {return newSym(sym.IN, "in");}
out             {return newSym(sym.OUT, "out");}
"("             {return newSym(sym.LPAREN, "(");}
")"             {return newSym(sym.RPAREN, ")");}
":"             {return newSym(sym.COLON, ":");}
number          {return newSym(sym.NUMBER, "number");}
string          {return newSym(sym.STRING, "string");}
flag            {return newSym(sym.FLAG, "flag");}
main            {return newSym(sym.MAIN, "main");}
":)"            {return newSym(sym.SMILE, ":)");}
"<-"            {return newSym(sym.ASSIGN, "<-");}
read            {return newSym(sym.READ, "read");}
write           {return newSym(sym.WRITE, "write");}
call            {return newSym(sym.CALL, "call");}
when            {return newSym(sym.WHEN, "when");}
do              {return newSym(sym.DO, "do");}
done            {return newSym(sym.DONE, "done");}
{number}        {return newSym(sym.NUMBERLIT, yytext());}
"+"             {return newSym(sym.PLUS, "+");}
"-"             {return newSym(sym.MINUS, "-");}
"*"             {return newSym(sym.MULTIPLY, "*");}
"/"             {return newSym(sym.DIVIDE, "/");}
{string}        {return newSym(sym.STRINGLIT, yytext());}
up              {return newSym(sym.UP, "up");}
down            {return newSym(sym.DOWN, "down");}
flip            {return newSym(sym.FLIP, "flip");}
"?"             {return newSym(sym.QUESTION, "?");}
{whitespace}    { /* Ignore whitespace. */ }
.               { System.out.println("Illegal char, '" + yytext() +
                    "' line: " + yyline + ", column: " + yychar); } 