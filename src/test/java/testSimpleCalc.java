import static org.junit.Assert.*;

import org.junit.Test;

public class testSimpleCalc {
	@Test
	public void testaddfunc() {
		SimpleCalc calc = new SimpleCalc();
		calc.addfunc(10, 20);
		assertEquals(30, calc.getResult());
	}
	
	@Test
	public void testsubfunc() {
		SimpleCalc calc = new SimpleCalc();
		calc.subfunc(10, 20);
		assertEquals(-10, calc.getResult());
	}
	
	@Test
	public void testmulfunc() {
		SimpleCalc calc = new SimpleCalc();
		calc.mulfunc(10, 20);
		assertEquals(200, calc.getResult());
	}
	
	@Test
	public void testdivfunc() {
		SimpleCalc calc = new SimpleCalc();
		calc.divfunc(200, 10);
		assertEquals(20, calc.getResult());
	}
}
