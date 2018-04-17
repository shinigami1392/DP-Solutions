package practice.solutions.ctci.graphs.trees;

import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    public String name;
    public boolean marked;
    public List<GraphNode> adjacencyList;
    GraphNode(String name){
        this.name = name;
        this.marked = false;
        adjacencyList = new ArrayList<>();
    }
}
