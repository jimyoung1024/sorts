package cn.jimyoung.sort.mergeSort;

public class MergeSort_NonRec {
    public static void mergeSort(int[] arr) {
        int length = arr.length;
        int right;
        for(int size = 1;size < length; size <<= 2){
            for(int left = 0; left + size < length; left += 2* size){
                right = left + 2 * size - 1;
                if(right > length - 1) right = length - 1;
                merge(arr, left, right);
            }
        }
    }

    public static void merge(int[] arr, int left, int right) {
        int mid = (left + right) / 2;
        int i = left, j = mid + 1, k = 0;
        int[] temp = new int[right - left + 1];
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid)
            temp[k++] = arr[i++];
        while (j <= right)
            temp[k++] = arr[j++];
        i = left;
        k = 0;
        while (i <= right)
            arr[i++] = temp[k++];
    }
}
