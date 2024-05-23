import java.util.Arrays;

/**
 * @author 李志豪
 * @create 2024/5/22
 */
public class Demo1_SelectionSort {
    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }


    public static void main(String[] args) {
        int testTime = 50000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = LogarithmicDevice.generateRandomArray(maxSize, maxValue);
            int[] arr2 = LogarithmicDevice.copyArray(arr1);
            selectionSort(arr1);
            Arrays.sort(arr2);
            if(!LogarithmicDevice.isEqual(arr1,arr2)){
                succeed =false;
                LogarithmicDevice.printArray(arr1);
                LogarithmicDevice.printArray(arr2);
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

        int[] arr = LogarithmicDevice.generateRandomArray(maxSize,maxValue);
        LogarithmicDevice.printArray(arr);
        selectionSort(arr);
        Arrays.sort(arr);
        LogarithmicDevice.printArray(arr);
    }
}
