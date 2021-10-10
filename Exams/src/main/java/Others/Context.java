package Others;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;


//["623986800","3","887298","695","794","6888794705","269409","59930972","723091307","726368","8028385786","378585"]
//11
public class Context {
    static class Solution {
        public int minSessions(int[] tasks, int sessionTime) {
            int[] mp =new int[15];
            for(int i: tasks){
                mp[i]++;
            }

            int res = 0;
            while (Arrays.stream(mp).sum() != 0){
                int tmp = 0;
                for(int i = 14;i>=0;i--){
                    while(mp[i] != 0 && i+tmp <= sessionTime){
                        if(i+tmp == sessionTime){
                            tmp += i;
                            mp[i]--;
                        }else{
                            if(i+tmp < sessionTime){

                            }
                        }
                    }
                }
                res++;
            }
            return res;
        }
    }

    public static void main(String[] args) {

    }
}
