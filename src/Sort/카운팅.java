package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 카운팅 정렬은 N의 값이 크고 값의 절대값(K)가 작을때 용이 하다
// O(n+k)인데 k가 작으면 O(n)과 유사해진다
public class 카운팅 {
    public static void countSort() throws IOException {
        // 입력되는 수가 매우 많기 때문에 기본 Scanner를 사용하면 시간 초과가 걸린다
        // (BufferedReader를 쓰는 습관을 들이자!!)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int nums[] = new int[10001];

        for (int i = 0; i < n; i++) {
            nums[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            while (nums[i] > 0) {
                // "\n"로 string을 append하면 메모리 초과 문제가 발생할 수 있다
                sb.append(i).append('\n');
                nums[i]--;
            }
        }
        System.out.println(sb);
    }
}
