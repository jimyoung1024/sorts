package cn.jimyoung.test;

import cn.jimyoung.sort.countingSort.CountingSort;
import cn.jimyoung.sort.heapSort.HeapSort;
import cn.jimyoung.sort.quickSort.QuickSort;
import cn.jimyoung.sort.radixSort.RadixSort;
import cn.jimyoung.sort.review.review;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = {4,5,3,6,7,7,8,9,3,5,6,7,777,34235,6662,333333,-5,-666,0,32323,-2324235};
        review.quickSort(a);
        System.out.print(Arrays.toString(a));


    }

}
