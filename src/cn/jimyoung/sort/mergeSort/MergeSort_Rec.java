package cn.jimyoung.sort.mergeSort;
/**
 * @author jimyoung
 * 非递归归并排序
 */
public class MergeSort_Rec {
    //创建一个便于调用的函数
    public static void mergeSort(int[] arr){
        mergeSort(arr, 0, arr.length-1);
    }
    //此函数用于先拆分数组，再合并
    //拆分是便于理解的说法，实际上是用left和right来控制当前进行需要操作的数组
    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        //两个拆分好的数组已经有序，现在可以合并到一起
        merge(arr, left, mid, right);
    }

    //此函数用于给数组排序，将有序的两部分数组合并成为一个有序的数组
    //虽然函数名教merge，但是完成来merge和sort两个操作
    public static void merge(int[] arr, int left, int mid, int right) {
        int i = left, j = mid + 1, k = 0;
        //开辟一个合并之后数组长度的数组
        int[] temp = new int[right - left + 1];
        //从两部分数组的左边开始取数，小的放在新数组里
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        //因为肯定有一个数组先被取完，所以另一个数组剩下的数要依次存放
        while (i <= mid)
            temp[k++] = arr[i++];
        while (j <= right)
            temp[k++] = arr[j++];

        //最后将temp数组（已经排好序了）放回到原来的arr数组
        i = left;
        k = 0;
        while(i<=right)
            arr[i++] = temp[k++];
    }
}
