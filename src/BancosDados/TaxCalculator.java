package BancosDados;

import Utils.IRData;

public class TaxCalculator {
	BDTax bdTax_;
	IRData irData_;
	
	public TaxCalculator() {
		bdTax_ = new BDTax();
		irData_ = new IRData();
	}
}
