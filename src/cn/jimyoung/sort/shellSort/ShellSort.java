package cn.jimyoung.sort.shellSort;

public class ShellSort {
    public static void shellSort(int[] arr) {
        int len = arr.length;
        int gap = 1;
        //将增量区间调到最大，这里选取的序列是1，4，13，3k+1
        while (gap < len) {
            gap = gap * 3 + 1;
        }
        //此层循环控制增量区间不断变小
        while (gap > 0) {
            //此层循环以gap为增量，进行一次插入排序
            for (int i = gap; i < len; i++) {
                int temp = arr[i];
                int j = i - gap;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + gap] = arr[j];
                    j -= gap;
                }
                arr[j + gap] = temp;
            }
            gap = gap / 3;
        }
    }
}
