UTDLang--
================
A truly subpar language just for UTD!
================
Grammar:

Script := Routines Main\
Routines := Routine Routines\
         | λ\
Routine := id Ins Outs start Body end\
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