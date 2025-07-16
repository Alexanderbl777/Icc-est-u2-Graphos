import java.util.Arrays;
import java.util.List;

import controllers.Graph;
import controllers.Maze;
import controllers.MazeSolber;
import controllers.MazeSolverRecursivo;
import models.Cell;
import models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---Practica Graphos---");
        System.out.println("Alexander Beltran");
        //runGraph();
        runMaze();

    }

    public static void runGraph(){
        Graph graph = new Graph();

        Node n0 = graph.addNode(0);
        Node n1 = graph.addNode(1);
        Node n2 = graph.addNode(2);
        Node n3 = graph.addNode(3);
        Node n4 = graph.addNode(4);
        Node n5 = graph.addNode(5);
        Node n7 = graph.addNode(7);
        Node n8 = graph.addNode(8);
        Node n9 = graph.addNode(9);

        graph.addEdge(n0, n1);
        graph.addEdge(n0, n3);
        graph.addEdge(n0, n5);
        graph.addEdge(n1, n2);
        graph.addEdge(n1, n4);
        graph.addEdge(n1, n8);
        graph.addEdge(n3, n4);
        graph.addEdge(n3, n7);
        graph.addEdge(n3, n9);
        graph.addEdge(n7, n8);
        graph.addEdge(n2, n3);


        graph.printGraph();
    }

   public static void runMaze() {
        boolean[][] mazeB = {
            {true, true, true, true},
            {false, true, true, true},
            {true, true, false, false},
            {true, true, true, true}
        };

        Maze maze = new Maze(mazeB);
        System.out.println("Laberinto cargado:");
        maze.printMaze();

        Cell start = new Cell(0, 0);
        Cell end = new Cell(3, 3);

        List<MazeSolber> solvers = Arrays.asList(
            new MazeSolverRecursivo()

        );

        MazeSolber solver = solvers.get(0);

        List<Cell> path = solver.getPath(maze.getMazeP(), start, end);
        System.out.println(path);

        
    }
}
