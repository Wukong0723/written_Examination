package Others.FileIO;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FileReadWrite {
    public static void main(String[] args) {
        File file;
        try {
            Stack<Integer> sta = new Stack<>();
            Queue<Integer> que = new LinkedList<>();
            int[] aa =new int[3];
            int[] bb = new int[3];
            System.arraycopy(aa,0,bb,0,3);
            InputStream in = new FileInputStream("F:\\Projects\\written_Examination\\Exams\\src\\main\\java\\Others\\FileIO\\a.txt");
            OutputStream out = new FileOutputStream("F:\\Projects\\written_Examination\\Exams\\src\\main\\java\\Others\\FileIO\\b.txt");
            int len = -1;
            byte[] b = new byte[1024];
            while ((len = in.read(b, 0, b.length)) != -1){
                String str = new String(b,0,len,"utf-8");
                System.out.println(str);
                out.write(b,0,len);
            }
            in.close();
            out.close();

        } catch (Exception e) {

        }
    }
}
