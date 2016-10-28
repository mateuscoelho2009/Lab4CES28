package Utils;

public class ProtoIV {
	CompositePS cps_;
	int quantidade_;
	
	public ProtoIV (PS v, int quantidade) {
		cps_ = new CompositePS(v);
		quantidade_ = quantidade;
	}
	
	public void add (PS nChild) {
		cps_.add(nChild);
	}
	
	public void finishNode () {
		cps_.finish();
	}
	
	public void finish () {
		int i = CompositePS.NODE_NOT_FINISHED;
		
		while (i == CompositePS.NODE_NOT_FINISHED) {
			i = cps_.finish();
		}
	}
}
