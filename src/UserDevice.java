/**
 * @author 李志豪
 * @create 2024/5/22
 */
public class UserDevice {
    //随机生成数组
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        //maxSize为100
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxSize + 1) * Math.random()) - (int) ((maxSize) * Math.random());
        }
        return arr;
    }

    //判断两数组是否相等
    public static boolean isEqual(int[] arr1, int[] arr2) {
        //预防出现越界情况
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        //非越界情况
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    //复制数组
    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    //输出数组
    public static void printArray(int arr[]){
        if(arr ==null){
            return;
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
