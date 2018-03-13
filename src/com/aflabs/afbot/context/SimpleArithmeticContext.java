package com.aflabs.afbot.context;

public class SimpleArithmeticContext implements DomainContext{
	
	public SimpleArithmeticContext() {
		loadInstincts();
		loadBeliefs();
		loadAssumptions();
		loadKnowledge();
		loadFacts();
		loadPatterns();
		loadStereotypes();
	}

	@Override
	public void loadInstincts() {
		// TODO Auto-generated method stub
		instincts.add(30);
		instincts.add("Test");
	}

	@Override
	public void loadBeliefs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadAssumptions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadKnowledge() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadFacts() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadPatterns() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadStereotypes() {
		// TODO Auto-generated method stub
		
	}

}
