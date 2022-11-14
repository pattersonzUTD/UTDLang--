JAVA=java
JAVAC=javac
JFLEX=$(JAVA) -jar jflex-full-1.8.2.jar
CUPJAR=./java-cup-11b.jar
CUP=$(JAVA) -jar $(CUPJAR)
CP=.:$(CUPJAR)

default: run

.SUFFIXES: $(SUFFIXES) .class .java

.java.class:
		$(JAVAC) -cp $(CP) $*.java

FILE=    Lexer.java parser.java sym.java\
	LexerTest.java ScannerTest.java TypeCheckingTest.java Token.java Program.java BinExpr.java\
	UnaryExpr.java OperandExpr.java Statement.java\
	AssignmentStmt.java ReadStmt.java WriteStmt.java CallStmt.java WhenStmt.java\
	IDList.java Body.java VarStmtList.java Variable.java MainRoutine.java Routine.java\
	InOut.java InOutList.java InParam.java OutParam.java SymbolTable.java UTDLangException.java Pair.java

run: sampleFile.utd

all: Lexer.java parser.java $(FILE:java=class)

sampleFile.utd: all
		$(JAVA) -cp $(CP) TypeCheckingTest sampleFile.utd 2> sampleFile-output.txt
		cat sampleFile.utd
		cat -n sampleFile-output.txt

test.utd: all
		$(JAVA) -cp $(CP) TypeCheckingTest test.utd 2> test-output.txt
		cat test.utd
		cat -n test-output.txt\

clean:
		rm -f *.class *~ *.bak Lexer.java parser.java sym.java

Lexer.java: tokens.jflex
		$(JFLEX) tokens.jflex

parser.java: grammar.cup
		$(CUP) -interface < grammar.cup

parserD.java: grammar.cup
		$(CUP) -interface -dump < grammar.cup

