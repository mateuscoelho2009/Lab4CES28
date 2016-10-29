package Utils;

public class Produto extends PS {
	protected String nome_;
	protected float precoUnidade_;
	protected String natureza_;
	// TODO: Categoria Tributária!!
	
	@Override
	public String toString () {
		return nome_ + ": " + natureza_ + " por " + precoUnidade_;
	}
}
