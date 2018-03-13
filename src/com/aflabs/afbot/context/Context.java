package com.aflabs.afbot.context;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.aflabs.afbot.core.Challenge;
import com.aflabs.afbot.core.Model;

public interface Context {	
	//Integer contextID = 
	
	List<Object> objectList = new ArrayList<Object>();
	Set<Object> objectSet = new HashSet<Object>();
	Object[] objectArray = new Object[10];
	
	
	
}
