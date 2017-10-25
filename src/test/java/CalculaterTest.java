import junit.framework.TestCase;
import static org.junit.Assert.*;

public class CalculaterTest extends TestCase {
	Calculater obj;
	int x,y;
	
	protected void setUp() throws Exception {
		
		x=3;
		y=4;
		obj = new Calculater();
	}
	public void testAdd() {
		assertEquals(7, obj.add(x, y));
	}
	
	public void testSubtract(){
		assertEquals(-1, obj.subtract(x, y));
	}
	
	protected void tearDown() throws Exception {
		x=0;
		y=0;
	}

}
