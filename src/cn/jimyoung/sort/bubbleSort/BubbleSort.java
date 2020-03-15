package cn.jimyoung.sort.bubbleSort;

public class BubbleSort {
    //冒泡排序
    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        //i代表已经有序的元素的个数
        for (int i = 0; i < len; i++) {
            //
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //两数交换固定写法
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

