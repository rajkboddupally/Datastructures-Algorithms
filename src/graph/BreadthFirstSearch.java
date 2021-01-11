package graph;


import edu.princeton.cs.algs4.Queue;

public class BreadthFirstSearch {
    private boolean[] marked;
    private int[] edgeTo;

    BreadthFirstSearch(Graph g, int s){
        this.marked = new boolean[g.V()];
        this.edgeTo = new int[g.V()];

        bfs(g,s);
    }

    private void bfs(Graph G, int s) {

        Queue<Integer> queue = new Queue<>();
        queue.enqueue(s);
        marked[s] = true;

        while(!queue.isEmpty()){
            int v = queue.dequeue();
            for(int w:G.adj(v)){
                marked[w] = true;
                edgeTo[w] = v;
            }
        }
    }
}
