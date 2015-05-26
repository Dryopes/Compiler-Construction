package pp.block4.cc.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

import org.junit.Test;

import pp.iloc.*;
import pp.iloc.eval.Machine;
import pp.iloc.model.OpCode;
import pp.iloc.model.Program;
import pp.iloc.parse.FormatException;

public class IlocTest {
	static private String pathname = "max.iloc";
	
	@Test
	public void test() {
		File file = new File(pathname);
		Assembler ass = Assembler.instance();
		Program p = null;
		try {
			p = ass.assemble(file);
		} catch (FormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
				
		assemblerTest(p);
		try {
			disassemblerTest(ass, p);
		} catch (FormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		simulatorTest(p);
		
	}
	
	private void assemblerTest(Program p) {
		assertEquals(ints(0, 9, 11, 14), p.getRegLines().get("r_max"));
		assertEquals(ints(1, 3, 5, 12), p.getRegLines().get("r_i"));
		assertEquals(ints(2, 3), p.getRegLines().get("r_len"));
		assertEquals(ints(3, 4, 9, 10), p.getRegLines().get("r_cmp"));
		assertEquals(ints(5, 6, 7, 8), p.getRegLines().get("r_a"));
		assertEquals(ints(8), p.getRegLines().get("r_arp"));
		assertEquals(ints(8, 9, 11), p.getRegLines().get("r_ai"));
		
		assertEquals(ints(2), p.getSymbLines().get("alength"));
		assertEquals(ints(7), p.getSymbLines().get("a"));
		
		assertEquals(p.getOpAt(0).getOpCode(), OpCode.loadI);
		assertEquals(p.getOpAt(3).getOpCode(), OpCode.cmp_LT);
		assertEquals(p.getOpAt(4).getOpCode(), OpCode.cbr);
		assertEquals(p.getOpAt(5).getOpCode(), OpCode.i2i);
		assertEquals(p.getOpAt(6).getOpCode(), OpCode.multI);
		assertEquals(p.getOpAt(7).getOpCode(), OpCode.addI);
		assertEquals(p.getOpAt(8).getOpCode(), OpCode.loadAO);
		assertEquals(p.getOpAt(9).getOpCode(), OpCode.cmp_GT);
		assertEquals(p.getOpAt(13).getOpCode(), OpCode.jumpI);
		assertEquals(p.getOpAt(14).getOpCode(), OpCode.out);
	}
	
	private void disassemblerTest(Assembler a, Program p) throws FormatException {
		Program dis = a.assemble(p.prettyPrint());
		assertEquals(p, dis);
	}
	
	private void simulatorTest(Program p) {
		Machine m = new Machine();
		int arraylength = 10;
		int[] array = new int[arraylength];
		Random rand = new Random();
		Integer max = null;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt();
			if(max == null) max = array[i];
			else if(array[i] > max) max = array[i];
		}
		
		m.setNum("alength", arraylength);
		m.init("a", array);		
		new Simulator(p, m).run();
		
		assertTrue(m.getReg("r_max") == max);
	}

	private HashSet<Integer> ints(Integer... vals) {
		return new HashSet<>(Arrays.asList(vals));
	}
}
