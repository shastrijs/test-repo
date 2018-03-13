package com.aflabs.afbot.context;

public class ContextFactory {
	public static DomainContext createDomainContext(String contextType)
	  {
	    if ( contextType.equals("SimpleArithmetic") )
	      return new SimpleArithmeticContext();
	    else if ( contextType.equals("Other") )
	      return new OtherDomainContext();

	    return null;
	  }
}
