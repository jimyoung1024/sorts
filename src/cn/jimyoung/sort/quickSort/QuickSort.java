package cn.jimyoung.sort.quickSort;

public class QuickSort {
    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);

    }
    //快速排序， 选第一个元素为轴元素，从右侧开始判断
    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int pivot = arr[left];
        int i = left, j = right;
        while (i != j) {
            while (i < j && arr[j] >= pivot) j--;
            if (i < j) arr[i] = arr[j];
            while (i < j && arr[i] <= pivot) i++;
            if (i < j) arr[j] = arr[i];
            if(i == j) arr[i] = pivot;
        }
        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);
    }

}
