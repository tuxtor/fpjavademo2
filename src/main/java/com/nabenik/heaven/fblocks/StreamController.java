package com.nabenik.heaven.fblocks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamController {
	public List<Integer> generateRandomList(){
        List<Integer> numbersList = new ArrayList<>();
        Random rGenerator = new Random();
        for (int i = 0; i < 20; i++) {
            numbersList.add(rGenerator.nextInt(255));
        }
        return numbersList;
    }
    
    public void oldSort(){
        List<Integer> unsortedList = generateRandomList();
        System.out.println("Old way");
        System.out.println(unsortedList);
        Collections.sort(unsortedList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(unsortedList);
    }
    
    public void lambdaSort(){
        List<Integer> theList = generateRandomList();
        System.out.println("Lambda way");
        System.out.println(theList);
        theList.sort((x,y) -> x.compareTo(y));
        System.out.println(theList);
    }
    
    public void oldFilter(){
        List<Integer> unfilteredList = generateRandomList();
        System.out.println("Old way");
        List<Integer> filteredList = new ArrayList<>();
        for (Integer number : unfilteredList) {
            if(number > 50){
                filteredList.add(number);
            }
        }
        System.out.println(filteredList);
    }
    
    public void lambdaFilter(){
        System.out.println("Lambda way");
        List<Integer> unfilteredList = generateRandomList();
        List<Integer> filteredList = unfilteredList.stream()
        		.map(x -> x-1)
                .filter(x -> x > 50)
                .collect(Collectors.toList());
        System.out.println(filteredList);
    }

    public void doDemo(){
        //Sorting demo
        this.oldSort();
        this.lambdaSort();
        //Filtering demo
        this.oldFilter();
        this.lambdaFilter();
    }
}
