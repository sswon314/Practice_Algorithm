package Time_Memory_Over;

import java.io.*;

public class 시간초과 {
    public static void timeOver() throws IOException {
        // Scanner를 사용하면 시간 초과가 걸릴수도 있다
        // BufferedReader를 사용하자!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int x = Integer.parseInt(br.readLine());

        // System.out.println()가 자주 사용되면 시간 초과가 걸릴 수도 있다.
        // StringBuilder를 사용하자!
        StringBuilder sb = new StringBuilder();

        // System.out.print() == sb.append()
        // System.out.println() == sb.append().append('\n')
        sb.append(str).append('\n');
    }
}
