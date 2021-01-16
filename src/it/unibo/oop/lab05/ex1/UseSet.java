package it.unibo.oop.lab05.ex1;

import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

	final static int ELEM = 20;
	
    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         */
          
    	final Set<String> set = new TreeSet<>();
          
        /* 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         */
    	
    	for(int i = 1; i <= ELEM; i++) {
    		set.add(Integer.toString(i));
    	}
    	
        /*
         *  3) Prints its content
         */
    	
    	System.out.println("Initial Set" + set);
    	
        /* 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         */
         
    	final var iter = set.iterator();
    	while(iter.hasNext()) {
    		if(Integer.parseInt(iter.next()) % 3 == 0) {
    			iter.remove();
    		}
    	}
    	
    	/* 
         * 5) Prints the content of the Set using a for-each costruct
         */ 
        
    	for(String s : set) {
    		System.out.print(s + ", ");
    	}
    	System.out.println();
    	
    	/* 
         * 6) Verifies if all the numbers left in the set are even
         */
    	final var set2 = new TreeSet<>();
    	for (int i = 2; i <= ELEM; i += 2) {
    		set2.add(Integer.toString(i));
    	}
    	System.out.println(set2.containsAll(set));
    }
}
