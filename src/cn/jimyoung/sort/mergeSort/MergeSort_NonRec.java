package cn.jimyoung.sort.mergeSort;

public class MergeSort_NonRec {
    public static void mergeSort(int[] arr) {
        int length = arr.length;
        int right, mid;
        //第一层循环，用来判断当前各部分数组的大小已经达到来length 即已经归并完成
        for(int size = 1; size < length; size *= 2){
            //第二层循环，以size大小来分割数组，并交给merge函数进行排序合并
            for(int left = 0; left + size < length; left += 2* size){
                mid = left + size -1;
                right = left + 2 * size - 1;
                if(right > length - 1) right = length - 1;

                merge(arr, left, mid, right);
            }
        }
    }
    //注释在MergeSort_Rec里
    public static void merge(int[] arr, int left, int mid, int right) {
        System.out.print(mid);
        int Mid = (left + right)/2;
        System.out.println(Mid);
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
