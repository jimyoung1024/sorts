package cn.jimyoung.sort.countingSort;

public class CountingSort {

    public static void countingSort(int[] arr) {
        //数据范围是0-maxValue 所以要+1
        int bucketLen = getMaxValue(arr) + 1;
        int[] bucket = new int[bucketLen];
        //先检索所有的元素，依次放到bucket里
        for (int i : arr)
            bucket[i]++;
        //把bucket里所有的数据在重新放回数组
        int index = 0;
        for (int j = 0; j < bucketLen; j++) {
            while (bucket[j] > 0) {
                arr[index++] = j;
                bucket[j]--;
            }
        }
    }

    private static int getMaxValue(int[] arr) {
        int max = arr[0];
        for (int i : arr)
            if (i > max) max = i;
        return max;
    }
}
