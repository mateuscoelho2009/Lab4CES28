package Utils;

public class ProtoIV {
	CompositePS cps;
	
	public ProtoIV (PS v) {
		cps = new CompositePS(v);
	}
	
	public void add (PS nChild) {
		cps.add(nChild);
	}
	
	public void finishNode () {
		cps.finish();
	}
	
	public void finish () {
		int i = CompositePS.NODE_NOT_FINISHED;
		
		while (i == CompositePS.NODE_NOT_FINISHED) {
			i = cps.finish();
		}
	}
}
