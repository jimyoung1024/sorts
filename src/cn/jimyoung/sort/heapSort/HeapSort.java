package cn.jimyoung.sort.heapSort;

public class HeapSort {
    public static void heapSort(int[] arr) {
        int len = arr.length;
        //创建一个最大堆-——————————
        for (int i = (len / 2) - 1; i >= 0; i--) {
            heapIfy(arr, i, len);
        }
        //——————————————————————
        for (int i = len - 1; i > 0; i--) {
            swap(arr, 0, i);
            len--;
            heapIfy(arr, 0, len);
        }

    }

    private static void heapIfy(int[] arr, int root, int len) {
        int left = root * 2 + 1;
        int right = root * 2 + 2;
        int maxIndex = root;
        if (left < len && arr[left] > arr[maxIndex]) {
            maxIndex = left;
        }
        if (right < len && arr[right] > arr[maxIndex]) {
            maxIndex = right;
        }
        if (maxIndex != root) {
            swap(arr, maxIndex, root);
            heapIfy(arr, maxIndex, len);
        }

    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
