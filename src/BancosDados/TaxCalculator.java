package BancosDados;

import Utils.IRData;
import Utils.Tax;

public class TaxCalculator {
	BDTax bdTax_;
	IRData irData_;
	
	public TaxCalculator() {
		bdTax_ = new BDTax();
		irData_ = new IRData();
	}
	
	// TODO: N�o sei se essa fun��o deveria estar aqui
	private void acceptTax (Tax t) {
		t.visit(irData_);
	}
}
