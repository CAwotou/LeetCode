import java.util.Arrays;

public class FindRedundantDirectedConnection {
    public int[] find(int[][] edges) {
        int len = edges.length;
        int[] inDegree = new int[len + 1];
        for (int[] edge : edges) {
            inDegree[edge[1]]++;
        }
        for (int i = len - 1; i >= 0; i--) {
            if (inDegree[edges[i][1]] == 2) {
                if (!judgeCircle(edges, len, i)) {
                    return edges[i];
                }
            }
        }
        for (int i = len - 1; i >= 0; i--) {
            if (inDegree[edges[i][1]] == 1) {
                if (!judgeCircle(edges, len, i)) {
                    return edges[i];
                }
            }
        }
        throw new IllegalArgumentException("输入不符合要求");
    }

    public boolean judgeCircle(int[][] edges, int len, int removeEdgeIndex) {
        UnionFind unionFind = new UnionFind(len + 1);
        for (int i = 0; i < len; i++) {
            if (i == removeEdgeIndex) {
                continue;
            }
            if (!unionFind.union(edges[i][0], edges[i][1])) {
                return true;
            }
        }
        return false;
    }

    public class UnionFind {
        private int[] parent;
        public UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            while (x != parent[x]) {
                parent[x] = parent[parent[x]];
                x = parent[x];
            }
            return x;
        }

        public boolean union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return false;
            }
            parent[rootX] = rootY;
            return true;
        }
    }

    public static void main(String[] args) {
        int[][] edges = {{1, 2}, {2, 3}, {3, 4}, {4, 1}, {1, 5}};
        FindRedundantDirectedConnection test = new FindRedundantDirectedConnection();
        int[] res = test.find(edges);
        System.out.println(Arrays.toString(res));
    }
}


