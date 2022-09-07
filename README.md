UTDLang--
================
A truly subpar language just for UTD!
================
Grammar:

Script := Routines Main\
Routines := Routine Routines\
&emsp;       | λ\
Routine := ID Ins Outs start Body end\
Ins := in : ID ( Type ) Ins\
&emsp;    | λ\
Outs := out : ID ( Type ) Outs\
&emsp;    | λ\
Type := number\
&emsp;     | string\
&emsp;     | flag\
Main := main start Body end\
Body := Variables Statements\
Variables := Variable Variables\
&emsp;          | λ\
Variable := ID ( Type ) :)\
Statements := Statement Statements\
&emsp;           | λ\ 
Statement := ID <- Expression :)\
&emsp;          | read ( ID ) :)\
&emsp;          | write ( ID ) :)\
&emsp;          | call ID ( IdList ) :)\
&emsp;          | when Expression do Statements done :)\
IdList := ID IdList\
&emsp;         | λ\
Expression := NumericalExpression\
&emsp;           | StringExpression\
&emsp;           | FlagExpression
NumericalExpression := NUMBER\
&emsp;                    | ID\
&emsp;                    | NumericalExpression + NumericalExpression\
&emsp;                    | NumericalExpression - NumericalExpression\
&emsp;                    | NumericalExpression * NumericalExpression\
&emsp;                    | NumericalExpression / NumericalExpression\
StringExpression := STRING\
&emsp;                 | ID\
&emsp;                 | StringExpression + StringExpression\
FlagExpression := up\
&emsp;               | down\
&emsp;               | ID\
&emsp;               | flip FlagExpression\
&emsp;               | FlagExpression + FlagExpression\
&emsp;               | FlagExpression * FlagExpression\
&emsp;               | NumericalExpression ? NumericalExpression\
___

Language Features:\
\
IDs are strictly numerical characters, upper or lower case is fine\
\
Strings start with a " and end with a ", they cannot contain any new lines or tab characters\
To include a " character, it can be escaped with \", Similarly, \ can be escaped with \\ \
When two strings are added together, it concatenates them.\
\
Numbers are strictly integers, when division occurs, values are truncated\
\
Flags can either be up or down as a binary value\
If two flags are added, it is an 'or' expression, if they are multiplied it is an 'and' expression.\
The ? symbol represents greater than or equal to. It is the only comparator operation needed.\
