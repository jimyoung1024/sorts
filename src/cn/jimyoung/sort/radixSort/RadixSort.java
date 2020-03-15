package cn.jimyoung.sort.radixSort;

import java.util.Arrays;

public class RadixSort {

    public static void radixSort(int[] arr) {
        radixSort(arr, getMaxDigit(getMaxValue(arr)));
    }

    private static void radixSort(int[] arr, int maxDigit) {
        int mod = 10;
        int dev = 1;

        for (int i = 0; i < maxDigit; i++, dev *= 10, mod *= 10) {
            // 考虑负数的情况，这里扩展一倍队列数，其中 [0-9]对应负数，[10-19]对应正数 (bucket + 10)
            int[][] counter = new int[20][0];

            for (int item : arr) {
                int bucket = ((item % mod) / dev) + 10;
                counter[bucket] = arrayAppend(counter[bucket], item);
            }

            int pos = 0;
            for (int[] bucket : counter) {
                for (int value : bucket) {
                    arr[pos++] = value;
                }
            }
        }
    }

    private static int getMaxDigit(int num) {
        if (num == 0) return 1;
        int max = 1;
        while (num >= 9) {
            max++;
            num /= 10;
        }
        return max;
    }

    private static int getMaxValue(int[] arr) {
        int max = arr[0];
        for (int i : arr)
            if (i > max) max = i;
        return max;
    }

    private static int[] arrayAppend(int[] arr, int value) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        //-1是因为上面这步让length变长了一位
        arr[arr.length - 1] = value;
        return arr;
    }
}
