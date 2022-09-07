UTDLang--
================
A truly subpar language just for UTD!
================
Grammar:

Script := Routines Main\
Routines := Routine Routines\
         | λ\
Routine := ID Ins Outs start Body end\
Ins := in : ID ( Type ) Ins\
    | λ\
Outs := out : ID ( Type ) Outs\
    | λ\
Type := number\
     | string\
     | flag\
Main := main start Body end\
Body := Variables Statements\
Variables := Variable Variables\
          | λ\
Variable := ID ( Type ) :)\
Statements := Statement Statements\
           | λ\ 
Statement := ID <- Expression :)\
          | read ( ID ) :)\
          | write ( ID ) :)\
          | call ID ( IdList ) :)\
          | when Expression do Statements done :)\
Expression := NumericalExpression\
           | StringExpression\
           | FlagExpression
NumericalExpression := NUMBER\
                    | ID\
                    | NumericalExpression + NumericalExpression\
                    | NumericalExpression - NumericalExpression\
                    | NumericalExpression * NumericalExpression\
                    | NumericalExpression / NumericalExpression\
StringExpression := STRING\
                 | ID\
                 | StringExpression + StringExpression\
FlagExpression := up\
               | down\
               | ID\
               | flip FlagExpression\
               | FlagExpression + FlagExpression\
               | FlagExpression * FlagExpression\
               | NumericalExpression ? NumericalExpression\
================
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
