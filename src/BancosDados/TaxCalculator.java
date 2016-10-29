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
	
	// TODO: Não sei se essa função deveria estar aqui
	private void acceptTax (Tax t) {
		t.visit(irData_);
	}
}
