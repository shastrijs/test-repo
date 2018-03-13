package com.aflabs.afbot.core.utility;

import java.util.Collection;

public class What {

	boolean isVirtual; //Eg: False - A Market event; True - Challenge/Part of a Challenge
	Integer typeID; //Eg: If modeling an event, it is Event Type ID
	HowMuch howMuch;
	Collection<Actor> actors;
}
