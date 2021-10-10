package Companies.JingDong.New3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 4, 6};
        int k = 3;
        ArrayList<Integer> res = new ArrayList<>();
        mySort(arr, 0, arr.length - 1, k, res);
        Collections.sort(res);
        System.out.println(res);
    }

    static void mySort(int[] arr, int left, int right, int k, ArrayList<Integer> res) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            if (Math.abs(pivot - k) < 2) {
                for (int i = 0; i < k; i++) {
                    res.add(arr[i]);
                }
            } else if (pivot > k) {
                mySort(arr, left, pivot - 1, k, res);

            } else {
                mySort(arr, pivot + 1, right, k, res);
            }
        }
    }

    static int partition(int[] arr, int left, int right) {
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

    static void swap(int[] arr, int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }


}
