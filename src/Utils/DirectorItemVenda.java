package Utils;

public class DirectorItemVenda {
	private ProtoIV piv_ = null;
	
	public void initIV (PS v) {
		piv_ = new ProtoIV(v);
	}
	
	public void addPS (PS v) {
		if (piv_ == null)
			initIV(v);
		
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
