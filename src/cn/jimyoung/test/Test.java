package cn.jimyoung.test;

import cn.jimyoung.sort.mergeSort.*;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = {3, 2, 5, 2, 5, 6, 23, 3, 4, 5, 93};
        MergeSort_NonRec.mergeSort(a);
        System.out.print(Arrays.toString(a));
    }
}
