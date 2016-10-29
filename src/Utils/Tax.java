package Utils;

public abstract class Tax implements Visitor {	
	protected float aliquote = 100f; // Facilmente modificável. é a alíquota default.
	protected IRData historyTaxes;
	
	@Override
	public void visit(IRData data) {
		historyTaxes = data;
	}
}
