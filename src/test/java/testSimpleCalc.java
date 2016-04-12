import static org.junit.Assert.*;

import org.junit.Test;

public class testSimpleCalc {
	@Test
	public void testaddfunc() {
		SimpleCalc calc = new SimpleCalc();
		calc.addfunc(10, 20);
		assertEquals(30, calc.getResult());
	}
}
