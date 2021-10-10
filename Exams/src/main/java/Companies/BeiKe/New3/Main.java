package Companies.BeiKe.New3;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        MySort(arr);

    }

    static public int[] MySort(int[] arr) {
        mySort(arr, 0, arr.length - 1);
        return arr;
    }

    static public void mySort(int[] arr, int left, int right) {
   //     if (left < right) {
            int pos = partition(arr, left, right);
            mySort(arr, left, pos - 1);
            mySort(arr, pos + 1, right);
  //      }

    }

    static public int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            swap(arr, left, right);
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            swap(arr, left, right);
        }
        return left;
    }

    static public void swap(int[] arr, int left, int right) {
        int tmp = arr[right];
        arr[right] = arr[left];
        arr[left] = tmp;
    }
}
