package pp.block3.cc.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import pp.block3.cc.piet.PietLexer;
import pp.block3.cc.piet.PietParser;
import pp.block3.cc.tabular.TabularLexer;
import pp.block3.cc.tabular.TabularParser;

public class TabularTest {
	
	@Test
	public void tabTests(){
		runTest("tabular-1.tex");
		runTest("tabular-2.tex");
		runTest("tabular-3.tex");
	}
	
	public void runTest(String fileName){
		ParseTree tree = parseTable(fileName);
	}

	private ParseTree parseTable(String fileName) {
		CharStream charstream;
		try {
			FileReader filereader = new FileReader(fileName);
			charstream = new ANTLRInputStream(filereader);
			Lexer lexer = new TabularLexer(charstream);
			TokenStream tokens = new CommonTokenStream(lexer);
			TabularParser parser = new TabularParser(tokens);
			return parser.latex();	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
