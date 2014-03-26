package LabWeek4;

import java.util.ArrayList;

public class Question4 {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<Integer>();
        int value = 3;

        for(int i=1; i<=100; i++) {
            integers.add(i);
        }

        System.out.println(shouldRemoveValuesDivisibleByInteger(integers, value));
    }

    public static int shouldRemoveValuesDivisibleByInteger(ArrayList<Integer> arrayList, int value) {

        ArrayList<Integer> valuesToRemove = new ArrayList<Integer>();

        for (int arrayListValue : arrayList) {
            if(arrayListValue % value == 0){
                valuesToRemove.add(arrayListValue);
            }
        }

        arrayList.removeAll(valuesToRemove);

        return arrayList.size();
    }
}
