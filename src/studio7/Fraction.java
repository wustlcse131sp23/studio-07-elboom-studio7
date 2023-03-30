package studio7;

public class Fraction {

	private double numerator = 0.0;
	private double denominator = 0.0;
	
	public Fraction (double top, double bottom) {
		numerator = top;
		denominator = bottom;
	}
	public double getNumerator() {
		return this.numerator;
	}
	public double getDenominator() {
		return this.getDenominator();
	}
	
	public double commonD(Fraction r) {
		return this.getDenominator() * r.getDenominator();
	}
	
	public Fraction sum () {
		Fraction uno = new Fraction (3.0, 5.0);
		Fraction dos = new Fraction (2.0, 12.0);
		double first = uno.getNumerator() * uno.commonD(dos);
		double second = dos.getNumerator() * dos.commonD(dos);
		Fraction tres = new Fraction (4.0, 7.0);
		return tres;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
