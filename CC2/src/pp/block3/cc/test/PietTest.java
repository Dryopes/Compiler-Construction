package pp.block3.cc.test;

import static org.junit.Assert.assertEquals;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Text;

import pp.block3.cc.antlr.Type;
import pp.block3.cc.piet.PietAttrLexer;
import pp.block3.cc.piet.PietAttrParser;
import pp.block3.cc.piet.PietAttrParser.PietContext;
import pp.block3.cc.piet.PietLexer;
import pp.block3.cc.piet.PietParser;
import pp.block3.cc.piet.Pietenator;

public class PietTest {

	class Expected {
		
		public Expected() {this.t = Type.ERR;}
		public Expected(String s) {this.s = s; this.t = Type.STR;}
		public Expected(int i) {this.i = i; this.t = Type.NUM;}
		public Expected(boolean b){this.b = b; this.t = Type.BOOL;}
		
		public Type t;
		public Integer i;
		public Boolean b;
		public String s;
	}
	
	@Test
	public void test() {
		test(new Expected(1024), "2^(9+1)");
		test(new Expected(513), "2^9+1");
		test(new Expected(5), "2+3");
		test(new Expected("janappel"), "jan+appel");
		test(new Expected("janjanjanjan"), "jan^4");
		
		test(new Expected(true), "true+false");
		test(new Expected(true), "jan=jan");
		test(new Expected(true), "(2+2)=4");
		test(new Expected(true), "true=true");
		test(new Expected(false), "jan=piet");
		test(new Expected(false), "(2+2)=5");
		test(new Expected(false), "true=false");		
		
		test(new Expected(), "true^5");
		test(new Expected(), "23+jan");
		test(new Expected(), "true+jan");
		test(new Expected(), "23+false");
	}

	private void test(Expected e, String expr) {
		ParseTree tree = parsePiet(expr);
		piet.init();
		walker.walk(piet, tree);
		
		assertEquals(e.t, parsePietAttr(expr).type);
		assertEquals(e.t, piet.type(tree));
		
		if(e.t == Type.BOOL) {
			assertEquals(e.b, parsePietAttr(expr).bval);
			assertEquals(e.b, piet.bval(tree));
		}
		else if(e.t == Type.NUM) {
			assertEquals(e.i, (Integer)parsePietAttr(expr).ival);
			assertEquals(e.i, piet.ival(tree));
		}
		else if(e.t == Type.STR) {
			assertEquals(e.s, parsePietAttr(expr).sval);
			assertEquals(e.s, piet.sval(tree));
		}
	}

	private final ParseTreeWalker walker = new ParseTreeWalker();
	private final Pietenator piet = new Pietenator();

	private ParseTree parsePiet(String text) {
		CharStream chars = new ANTLRInputStream(text);
		Lexer lexer = new PietLexer(chars);
		TokenStream tokens = new CommonTokenStream(lexer);
		PietParser parser = new PietParser(tokens);
		return parser.piet();
	}

	private PietContext parsePietAttr(String text) {
		CharStream chars = new ANTLRInputStream(text);
		Lexer lexer = new PietAttrLexer(chars);
		TokenStream tokens = new CommonTokenStream(lexer);
		PietAttrParser parser = new PietAttrParser(tokens);
		return parser.piet();
	}
}
