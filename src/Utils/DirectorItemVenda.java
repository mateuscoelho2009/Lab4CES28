package Utils;

public class DirectorItemVenda {
	private ProtoIV piv_ = null;
	
	public void initIV (PS v, int quantidade) {
		piv_ = new ProtoIV(v, quantidade);
	}
	
	public void addPS (PS v) throws NullPointerException {
		if (piv_ == null)
			throw new NullPointerException();
		
		piv_.add(v);
	}
	
	public void finishNode () throws NullPointerException {
		if (piv_ == null) {
			throw new NullPointerException();
		}
		
		piv_.finishNode();
	}
	
	public ItemVenda getItem () {
		ItemVenda iv = new ItemVenda(piv_);
		
		piv_ = null;
		
		return iv;
	}
}
