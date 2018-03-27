package com.aflabs.afbot.arithmatic;

public class Fraction extends Number {

	private static final long serialVersionUID = 1L;
	private double numerator;
    private double denominator;

    public Fraction(AflabsNumber numerator, AflabsNumber denominator) {
    	this(numerator.getNumberValue(), denominator.getNumberValue());
    }
    
    public Fraction(double numerator, double denominator) {
        if(denominator == 0) {
            throw new IllegalArgumentException("denominator is zero");
        }
        if(denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(double numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public double getNumerator() {
        return this.numerator;
    }

    public double getDenominator() {
        return this.denominator;
    }

    public byte byteValue() {
        return (byte) this.doubleValue();
    }

    public double doubleValue() {
        return ((double) numerator)/((double) denominator);
    }

    public float floatValue() {
        return (float) this.doubleValue();
    }

    public int intValue() {
        return (int) this.doubleValue();
    }

    public long longValue() {
        return (long) this.doubleValue();
    }

    public short shortValue() {
        return (short) this.doubleValue();
    }

    public boolean equals(Fraction frac) {
        return this.compareTo(frac) == 0;
    }

    public int compareTo(Fraction frac) {
    	double t = this.getNumerator() * frac.getDenominator();
    	double f = frac.getNumerator() * this.getDenominator();
        int result = 0;
        if(t>f) {
            result = 1;
        }
        else if(f>t) {
            result = -1;
        }
        return result;
    }
    
    public String toString(){
    	int num = 0, den = 0;
    	boolean numInt = false, denInt = false;
    	if ((numerator == Math.floor(numerator)) && !Double.isInfinite(numerator)){
    		num = (int)numerator;
    		numInt = true;
    	}
    	if ((denominator == Math.floor(denominator)) && !Double.isInfinite(denominator)){
    		den = (int)denominator;
    		denInt = true;
    	} 
    	
    	return (numInt && denInt)? (num+"/"+den) : (numerator+"/"+denominator);
    }
}