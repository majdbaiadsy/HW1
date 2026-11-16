
public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int n = m.length;

        if (i == j) {
            return 0;
        }

        boolean[] visited = new boolean[n];
        boolean[] current = new boolean[n];

        current[i] = true;
        visited[i] = true;

        for (int distance = 1; distance < n; distance++) {
            boolean[] next = new boolean[n];
            boolean foundNew = false;

            for (int from = 0; from < n; from++) {
                if (!current[from]) {
                    continue;
                }

                for (int to = 0; to < n; to++) {
                    if (m[from][to] == 1 && !visited[to]) {
                        if (to == j) {
                            return distance;
                        }

                        next[to] = true;
                        foundNew = true;
                    }
                }
            }

            if (!foundNew) {
                return -1;
            }

            for (int v = 0; v < n; v++) {
                if (next[v]) {
                    visited[v] = true;
                }
            }

            current = next;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}
