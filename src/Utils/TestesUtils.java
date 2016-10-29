package Utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestesUtils {

	@Test
	public void testCompositePS() {
		CompositePS cps = SPintura.getComposite(10f, 70f, 40f, "Servi�o de Tinta");
		
		System.out.println(cps.hierarchy());
	}
	
	@Test
	public void testDirectorIVWithBasicPSs () {
		DirectorItemVenda div = new DirectorItemVenda();
		
		div.initIV(new PTinta(40f, "Tinta Verde-Lim�o Acal"), 4);
		
		// Item Venda ainda n�o imut�vel, mas � assim que se faz.
		ItemVenda iv = div.getItem();
	}
	
	@Test
	public void testDirectorIVWithCompositesAndPSs () {
		DirectorItemVenda div = new DirectorItemVenda();
		
		div.initIV(SPintura.getComposite(10f, 70f, 40f, "Servico top de tinta"), 1);
		
		ItemVenda iv = div.getItem();
	}

}
