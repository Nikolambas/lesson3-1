package com.company;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
    }

    public static <T> void reverseObj(T [] oneObj,T [] twoObj,int numberObj) {
        try {
            T one = oneObj[numberObj];
            oneObj[numberObj] = twoObj[numberObj];
            twoObj[numberObj] = one;
        } catch (ArrayStoreException e) {
            System.out.println("Выбранные массивы не схожи по объектам");
        }
    }

    public static <A> ArrayList<A> arrToArrayList(A [] arr){
        ArrayList<A>arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }
        return arrayList;
    }
}

