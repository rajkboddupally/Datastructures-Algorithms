package graph;

import edu.princeton.cs.algs4.DepthFirstPaths;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

public class DFS {
    private boolean[] marked;
    private int[] edgeTo;
    private final int s;

    public DFS(Graph g, int s) {
        marked = new boolean[g.V()];
        edgeTo = new int[g.V()];
        this.s = s;
        dfs(g, s);
    }

    private void dfs(Graph g, int v) {
        marked[v] = true;
        for (int w : g.adj(v)) {
            if (!marked[w]) {
                dfs(g, w);
                edgeTo[w] = v;
            }
        }
    }

    public Iterable<Integer> PathTo(int v) {
        if (!connected(v))
            return null;
        Stack<Integer> path = new Stack<>();

        for (int x = v; x != s; x = edgeTo[x]) {
            path.push(x);
        }
        path.push(s);
        return path;
    }

    private boolean connected(int v) {
        return marked[v];
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        edu.princeton.cs.algs4.Graph G = new edu.princeton.cs.algs4.Graph(in);
        int s = Integer.parseInt(args[1]);
        DepthFirstPaths dfs = new DepthFirstPaths(G, s);

        for (int v = 0; v < G.V(); v++) {
            if (dfs.hasPathTo(v)) {
                StdOut.printf("%d to %d:  ", s, v);
                for (int x : dfs.pathTo(v)) {
                    if (x == s) StdOut.print(x);
                    else        StdOut.print("-" + x);
                }
                StdOut.println();
            }

            else {
                StdOut.printf("%d to %d:  not connected\n", s, v);
            }

        }
    }

}
