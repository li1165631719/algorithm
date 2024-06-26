import java.util.Arrays;

/**
 * 对数器
 * @author 李志豪
 * @create 2024/5/22
 */
public class LogarithmicDevice {

    public static int[] generateRandomArray(int maxSize, int maxValue){
        int[] arr = new int[(int)((maxSize+1)*Math.random())];
        for (int i = 0; i < arr.length; i++) {
            //[-N,+N]
            arr[i] = (int)((maxSize+1) * Math.random()) - (int)(maxSize * Math.random());
            //[0,N]
            //arr[i] = (int)((maxSize+1) * Math.random())
        }
        return arr;
    }

    public static boolean isEqual(int[] arr1,int[] arr2){
        if((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)){
            return false;
        }
        if(arr1 == null && arr2 == null){
            return true;
        }
        if(arr1.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static int[] copyArray(int[] arr){
        if (arr == null){
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    public static void printArray(int[] arr) {
        if(arr == null){
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
