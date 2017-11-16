import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class testeTest {

	@Test
	public void test() {
		classe1 c1 = new classe1("Maria");
		assertEquals(c1.getName(),"Maria");
/*		Assert.assertTrue(c1.getName() == "J");*/
	}

}
