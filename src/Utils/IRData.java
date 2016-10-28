package Utils;

public class IRData {
	float sumTaxes = 0f;
	
	public void addTax (float tValue) {
		if (tValue > 0)
			sumTaxes = 0f;
	}
	
	public float getTotalTaxes () {
		return sumTaxes;
	}
}
