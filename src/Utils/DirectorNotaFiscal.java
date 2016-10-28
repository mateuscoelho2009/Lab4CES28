package Utils;

public class DirectorNotaFiscal {
	private NotaFiscal nf_ = null;
	private DirectorItemVenda directorIV_ = null;
	
	public DirectorNotaFiscal() {
		initNotaFiscal();
	}
	
	public void initNotaFiscal () {
		nf_ = new NotaFiscal();
		directorIV_ = new DirectorItemVenda();
	}
	
	public void newIV (PS prodserv, int quantidade) {
		directorIV_.initIV(prodserv, quantidade);
	}
	
	public void addNodePS (PS v) {
		directorIV_.addPS(v);
	}
	
	public void finishNodePS () {
		directorIV_.finishNode();
	}
	
	public void finishIV () {
		nf_.add(directorIV_.getItem());
	}
	
	public NotaFiscal getNotaFiscal () {
		NotaFiscal temp = nf_;
		
		nf_ = null;
		
		return temp;
	}
}
