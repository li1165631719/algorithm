import sun.reflect.generics.tree.ArrayTypeSignature;

import java.util.Arrays;

/**
 * 归并排序
 *
 * @author 李志豪
 * @create 2024/5/24
 */
public class MergeSort {
    public static void main(String[] args) {
        int testTime=5000;
        int maxSize =100;
        boolean succeed =true;


        for (int i = 0; i < testTime; i++) {
            int[] arr1 =UserDevice.generateRandomArray(maxSize,maxSize);
            int[] arr2 =UserDevice.copyArray(arr1);
            mergeSort(arr1,0, arr1.length-1);
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

    public static void mergeSort(int[] arr,int l,int r){
        if(r-l<2){
            return ;
        }
        int m = l+(r-l)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m,r);
        merge(arr,l,m,r);

    }

    public static void merge(int[] arr,int l,int m,int r){
        int[] help =new int[r-l+1];
        int i =0;
        int p1 =l;
        int p2 =m +1 ;
        while(p1<=m&&p2<=r){
            help[i++]=arr[p1]<arr[p2]?arr[p1++]:arr[p2++];
        }
        if(p1<=m){
            help[i++]=arr[p1++];
        }
        if(p2<=r){
            help[i++]=arr[p2++];
        }
        for (i= 0; i < arr.length ; i++) {
            arr[i]=help[i];
        }
    }
}
