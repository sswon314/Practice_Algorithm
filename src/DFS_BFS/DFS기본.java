package DFS_BFS;

import java.util.*;

// stack 또는 recursive로 구현
public class DFS기본 {
    // 그래프 (2차원 배열 혹은 linkedlist)
    static int[][] graph = new int[10][10]; // n*n크기의 그래프
    static LinkedList<Integer>[] graph2=new LinkedList[10]; // n크기의 linkedlist배열

    public static List<Integer> DFS(int start) {

        // 최종 dfs 결과를 담을 리스트
        List<Integer> dfsList = new ArrayList<>();

        boolean[] visited = new boolean[graph.length];

        // recursive로 구현
        dfsSearch(start, visited, dfsList);

        return dfsList;
    }

    public static void dfsSearch(int start, boolean[] visited, List<Integer> dfsList) {
        // start노드를 visited를 true로 + 결과 list에 추가
        visited[start - 1] = true;
        dfsList.add(start);

        // 그래프에서 start노드와 인접한 노드를 찾고
        // 그 노드가 visited가 아니라면 재귀함수 호출로 서치
        // 인접한 노드를 모두 visited했다면 그대로 함수 종료
        for (int i = 0; i < graph.length; i++) {
            if (graph[start - 1][i] == 0)
                continue;
            else {
                if (!visited[i])
                    dfsSearch(i + 1, visited,  dfsList);
            }
        }
    }

    // stack으로 구현
}
