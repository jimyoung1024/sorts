package cn.jimyoung.sort.insertSort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class InsertSort {

    public static void insertSort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int temp = arr[i];
            int j;
            for (j = i; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1];
            }

            if (i != j)
                //这里是j不是j-1，要想清楚
                arr[j] = temp;
        }
    }
}
