package com.example.demo.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Index starts from 0 and ends at size-1
 * Size parameter is optional to list. Default size
 * List size increases automatically unlike array.
 * we can add values using add() method
 * we can retrive values using get method and by passing index.
 * if
 */
public class ListExample1 {

    public static void main(String[] args) {
        List<Integer> listObject = new ArrayList<>(20); //Initialize List // Create list object
        //List<<Datatype>> <listName> = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        s.nextLine();
        int index = 0;
        while(input != -1){
            listObject.add(index, input);
            input = s.nextInt();
            s.nextLine();
            index = index + 1;
        }
        listObject.add(2, -1);
        System.out.println(listObject.get(0));
        System.out.println(listObject.get(1));
        System.out.println(listObject.get(2));
        System.out.println(listObject.get(3));
        listObject.remove(2);
        System.out.println(listObject.get(0));
        System.out.println(listObject.get(1));
        System.out.println(listObject.get(2));
        System.out.println(listObject.get(3));


    }


}
