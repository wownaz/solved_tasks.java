import java.util.*;
class Graph1
{
    int V;
    LinkedList<Integer>[] adj;

    Graph1(int v) {
        V= v;
        adj = new LinkedList[v];

        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }
    void addEdge(int v, int w) {
        adj[v].add(w);
    }
    void DFS(int n) {
        boolean nodes[] = new boolean[V];

        Stack<Integer> stack = new Stack<>();
        stack.push(n);
        int a = 0;

        while(!stack.empty()) {
            n = stack.peek();
            stack.pop();

            if(nodes[n] != true) {
                System.out.println(n);
                nodes[n] = true;
            }

            for (int i = 0; i < adj[n].size(); i++)
            {
                a = adj[n].get(i);
                if (!nodes[a])
                {
                    stack.push(a);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Graph1 g = new Graph1(7);

        g.addEdge(0, 1);
        g.addEdge(0, 5);
        g.addEdge(0, 6);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(1, 5);
        g.addEdge(4, 6);
        g.addEdge(4, 2);
        g.addEdge(6, 0);

        g.DFS(0);
    }
}