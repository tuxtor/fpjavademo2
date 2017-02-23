package com.nabenik.heaven.lblocks;

import java.util.ArrayList;
import java.util.Random;

import javaslang.collection.List;

/**
 * General streams sample using javaslang
 * @author tuxtor
 *
 */
public class StreamController {
	public List<Integer> generateRandomList(){
		ArrayList<Integer> numbersList = new ArrayList<>();
        Random rGenerator = new Random();
        for (int i = 0; i < 20; i++) {
            numbersList.add(rGenerator.nextInt(255));
        }
        return List.ofAll(numbersList);
    }
    
    public List<Integer> lambdaSort(){
    	System.out.println("Slang sorting");
    	return generateRandomList()
	    	.sorted((x,y) -> x.compareTo(y));
    }
    
    public List<Integer> lambdaFilter(){
    	System.out.println("Slang filtering");
    	return generateRandomList()
    	.map(x -> x-1)
    	.filter(x -> x>50);
    }

    public void doDemo(){
        //Sorting demo
        System.out.println(lambdaSort());
        
        System.out.println(lambdaFilter());
    }
}
