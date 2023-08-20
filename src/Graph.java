import java.util.*;

class Graph
{
    private int V;
    private LinkedList<Integer> adj[];

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }

    }
    void addEdge(int v, int w) {
        adj[v].add(w);
    }
    void BFS(int s) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        visited[s] = true;
        linkedList.add(s);


        while (linkedList.size()!=0){
            s = linkedList.pop();
            System.out.println(s+" ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()){
                int n = i.next();
                if (!visited[n]){
                    visited[n] = true;
                    linkedList.add(n);
                }

            }
        }

    }

    public static void main(String args[])
    {
        Graph g = new Graph(8);

        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        g.addEdge(3, 6);
        g.addEdge(5, 6);
        g.addEdge(6, 7);

        g.BFS(1);
    }
}

