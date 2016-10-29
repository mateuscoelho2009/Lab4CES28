package Utils;

public class Servico extends PS {
	protected String nome_;
	protected float precoUnidade_;
	protected String info_;
	// TODO: Categoria Tributária!!
	
	@Override
	public String toString () {
		return nome_ + ": " + info_ + " por " + precoUnidade_;
	}
}
