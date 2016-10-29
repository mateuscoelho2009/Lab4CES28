package Utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestesUtils {

	@Test
	public void testCompositePS() {
		CompositePS cps = SPintura.getComposite(10f, 70f, 40f, "Serviço de Tinta");
		
		System.out.println(cps.hierarchy());
	}

}
