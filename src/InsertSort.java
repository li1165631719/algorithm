import java.util.Arrays;

/**
 * 插入排序
 * 将未排序数据在排序数列从后往前排序，找到合适位置插入
 *
 * @author 李志豪
 * @create 2024/5/24
 */
public class InsertSort {
    public static void InsertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; (j > 0) && (arr[j] < arr[j - 1]); j--) {
                swap(arr, j, j - 1);
            }
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int testTime = 50000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = UserDevice.generateRandomArray(maxSize, maxValue);
            int[] arr2 = UserDevice.copyArray(arr1);
            InsertSort(arr1);
            Arrays.sort(arr2);
            if (!UserDevice.isEqual(arr1, arr2)) {
                succeed = false;
                UserDevice.printArray(arr1);
                UserDevice.printArray(arr2);
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");
    }
}

