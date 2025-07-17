package models;

public class Cell {

    public int rol;
    public int col;
    public Cell(int rol, int col) {
        this.rol = rol;
        this.col = col;
    }
    @Override
    public String toString() {
        return "Cell-("+rol+", "+col+")";
    }

    

}
