package DFS_BFS;

import java.util.*;

// queue로 구현
public class BFS기본 {
    // 그래프 (2차원 배열 혹은 linkedlist)
    static int[][] graph; // n*n크기의 그래프
    static LinkedList<Integer>[] graph2=new LinkedList[10]; // n크기의 linkedlist배열

    public static List<Integer> BFS(int start) {
        // 최종 dfs 결과를 담을 리스트
        List<Integer> bfsList = new ArrayList<>();

        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<>();

        // start노드를 visited를 true로 + queue에 값 추가
        visited[start - 1] = true;
        queue.add(start);

        // queue에 들어있는 노드가 없다면 서치 종료
        while (!queue.isEmpty()) {
            // queue의 가장 앞에 있는 노드를 가져오고 list에 추가
            int x = queue.poll();
            bfsList.add(x);

            // 노드와 인접한 노드들을 찾고 visited가 아니면 queue에 추가
            for (int i = 0; i < graph.length; i++) {
                if (graph[x - 1][i] == 0)
                    continue;
                else {
                    if (!visited[i]) {
                        visited[i] = true;
                        queue.add(i + 1);
                    }
                }
            }
        }

        return bfsList;
    }
}
