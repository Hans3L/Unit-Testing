package com.creativity.example.games;

import org.apache.logging.log4j.LogManager;

public class Largest {

    /**
     * @param list
     * @return
     */
    public int largest(int[] list){

        Integer max = Integer.MIN_VALUE;
        LogManager.getLogger(max);

        if (list.length == 0) {
            throw new RuntimeException("Empty list");
        }
        for (int i=0; i < list.length ; i++) {
            if(list[i] > max)
                max  = list[i];
        }
        return max;
    }

    //TODO public static void main(String[] args){
    //TODO    int array [] ={2000,2,100,5,1001};
       //TODO System.out.println(largest(array));
   //TODO }
}
