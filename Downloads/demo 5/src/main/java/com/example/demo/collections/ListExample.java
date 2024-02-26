package com.example.demo.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Index starts from 0 and ends at size-1
 * Size parameter is optional to list. Default size
 * List size increases automatically unlike array.
 * we can add values using add() method
 * we can retrive values using get method and by passing index
 * Array List provides an option to insert value in between unlike Array
 */
public class ListExample {

    public static void main(String[] args) {
        List<String> listObject = new ArrayList<>(); //Initialize List // Create list object
        //List<<Datatype>> <listName> = new ArrayList<>();
        listObject.add("Hari-0");//0
        listObject.add("Hari-1");//1
        listObject.add("Hari-2");//2
        listObject.add("Hari-3");//3
        listObject.add("Hari-4");//4
        listObject.add("Hari-5");//5
        listObject.add("Hari-6");//6
        listObject.add("Hari-7");//7
        listObject.add("Hari-8");//8
        listObject.add("Hari-9");//9
        listObject.add("Hari-10");//10
        listObject.add("Hari-11");//11
        listObject.add("Hari-12");//12
        listObject.add("Hari-13");//13
        System.out.println(listObject.get(0));
        System.out.println(listObject.get(1));
        System.out.println(listObject.get(5));
        System.out.println(listObject.get(7));

    }


}
