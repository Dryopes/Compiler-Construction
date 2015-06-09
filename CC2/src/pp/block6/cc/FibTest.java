package pp.block6.cc;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import org.junit.Test;

import pp.iloc.Assembler;
import pp.iloc.Simulator;
import pp.iloc.eval.Machine;
import pp.iloc.model.Program;
import pp.iloc.parse.FormatException;

public class FibTest {
	static private String pathname = "src/pp/block6/cc/fib.iloc";
	//static private String input = "20";
	
	@Test
	public void test() throws FormatException, IOException {
		File file = new File(pathname);
		Program prog = Assembler.instance().assemble(file);
		
		for(int i = 0; i <= 20; i++) {
			String input = "" + i;
			
			Simulator sim = new Simulator(prog);
			sim.setIn(new ByteArrayInputStream(input.getBytes()));
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			sim.setOut(out);
			sim.run();
			
			int fibOut = Integer.parseInt(out.toString().replaceAll("\\s+",""));
			int fibControl = fib(Integer.parseInt(input));
			
			System.out.println("Input: " + input + "\tout: " + fibOut + "\tControl: " + fibControl);
			assertEquals(fibOut, fibControl);		
		}
	}
	
	private int fib(int n) {
		int x = 1;
		int y = 1;
		int z = 1;
		while(n > 1) {
			z = x + y;
			x = y;
			y = z;
			n = n - 1;
		}
		return z;
	}
}
