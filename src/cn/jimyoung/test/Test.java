package cn.jimyoung.test;

import cn.jimyoung.sort.mergeSort.*;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = {4,5,3,6,7,8,4,4,545,0,4235,9,65};
        MergeSort_Rec.mergeSort(a);
        System.out.print(Arrays.toString(a));
    }
}
