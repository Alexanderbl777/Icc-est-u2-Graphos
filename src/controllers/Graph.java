package controllers;

import java.util.*;

import models.Node;

public class Graph {

    Set<Node> nodes;

    public Graph() {
        this.nodes = new HashSet<>();
    }

    public Node addNode(int value) {
        Node newNode = new Node(value);
        nodes.add(newNode);
        return newNode;
    }

    public void addEdge(Node src, Node dest) {
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }

    public void addEdgeUni(Node src, Node dest) {
        src.addNeighbor(dest);
    }

    public void printGraph() {
    // primero ordenamos los nodos
    List<Node> nodeList = new ArrayList<>(nodes);
    nodeList.sort(Comparator.comparingInt(Node::getValue));

    for (Node node : nodeList) {
        System.out.print("Vertex " + node.getValue() + ": ");
        
        // también ordenamos los vecinos
        List<Node> neighbors = new ArrayList<>(node.getNeighbors());
        neighbors.sort(Comparator.comparingInt(Node::getValue));

        for (Node neighbor : neighbors) {
            System.out.print(" -> " + neighbor.getValue() + " ");
        }
        System.out.println();
    }
}

    /** 

    public void getDFS(Node starNode){

    }

    public void getBFS(Node startnode){

    }

    public int[][] getAdjancencyMatrix(){

    }

    public void printAdjancencyMatrix(){
        
    }

     */
}

