package pp.block3.cc.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;

import static org.junit.Assert.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import pp.block3.cc.symbol.DaUseListener;
import pp.block3.cc.symbol.DeclUseLexer;
import pp.block3.cc.symbol.DeclUseParser;
import pp.block3.cc.symbol.DeclUseParser.ProgramContext;

public class DeclUseListenerTest {

	
	
	@Test
	public void test(){	
		test(3, new File("test1.test"));
		test(0, new File("test2.test"));
		test(5, new File("test3.test"));
		test(2, new File("test4.test"));
		test(1, new File("test5.test"));
		
	}
	
	private void test(int n, File file){
		DaUseListener listener = new DaUseListener();
		ParseTreeWalker walker = new ParseTreeWalker();
		try{
			ProgramContext pc = parseDeclUse(file);
			walker.walk(listener, pc);
			
			assertEquals(n, listener.getErrors().size());
			
		} catch (IOException e ) {
			e.printStackTrace();
		}
	}
	
	
	private ProgramContext parseDeclUse(File file) throws IOException {
		FileReader filereader = new FileReader(file);
		CharStream chars = new ANTLRInputStream(filereader);
		Lexer lexer = new DeclUseLexer(chars);
		TokenStream tokens = new CommonTokenStream(lexer);
		DeclUseParser parser = new DeclUseParser(tokens);
		return parser.program();
	}
}
