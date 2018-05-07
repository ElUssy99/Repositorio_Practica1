package exercicisJUnit;

public class NumComplejo {
	private double pReal;
	private double pImaginaria;
	
	public NumComplejo() {
		
	}
	
	public NumComplejo(double pReal, double pImaginaria) {
		this.pReal = pReal;
		this.pImaginaria = pImaginaria;
	}
	
	public NumComplejo sumarComplejos(NumComplejo c1, NumComplejo c2) {
		NumComplejo result = new NumComplejo();
		result.setpReal(c1.getpReal()+c2.getpReal());
		result.setpImaginaria(c1.getpImaginaria()+c2.getpImaginaria());
		return result;
	}
	
	public NumComplejo restarComplejos(NumComplejo c1, NumComplejo c2) {
		NumComplejo result = new NumComplejo();
		result.setpReal(c1.getpReal()-c2.getpReal());
		result.setpImaginaria(c1.getpImaginaria()-c2.getpImaginaria());
		return result;
	}
	
	public NumComplejo multiplicarComplejos(NumComplejo c1, NumComplejo c2) {
		NumComplejo result = new NumComplejo();
		double a = c1.getpReal();
		double b = c1.getpImaginaria();
		double c = c2.getpReal();
		double d = c2.getpImaginaria();
		result.setpReal((a*c)-(b*d));
		result.setpImaginaria((a*d)+(b*c));
		return result;
	}
	
	public NumComplejo dividirComplejos(NumComplejo c1, NumComplejo c2) {
		NumComplejo result = new NumComplejo();
		double a = c1.getpReal();
		double b = c1.getpImaginaria();
		double c = c2.getpReal();
		double d = c2.getpImaginaria();
		
		double dividendoReal = (a*c)-(b*d);
		double dividendoImaginario = (b*c)+(a*d);
		double divisor = (Math.pow(c, 2)+Math.pow(d, 2));
		
		result.setpReal(dividendoReal/divisor);
		result.setpImaginaria((dividendoImaginario/divisor));
		return result;
	}
	public double [] getUnArray(NumComplejo c1) {
		double [] nums = new double [2];
		nums[0] = c1.getpReal();
		nums[1] = c1.getpImaginaria();
		return nums;
	}
	
	public int time() throws InterruptedException {
		Thread.sleep(4000);
		return 1;
	}
	
	public double [] getOtroArray (double [] array) {
		array[0] ++;
		return array;
	}
	
	public boolean esPositivo(double num) {
		if (num > 0)
			return true;
		else
			return false;
	}
	
	public double getpReal() {
		return pReal;
	}

	public void setpReal(double pReal) {
		this.pReal = pReal;
	}

	public double getpImaginaria() {
		return pImaginaria;
	}

	public void setpImaginaria(double pImaginaria) {
		this.pImaginaria = pImaginaria;
	}

}
