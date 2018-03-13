package com.aflabs.afbot.core;

import java.util.ArrayList;
import java.util.List;

public class Model<I,A> {
	
	public I impliedInput;	
	public A canBeFound;
	public List<String> relationMap;		
	
	public I getImpliedInput() {
		return impliedInput;
	}

	public void setImpliedInput(I impliedInput) {
		this.impliedInput = impliedInput;
	}

	public List<String> getRelationMap() {
		return relationMap;
	}

	public void setRelationMap(List<String> relationMap) {
		this.relationMap = relationMap;
	}

	public A getCanBeFound() {
		return canBeFound;
	}

	public void setCanBeFound(A canBeFound) {
		this.canBeFound = canBeFound;
	}

	public static void main(String args[]){
		// Option 1 when data types are known
		Model<List<String>,List<String>> challenge = new Model<>();
		List<String> input = new ArrayList<String>();
		List<String> canBeFound = new ArrayList<String>();
		List<String> relationMap = new ArrayList<String>();
		
		input.add("Point A");
		input.add("Point B");
		input.add("Point C");
		input.add("Triangle ABC");
		
		relationMap.add("Line AB");
		relationMap.add("Line BC");
		relationMap.add("Line CA");
		
		canBeFound.add("Area of Triangle ABC");
		
		challenge.setImpliedInput(input);
		challenge.setCanBeFound(canBeFound);
		challenge.setRelationMap(relationMap);
		
		// Option 2 when data types are NOT known
		Model challenge1 = new Model<>();
		List<Object> input1 = new ArrayList<Object>();
		List<Object> canBeFound1 = new ArrayList<Object>();
		List<String> relationMap1 = new ArrayList<String>();
		
		input1.add(100);
		input1.add(2000);
		input1.add("Add");
		
		relationMap1.add("1st Addend Scale = 3");
		relationMap1.add("2nd Addend Scale = 4");
		
		canBeFound1.add("Sum");		
		
		challenge1.setImpliedInput(input1);
		challenge1.setCanBeFound(canBeFound1);
		challenge1.setRelationMap(relationMap1);
	}
	
}

