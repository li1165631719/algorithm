import java.util.Arrays;

/**
 * 选择排序
 * 将第一个位置的数和后面所有数比较，遇到小的就交换位置，第一个位置是最小的数
 * @author 李志豪
 * @create 2024/5/22
 */
public class UserSelectionSort {
    public static void main(String[] args) {
        int testTime = 50000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {

            int[] arr1 = UserDevice.generateRandomArray(maxSize,maxValue);
            int[] arr2 = UserDevice.copyArray(arr1);
            selectionSort(arr1);
            Arrays.sort(arr2);
            if(!UserDevice.isEqual(arr1,arr2)){
                succeed =false;
                UserDevice.printArray(arr1);
                UserDevice.printArray(arr2);
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");
    }

    public static void selectionSort(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                //找到最小值的下标和arr[i]交换
                minIndex = arr[j]<arr[minIndex]?j:minIndex;
            }
            swap(arr,i,minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
