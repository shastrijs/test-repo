package com.aflabs.afbot.core;

import java.util.ArrayList;
import java.util.List;

public class Challenge<I,O> {
	
	public I input;
	public O output;
	public List<String> relationMap;	
	
	public I getInput() {
		return input;
	}
	
	public void setInput(I input) {
		this.input = input;
	}
	
	public O getOutput() {
		return output;
	}

	public void setOutput(O output) {
		this.output = output;
	}

	public List<String> getRelationMap() {
		return relationMap;
	}

	public void setRelationMap(List<String> relationMap) {
		this.relationMap = relationMap;
	}
	
	public static void main(String args[]){
		// Option 1 when input and output data types are known
		Challenge<List<String>,List<String>> challenge = new Challenge<>();
		List<String> input = new ArrayList<String>();
		List<String> output = new ArrayList<String>();
		List<String> relationMap = new ArrayList<String>();
		
		input.add("Point A");
		input.add("Point B");
		input.add("Point C");
		input.add("Triangle ABC");
		
		relationMap.add("Line AB");
		relationMap.add("Line BC");
		relationMap.add("Line CA");
		
		output.add("Area of Triangle ABC");
		
		challenge.setInput(input);
		challenge.setOutput(output);
		challenge.setRelationMap(relationMap);
		
		// Option 2 when input and output data types are NOT known
		Challenge challenge1 = new Challenge<>();
		List<Object> input1 = new ArrayList<Object>();
		List<Object> output1 = new ArrayList<Object>();
		List<String> relationMap1 = new ArrayList<String>();
		
		input1.add(100);
		input1.add(2000);
		input1.add("Add");
		
		relationMap1.add("1st Addend Scale = 3");
		relationMap1.add("2nd Addend Scale = 4");
		
		output1.add("Sum");		
		
		challenge1.setInput(input1);
		challenge1.setOutput(output1);
		challenge1.setRelationMap(relationMap1);
	}
	
}

