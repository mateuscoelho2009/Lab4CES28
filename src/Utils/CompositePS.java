package Utils;

import java.util.List;
import java.util.ArrayList;

public class CompositePS extends PS {
	public static final int NODE_FINISHED = 0;
	public static final int NODE_NOT_FINISHED = 1;
	
	List <CompositePS> childPS_ = new ArrayList<CompositePS>();
	PS value_ = null;
	CompositePS atuConstructPS_ = null;
	
	CompositePS (PS v) throws NullPointerException {
		if (v == null)
			throw new NullPointerException();
		
		value_ = v;
	}
	
	// Função padrão de PS's
	
	
	public void add (PS nChild) {
		if (atuConstructPS_ != null) {
			atuConstructPS_.add(nChild);
		}
		else {
			atuConstructPS_ = new CompositePS(nChild);
			childPS_.add(atuConstructPS_);
		}
	}
	
	public int finish () {
		if (atuConstructPS_ != null) {
			int i = atuConstructPS_.finish();
			
			if (i == 0) // Acabou a construção do nó.
				atuConstructPS_ = null;
			
			return NODE_NOT_FINISHED;
		}
		else {
			return NODE_FINISHED;
		}
	}
}
