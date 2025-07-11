package models;

import java.util.*;

public class Node {
    private int value;
    private Set<Node> neighbors;

    public Node(int value) {
        this.value = value;
        this.neighbors = new HashSet<>();
    }

    public int getValue() {
        return value;
    }

    public Set<Node> getNeighbors() {
        return neighbors;
    }

    public void addNeighbor(Node node) {
        this.neighbors.add(node);
    }

    @Override
    public String toString() {
        return "Node{" + "value=" + value + '}';
    }
}
