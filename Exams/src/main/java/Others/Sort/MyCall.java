package Others.Sort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyCall {
    public static void main(String[] args) {
        int[] arr = new int[] {5,1,1,2,0,0,4,3,6,9,1,3};
        new MergeSort().sortArray(arr);
        for(int i :arr){
            System.out.print(i+" ");
        }

    }
}
