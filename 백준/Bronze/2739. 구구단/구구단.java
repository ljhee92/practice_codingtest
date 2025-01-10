import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int dan = Integer.parseInt(br.readLine());
        br.close();
        
        for (int i = 1; i < 10; i++) {
            bw.write(dan + " * " + i + " = " + (dan * i) + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}