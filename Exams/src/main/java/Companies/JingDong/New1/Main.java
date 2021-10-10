package Companies.JingDong.New1;

import javafx.util.Pair;

import javax.xml.stream.Location;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static class Location{
        public int x;
        public int y;
        Location(int x,int y){
            this.x =x;
            this.y =y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tmp = sc.nextLine().split(" ");
        int n = Integer.valueOf(tmp[0]);
        int m = Integer.valueOf(tmp[1]);
        int x = Integer.valueOf(tmp[2]);
        int y = Integer.valueOf(tmp[3]);
        int z = Integer.valueOf(tmp[4]);

        HashMap<Character, Location>map =new HashMap<>();
        for(int i =0;i<n;i++){
            String line =sc.next();
            for(int j= 0;j<m;j++){
                map.put(line.charAt(j),new Location(i,j));
            }
        }
        String input = sc.nextLine();
        Long output = 0L;
        Location lastLocation = new Location(0,0);
        for(char c: input.toCharArray()){
            Location location = map.get(c);
            if(lastLocation.x == location.x && lastLocation.y == location.y){
                output+=z;
            }else if(lastLocation.x == location.x && lastLocation.y != location.y){
                output += Math.abs(lastLocation.y -location.y)*x;
                output+=z;
            }else if(lastLocation.x != location.x && lastLocation.y ==location.y){
                output +=Math.abs(lastLocation.x - location.x)*x ;
                output+=z;
            }
            lastLocation = location;
        }
        System.out.println(output);

    }
}
