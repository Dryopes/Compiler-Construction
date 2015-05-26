package pp.block4.cc.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import pp.iloc.Assembler;
import pp.iloc.Simulator;
import pp.iloc.eval.Machine;
import pp.iloc.model.Program;
import pp.iloc.parse.FormatException;

@SuppressWarnings("javadoc")
public class FibTest {
	
	@Test
	public void testFib() {
		int testlength = 46; //Na 46 komt overflow errorzz
		
		Program progReg = parse("fib_reg");
		Program progMem = parse("fib_mem");
		
		for(int i = 0; i < testlength; i++) {
			Machine machReg = new Machine();
			machReg.setNum("n", i);
			
			Machine machMem = new Machine();
			machMem.init("mem", new int[]{i, 1, 1, 1});
			
			new Simulator(progReg, machReg).run();
			new Simulator(progMem, machMem).run();
			
			assertEquals(machMem.getReg("r_tmp"), machReg.getReg("r_z"));
		}
	}
	
	@Test(timeout = 1000)
	public void test_fibreg() {
		Program p = parse("fib_reg");
		Machine c = new Machine();
		c.setNum("n", 10);
		
		new Simulator(p, c).run();
		if (SHOW) {
			System.out.println(c);
		}
		assertEquals(89, c.getReg("r_z"));
	}
	
	@Test(timeout = 1000)
	public void test_fibmem() {
		Program p = parse("fib_mem");
		Machine c = new Machine();
		c.init("mem", new int[]{10, 1, 1, 1});
		
		new Simulator(p, c).run();
		if (SHOW) {
			System.out.println(c);
		}
		assertEquals(89, c.getReg("r_tmp"));
	}

	Program parse(String filename) {
		File file = new File(filename + ".iloc");
		if (!file.exists()) {
			file = new File(BASE_DIR + filename + ".iloc");
		}
		try {
			return Assembler.instance().assemble(file);
		} catch (FormatException | IOException e) {
			fail(e.getMessage());
			return null;
		}
	}

	private final static String BASE_DIR = "src/pp/block4/cc/iloc/";
	private final static boolean SHOW = true;
}
