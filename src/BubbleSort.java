import java.util.Arrays;

/**
 * 冒泡排序
 * 将大的数不断往后排，每次都操作大的那个数和后一位数做比较，直到最后没有数
 * @author 李志豪
 * @create 2024/5/24
 */
public class BubbleSort {
    public static void main(String[] args) {
        int testTime=5000;
        int maxSize =100;
        boolean success =true;
        for (int i = 0; i <testTime ; i++) {
            int[] arr1 =UserDevice.generateRandomArray(maxSize,maxSize);
            int[] arr2 =UserDevice.copyArray(arr1);
            BubbleSort(arr1);
            Arrays.sort(arr2);
            if(!UserDevice.isEqual(arr1,arr2)){
                success =false;
                UserDevice.printArray(arr1);
                UserDevice.printArray(arr2);
            }
        }
        System.out.println(success?"Nice!":"Fucking fucked!");
    }
    public static void BubbleSort(int[] arr){
        if((arr==null)||(arr.length<2)){
            return;
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <  arr.length - i -1; j++) {
                if (arr[j]>arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }
}
