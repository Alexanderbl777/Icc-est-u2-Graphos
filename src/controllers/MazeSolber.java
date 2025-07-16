package controllers;

import java.util.List;

import models.Cell;

public interface MazeSolber {

    List<Cell> getPath(boolean[][] grid, Cell start, Cell end);
    
}