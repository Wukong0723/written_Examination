package Companies.Ali.New1;

import javax.swing.plaf.TableHeaderUI;
import java.io.Serializable;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=2;
        System.out.print(n+"=");
        while(k<=n){
            if(k==n){
                System.out.println(n);
                break;
            } else if(n%k==0){
                System.out.print(k+"*");
                n = n/k;
            }else{
                k++;
            }
        }

    }

    abstract interface aaa{

    }

}

