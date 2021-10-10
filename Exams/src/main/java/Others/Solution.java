package Others;

import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;

public class Solution {
    //[x, y, width, height]
    public int rectIntersectArea(int[] rectA, int[] rectB) {
        // write code here
        if (rectA == null || rectB == null) {
            return -1;
        }
        int p1_x = rectA[0], p1_y = rectA[1];
        int p2_x = p1_x + rectA[2], p2_y = p1_y + rectA[3];
        int p3_x = rectB[0], p3_y = rectB[1];
        int p4_x = p3_x + rectB[2], p4_y = p3_y + rectB[3];
        if (p1_x >= p4_x || p2_x <= p3_x || p1_y >= p4_y || p2_y <= p3_y) {
            return 0;
        }
        int Len = Math.min(p2_x, p4_x) - Math.min(p1_x, p3_x);
        int Wid = Math.min(p2_y, p4_y) - Math.min(p1_y, p3_y);
        return Len * Wid;

    }

    static int[] value = {1, 0, 0, 0, 1, 1};

    public int findMinPath(int[] start, int[] end) {
        // write code here
        int beginX = start[0];
        int beginY = start[1];
        int endX = end[0];
        int endY = end[1];
        int n = (int) Math.sqrt(value.length);
        return dfs(beginX, beginY, endX, endY, n);

    }

    public int dfs(int beginX, int beginY, int endX, int endY, int n) {
        if (beginX == endX && beginY == endY) {
            return 0;
        }
        if (beginX < 0 || beginX >= n || beginY < 0 || beginY >= n || value[beginX + beginY * n] == 1) {
            return Integer.MAX_VALUE;
        }
        int res = Integer.MAX_VALUE;
        res = Math.min(res, dfs(beginX + 1, beginY, endX, endY, n));
        res = Math.min(res, dfs(beginX - 1, beginY, endX, endY, n));
        res = Math.min(res, dfs(beginX, beginY + 1, endX, endY, n));
        res = Math.min(res, dfs(beginX, beginY - 1, endX, endY, n));
        return res;

    }

    public int findCenter(int[][] edges) {
        int[] nums = new int[edges.length+1];
        for (int i = 0; i < edges.length; i++) {
            nums[edges[i][0]]++;
            nums[edges[i][1]]++;
        }
        for(int i =0;i<nums.length;i++){
            if(nums[i] == edges.length-1){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

//        System.out.println(solution.findJudge(1,
//                new int[][]{}
//        ));


    }

}