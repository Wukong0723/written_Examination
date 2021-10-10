package Companies.Bilibili;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str0 = sc.nextLine();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();

        for(int i =0 ;i< str0.length();i++){
            if(str0.charAt(i) != ','){
                tmp.add(str0.charAt(i) - '0');
            }
        }
        arr.add(tmp);
        int n = tmp.size();
        for(int j = 0;j < n-1;j++){
            String str_tmp = sc.nextLine();
            ArrayList<Integer> arr_tmp = new ArrayList<>();
            for(int i =0 ;i< str0.length();i++){
                if(str_tmp.charAt(i) == '1' || str_tmp.charAt(i) == '0'){
                    arr_tmp.add(str_tmp.charAt(i) - '0');
                }
            }
            arr.add(arr_tmp);
        }
        System.out.println(func(arr));

    }
    private static int func(ArrayList<ArrayList<Integer>> arr){
        int res = 0;

        for(int i =0;i<arr.size();i++){
            for(int j = 0;j<arr.size();j++){
                if(arr.get(i).get(j) == 1){
                    bfs(arr,i,j);
                    res++;
                }
            }
        }
        return res;
    }
    private static void bfs(ArrayList<ArrayList<Integer>> arr,int i,int j){
        if(arr.get(i).get(j) == 1){
            arr.get(i).set(j,0);

            if(i<arr.size()-1){
                bfs(arr,i+1,j);
            }
            if(i>0){
                bfs(arr,i-1,j);
            }
            if(j<arr.size()-1){
                bfs(arr,i,j+1);
            }
            if(j>0){
                bfs(arr,i,j-1);
            }
        }
    }


}

