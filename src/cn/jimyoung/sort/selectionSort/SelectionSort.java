package cn.jimyoung.sort.selectionSort;

public class SelectionSort {
    //插入排序
    public static void selectionSort(int[] arr) {
        int len = arr.length;
        //每循环都假设第一个数是最小的
        for (int i = 0; i < len - 1; i++) {
            int min = i;
            //寻找本次循环的最小值
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //如果最小值不是第一个数，就交换它们两个
            if (i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
