package Companies.ByteDance.Xiang1;

import javafx.util.Pair;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int[] nums = {2, 2, 3, 3, 2, 3};
//        System.out.println(firstOccurMostNum(nums));
        Long[] nums2 = {2L, 2L, 3L, 3L, 2L, 3L,4L,6L,6L};
        System.out.println(Arrays.asList(topThreeOccur(nums2)));
    }

    static int firstOccurMostNum(int[] nums) {
        if(nums == null){
            return -1;
        }
        HashMap<Integer, Integer> mp = new HashMap<>();
        int MAX_CNT = 0;
        int res = nums[0];

        for (int i : nums) {
            if (mp.containsKey(i)) {
                int tmp = mp.get(i);
                mp.put(i, tmp + 1);
            } else {
                mp.put(i, 1);
            }
            if (mp.get(i) > MAX_CNT) {
                res = i;
                MAX_CNT = mp.get(i);
            }
        }
        return res;
    }

    static Long[] topThreeOccur(Long[] nums){
        if(nums.length<3){
            return null;
        }
        Long[] res =new Long[3];

        HashMap<Long, Integer> mp = new HashMap<>();
        for(Long i :nums){
            if (mp.containsKey(i)) {
                int tmp = mp.get(i);
                mp.put(i, tmp + 1);
            } else {
                mp.put(i, 1);
            }
        }
        PriorityQueue<Map.Entry<Long,Integer>> que =
                new PriorityQueue<>((a,b)->{return b.getValue()-a.getValue();});
        for(Map.Entry entry: mp.entrySet()){
            que.offer(entry);
        }
        for(int i = 0;i<3;i++){
            res[i] = que.poll().getKey();
        }
        return res;
    }
}
