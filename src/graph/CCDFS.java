package graph;

//Connected components using DFS

public class CCDFS {
    private boolean[] marked;
    private int[] id;
    private int count;

    public CCDFS(Graph g) {
        this.marked = new boolean[g.V()];
        this.id = new int[g.V()];

        for (int v = 0; v < g.V(); v++) {
            if (!marked[v]) {
                dfs(g, v);
                count++;
            }
        }
    }

    private void dfs(Graph G, int v) {
        marked[v] = true;
        id[v] = count;
        for (int w : G.adj(v)) {
            if(!marked[w])
                dfs(G, w);
        }
    }
}
