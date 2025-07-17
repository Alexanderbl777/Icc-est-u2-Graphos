package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Cell;

public class MazeSolverRecursivoCompleto implements MazeSolber {
    @Override
    public List<Cell> getPath(boolean[][] grid, Cell start, Cell end) {
        if(grid == null || grid.length == 0){
            return new ArrayList<>();
        }
        List<Cell> path = new ArrayList<>();
        if(findPath(grid, start, end, path)){
            return path;
        }
        return new ArrayList<>();
    }

     private boolean findPath(boolean[][] grid, Cell start, Cell end, List<Cell> path) {
        int rol = start.rol;
        int col = start.col;

        if (rol < 0 || col < 0 || rol >= grid.length || col >= grid[0].length || !grid[rol][col]) {
            return false;
        }

        if (rol == end.rol && col == end.col) {
            path.add(start);
            return true;
        }

        grid[rol][col] = false; 

        if (findPath(grid, new Cell(rol + 1, col), end, path) ||
            findPath(grid, new Cell(rol, col + 1), end, path) ||
            findPath(grid, new Cell(rol - 1, col), end, path) ||
            findPath(grid, new Cell(rol, col - 1), end, path)) {
            path.add(start);
            return true;
        }

        grid[rol][col] = true;
        return false;
    }
}
