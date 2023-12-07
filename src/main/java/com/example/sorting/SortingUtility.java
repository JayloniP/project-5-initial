package com.example.sorting;

import java.util.ArrayList;

public class SortingUtility {


    public static <T extends Comparable<T>> void gnomeSort(T[] data) {
        int pos = 0;
        while (pos < data.length) {
            if (pos == 0 || data[pos].compareTo(data[pos - 1]) >= 0) {
                pos++;
            } else {
                swap(data, pos, pos - 1);
                pos--;
            }
        }// TODO implement Gnome Sort here
    }


    public static <T extends Comparable<T>> void cocktailShakerSort(T[] data) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i].compareTo(data[i + 1]) > 0) {
                    swap(data, i, i + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break; // exit the loop if no swaps occurred in the forward pass
            }
            swapped = false;
            for (int i = data.length - 1; i > 0; i--) {
                if (data[i].compareTo(data[i - 1]) < 0) {
                    swap(data, i, i - 1);
                    swapped = true;
                }
            }
        } while (swapped);// TODO implement Cocktail Shaker Sort here
    }


    public static <T extends Comparable<T>> void shellSort(T[] data) {
       /* List<intergers>  gaps = ArrayList[701, 301, 132, 57, 23, 10, 4, 1]
        for (int gap : gaps) {
            for (int i = gap; i < data.length; i++) {
              T temp = data[i];
                int j;
                for (j = i; j >= gap && data[j - gap] >temp ; j -=gap) {
                    data[j] = data[j - gap];
                }
                data[j]=temp;
            }*/
              // TODO implement Shell Sort here


    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}