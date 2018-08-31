package practice.solutions.ctci.graphs.trees;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class RouteBetweenNodes {

    String s;
    public static void main(String[] args) {

    }

    public boolean hasRoute(GraphNode source, GraphNode destination){
        Queue<GraphNode> queue = new LinkedList<>();
        source.marked = true;
        queue.add(source);

        while(!queue.isEmpty()){
            GraphNode node = queue.poll();
            node.marked = true;
            for(GraphNode adj : node.adjacencyList){
                if (!adj.marked){
                    if(adj == destination){
                        return true;
                    }
                    adj.marked = true;
                    queue.add(adj);
                }
            }

        }
        return false;
    }
}
