package Utils;


public class SPintura extends Servico {
	public SPintura (float precoCoordenar, String info) {
		precoUnidade_ = precoCoordenar;
		info_ = info;
		nome_ = "Pintura";
	}
	
	static public CompositePS getComposite (float precoCoordenar, float precoMaoObra, float precoTinta, String info) {
		SPintura spintura = new SPintura(precoCoordenar, info);
		
		CompositePS cps = new CompositePS(spintura);
		
		SMaoObra psMaoObra = new SMaoObra (precoMaoObra, "");
		cps.add(psMaoObra);
		cps.finish();
		
		PTinta pTinta = new PTinta(precoTinta, "");
		cps.add(pTinta);
		cps.finish();
		
		return cps;
	}
}
