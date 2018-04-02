package com.aflabs.afbot.trail;

import java.util.concurrent.ThreadLocalRandom;

public class Joke
{
  public static void main(String[] args) {	  
	 
	  int min = 1, max = 100000;
	  int a,b;
	  for (int i = 0; i <100; i++) {		  
		  a = randInt(min, max);
		  b = randInt(min, max);
		  min = Math.min(a, b);
		  max = Math.max(a, b);
		  System.out.println("Min : " + min + "   Max : " + max + "   Diff : " + (max-min));
		  if (min == max){
			  break;
		  }		  
	  }
   
  }
  
  public static int randInt(int min, int max) {
	  return ThreadLocalRandom.current().nextInt(min, max);
  }
  
//  public static int randInt(int min, int max) {
//	  int min = 0, max = 0, ran = 0;
//	  min = ThreadLocalRandom.current().nextInt(10, 1001);
//	  max = ThreadLocalRandom.current().nextInt(10, 1001);
//	  ran = ThreadLocalRandom.current().nextInt(Math.min(min, max), Math.max(min, max));
//	  
//	  return ran;
//  }
//  
//  public static int randInt(int min, int max) {
//
//	    // NOTE: This will (intentionally) not run as written so that folks
//	    // copy-pasting have to think about how to initialize their
//	    // Random instance.  Initialization of the Random instance is outside
//	    // the main scope of the question, but some decent options are to have
//	    // a field that is initialized once and then re-used as needed or to
//	    // use ThreadLocalRandom (if using at least Java 1.7).
//	    // 
//	    // In particular, do NOT do 'Random rand = new Random()' here or you
//	    // will get not very good / not very random results.
//	    Random rand;
//
//	    // nextInt is normally exclusive of the top value,
//	    // so add 1 to make it inclusive
//	    int randomNum = rand.nextInt((max - min) + 1) + min;
//
//	    return randomNum;
//	}
}

