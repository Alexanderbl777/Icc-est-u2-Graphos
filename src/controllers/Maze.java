package controllers;

public class Maze {
    private boolean[][] mazeP;
   

    public Maze(boolean[][] mz) {
        mazeP = new boolean[mz.length][mz[0].length];
        for (int i = 0; i < mz.length; i++) {
            for (int j = 0; j < mz[i].length; j++) {
                mazeP[i][j] = mz[i][j];
            }
        }
    }

    public void printMaze() {
        for (int i = 0; i < mazeP.length; i++) {
            for (int j = 0; j < mazeP[i].length; j++) {
                if (mazeP[i][j]) {
                    System.out.print("- ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println(); 
        }
    }

    public boolean[][] getMazeP() {
        return mazeP;
    }

    public void setMazeP(boolean[][] mazeP) {
        this.mazeP = mazeP;
    }
    
    
}
