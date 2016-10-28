package BancosDados;

public class BDFacade {
	private BDProdServ bdps_;
	private BDNotaFiscal bdnf_;
	private TaxCalculator taxCalc_;
	
	private BDFacade instance = null;

	private BDFacade() {
		bdps_ = new BDProdServ();
		bdnf_ = new BDNotaFiscal();
		taxCalc_ = new TaxCalculator();
	}
	
	public BDFacade getInstance () {
		if (instance == null) {
			instance = new BDFacade();
			return instance;
		}
		else {
			return null;
		}
	}

}
