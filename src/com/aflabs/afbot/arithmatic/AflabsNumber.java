package com.aflabs.afbot.arithmatic;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class AflabsNumber {
	
	public Number number;	
	public String stringRep;	
	public double numberValue;
	public int floorInt;
	public double decimalValue;
	public boolean isFraction;
	public boolean isInteger;
	public boolean isZero;
	public boolean isNegative;
	public boolean isReal;
	public boolean isRational;
	public boolean isEven;
	
	public boolean implicationsDrawn = false;
	public boolean specialImplicationsDrawn = false;	
		
	//implications
	public int noOfDigits;
	public Integer[] digits;
	public int noOfDecimalDigits;
	public Integer[] decimalDigits;	
	
	//special implications
	public boolean isPerfectSquare;
	public boolean isPerfectCube;
	public boolean isPrime;
	public boolean isPerfectNumber;
	//special implications - divisibility rules
	public boolean isDivisibleBy3;
	public boolean isDivisibleBy5;
	public boolean isDivisibleBy7;
	public boolean isDivisibleBy10;
	
		
	public AflabsNumber(Number number){
		this.number = number;
		this.stringRep = number.toString();
		this.numberValue = number.doubleValue();		
		
		this.isFraction = (number instanceof Fraction)? true:false;
		this.isInteger = (this.numberValue % 1 == 0)? true:false;
		this.isZero = (this.numberValue == 0)? true:false;
		this.isNegative = (this.numberValue < 0)? true:false;
		this.isReal = true;
		
		if (!isInteger){
			this.floorInt = Double.valueOf(this.numberValue).intValue();
			this.decimalValue = this.numberValue - this.floorInt;
		}
		
		System.out.println("Original Number : " + this.number + " : " + this.stringRep + " : " + this.numberValue);
	}
	
	public AflabsNumber(String stringRep){
		this.stringRep = stringRep;
		double tempDouble;		
		if (stringRep.indexOf("/") == -1){
			tempDouble = Double.parseDouble(stringRep);			
			if ((tempDouble == Math.floor(tempDouble)) && !Double.isInfinite(tempDouble))
				this.number = (stringRep.indexOf(".") != -1)?
								Integer.parseInt(stringRep.substring(0,stringRep.indexOf("."))):
									Integer.parseInt(stringRep);
			else
				this.number = tempDouble;			
		} else {
			StringTokenizer st = new StringTokenizer(stringRep, "/");
			this.number = new Fraction(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			this.isFraction = true;
		}
		this.numberValue = number.doubleValue();
		System.out.println("Original Number : " + this.number + " : " + this.stringRep + " : " + this.numberValue);
	}
	
	public static void main(String args[]){
		AflabsNumber num = new AflabsNumber(new Fraction(2,3.52));
		num = new AflabsNumber(new Fraction(new AflabsNumber(new Fraction(2,3.52)),new AflabsNumber(new Fraction(2,3.52))));
		num = new AflabsNumber(new Fraction(12,36));
		num = new AflabsNumber(new Fraction(1234.4567));
		num = new AflabsNumber(new Fraction(1234));		
		num = new AflabsNumber(-1234.4567);		
//		num = new AflabsNumber(0.4567);		
//		num = new AflabsNumber(new Fraction(1,-3));	
//		num = new AflabsNumber("16/8");		
//		num = new AflabsNumber(new Fraction(Math.sqrt(2)));
		
		System.out.println("Int val : " + num.getFloorInt());
		System.out.println("Int val : " + num.getDecimalValue());
		
//		AflabsNumber num1 = new AflabsNumber(3/2);
//		System.out.println("num.number.doubleValue() : " + num1.origNumber.doubleValue());
//		System.out.println("num.number.doubleValue() : " + num1.origNumber.byteValue());
//		System.out.println("num.number.doubleValue() : " + num1.origNumber.floatValue());
//		System.out.println("num.number.doubleValue() : " + num1.origNumber.intValue());
//		System.out.println("num.number.doubleValue() : " + num1.origNumber.longValue());
//		System.out.println("num.number.doubleValue() : " + num1.origNumber.shortValue());
//		
//		int temp = num.origNumber.intValue();
//		ArrayList<Integer> array = new ArrayList<Integer>();
//		do{
//		    array.add(temp % 10);
//		    temp /= 10;
//		} while  (temp > 0);
//		
//		System.out.println("num.number.doubleValue() : " + array);
//		
//		Double d = num.origNumber.doubleValue();
//		Long l = num.origNumber.longValue();
//		
//		double x = d - Math.floor(d);
//		double x1 = l - (long) l;
//		
//		System.out.println("num.number.doubleValue() : " + x);
//		System.out.println("num.number.doubleValue() : " + x1);
//		
//		double d1= 234.12413;
//		String text = Double.toString(d1);
//		int integerPlaces = text.indexOf('.');
//		int decimalPlaces = text.length() - integerPlaces - 1;
//		
//		System.out.println("num.number.doubleValue() : " + integerPlaces);
//		System.out.println("num.number.doubleValue() : " + decimalPlaces);
		
	}

	public void drawImplications() {
		implicationsDrawn = true;
		int intVal = number.intValue();
		double doubleVal = number.doubleValue();
		String stringVal = Double.toString(doubleVal);
		String stringVal1 = Double.toString(intVal);
		
		System.out.println("String Value : " + stringVal);
		System.out.println("String Value : " + stringVal1);
		
		double d1= 234.12413;
		
		int integerPlaces = stringVal.indexOf('.');
		int decimalPlaces = stringVal.length() - integerPlaces - 1;		
	}	
	
	public void drawSpecialImplications() {
		specialImplicationsDrawn = true;			
	}

	public Number getNumber() {
		return number;
	}

	public void setNumber(Number number) {
		this.number = number;
	}

	public String getStringRep() {
		return stringRep;
	}

	public void setStringRep(String stringRep) {
		this.stringRep = stringRep;
	}

	public double getNumberValue() {
		return numberValue;
	}

	public void setNumberValue(double numberValue) {
		this.numberValue = numberValue;
	}

	public int getFloorInt() {
		return floorInt;
	}

	public void setFloorInt(int floorInt) {
		this.floorInt = floorInt;
	}

	public double getDecimalValue() {
		return decimalValue;
	}

	public void setDecimalValue(double decimalValue) {
		this.decimalValue = decimalValue;
	}

	public boolean isFraction() {
		return isFraction;
	}

	public void setFraction(boolean isFraction) {
		this.isFraction = isFraction;
	}

	public boolean isInteger() {
		return isInteger;
	}

	public void setInteger(boolean isInteger) {
		this.isInteger = isInteger;
	}

	public boolean isZero() {
		return isZero;
	}

	public void setZero(boolean isZero) {
		this.isZero = isZero;
	}

	public boolean isNegative() {
		return isNegative;
	}

	public void setNegative(boolean isNegative) {
		this.isNegative = isNegative;
	}

	public boolean isRational() {
		return isRational;
	}

	public void setRational(boolean isRational) {
		this.isRational = isRational;
	}

	public boolean isReal() {
		return isReal;
	}

	public void setReal(boolean isReal) {
		this.isReal = isReal;
	}

	public boolean isEven() {
		return isEven;
	}

	public void setEven(boolean isEven) {
		this.isEven = isEven;
	}

	public boolean isImplicationsDrawn() {
		return implicationsDrawn;
	}

	public void setImplicationsDrawn(boolean implicationsDrawn) {
		this.implicationsDrawn = implicationsDrawn;
	}

	public boolean isSpecialImplicationsDrawn() {
		return specialImplicationsDrawn;
	}

	public void setSpecialImplicationsDrawn(boolean specialImplicationsDrawn) {
		this.specialImplicationsDrawn = specialImplicationsDrawn;
	}

	public int getNoOfDigits() {
		return noOfDigits;
	}

	public void setNoOfDigits(int noOfDigits) {
		this.noOfDigits = noOfDigits;
	}

	public Integer[] getDigits() {
		return digits;
	}

	public void setDigits(Integer[] digits) {
		this.digits = digits;
	}

	public int getNoOfDecimalDigits() {
		return noOfDecimalDigits;
	}

	public void setNoOfDecimalDigits(int noOfDecimalDigits) {
		this.noOfDecimalDigits = noOfDecimalDigits;
	}

	public Integer[] getDecimalDigits() {
		return decimalDigits;
	}

	public void setDecimalDigits(Integer[] decimalDigits) {
		this.decimalDigits = decimalDigits;
	}

	public boolean isPerfectSquare() {
		return isPerfectSquare;
	}

	public void setPerfectSquare(boolean isPerfectSquare) {
		this.isPerfectSquare = isPerfectSquare;
	}

	public boolean isPerfectCube() {
		return isPerfectCube;
	}

	public void setPerfectCube(boolean isPerfectCube) {
		this.isPerfectCube = isPerfectCube;
	}

	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}

	public boolean isPerfectNumber() {
		return isPerfectNumber;
	}

	public void setPerfectNumber(boolean isPerfectNumber) {
		this.isPerfectNumber = isPerfectNumber;
	}

	public boolean isDivisibleBy3() {
		return isDivisibleBy3;
	}

	public void setDivisibleBy3(boolean isDivisibleBy3) {
		this.isDivisibleBy3 = isDivisibleBy3;
	}

	public boolean isDivisibleBy5() {
		return isDivisibleBy5;
	}

	public void setDivisibleBy5(boolean isDivisibleBy5) {
		this.isDivisibleBy5 = isDivisibleBy5;
	}

	public boolean isDivisibleBy7() {
		return isDivisibleBy7;
	}

	public void setDivisibleBy7(boolean isDivisibleBy7) {
		this.isDivisibleBy7 = isDivisibleBy7;
	}

	public boolean isDivisibleBy10() {
		return isDivisibleBy10;
	}

	public void setDivisibleBy10(boolean isDivisibleBy10) {
		this.isDivisibleBy10 = isDivisibleBy10;
	}
	
	
}
