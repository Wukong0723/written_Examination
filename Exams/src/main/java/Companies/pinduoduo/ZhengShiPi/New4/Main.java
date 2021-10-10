package Companies.pinduoduo.ZhengShiPi.New4;

import java.util.Scanner;

public class Main {
    static class Location {
        public int xx;
        public int yy;

        Location(int xx, int yy) {
            this.xx = xx;
            this.yy = yy;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int cnt = 0; cnt < T; cnt++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[] operator = new int[n];
            for (int i = 0; i < n; i++) {
                operator[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                int xx = sc.nextInt();
                int yy = sc.nextInt();
                Location location = new Location(xx, yy);
                if (operator.length == 0) {
                    System.out.print(location.xx + " " + location.yy);
                    System.out.println();
                    continue;
                }

                for (int cur = 0; cur < operator.length; cur++) {
                    if (operator[cur] == 1) {
                        if (location.xx != 1) {


                            location.xx--;
                        }
                    } else if (operator[cur] == 2) {
                        if (location.yy != 1) {

                            location.yy--;
                        }
                    } else if (operator[cur] == 3) {
                        if (location.xx != x) {

                            location.xx++;
                        }
                    } else if (operator[cur] == 4) {
                        if (location.yy != y) {

                            location.yy++;
                        }
                    }
                }
                System.out.print(location.xx + " " + location.yy);
                System.out.println();
            }
        }
    }
}

//    static Location finalPos(int X, int Y, int[] operator, int cur, int xx, int yy) {
//        if (operator.length == 0 || cur == operator.length) {
//            return new Location(xx, yy);
//        }
//
//        if (operator[cur] == 1) {
//            if (xx == 1) {
//                return finalPos(X, Y, operator, cur + 1, xx, yy);
//            } else {
//                return finalPos(X, Y, operator, cur + 1, xx - 1, yy);
//            }
//        } else if (operator[cur] == 2) {
//            if (yy == 1) {
//                return finalPos(X, Y, operator, cur + 1, xx, yy);
//            } else {
//                return finalPos(X, Y, operator, cur + 1, xx, yy - 1);
//            }
//        } else if (operator[cur] == 3) {
//            if (xx == X) {
//                return finalPos(X, Y, operator, cur + 1, xx, yy);
//            } else {
//                return finalPos(X, Y, operator, cur + 1, xx + 1, yy);
//            }
//        } else if (operator[cur] == 4) {
//            if (yy == Y) {
//                return finalPos(X, Y, operator, cur + 1, xx, yy);
//            } else {
//                return finalPos(X, Y, operator, cur + 1, xx, yy + 1);
//            }
//        }
//        return null;
//    }
//}
