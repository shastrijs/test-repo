package com.aflabs.afbot.client;

import com.aflabs.afbot.context.ContextFactory;
import com.aflabs.afbot.context.DomainContext;

public class ContextFactoryTestClient {
	  public static void main(String[] args)
	  {
	    // create a simple arithmatic context
	    DomainContext domainContext = ContextFactory.createDomainContext("SimpleArithmetic");	    
	    System.out.println(domainContext.instincts);
	   
	    // create a simple other context
	    DomainContext domainContext1 = ContextFactory.createDomainContext("Other");	    
	    System.out.println(domainContext1.instincts);
	  }
}
