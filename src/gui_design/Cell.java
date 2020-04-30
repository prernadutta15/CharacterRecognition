package gui_design;

public class Cell {
    /**This class forms the backbone of the matrix used for drawing/displaying/identifying characters.
     * Each cell of the matrix is individually defined by the following attributes:
     * a)height of the cell
     * b)width of the cell
     * c)an indicator to indicate whether a cell is marked or not
     * d)the x-coordinate
     * e)the y-coordinate
     * [note: A cell can either be marked or unmarked,any third category is not possible]
     */
    /*code starts here*/
    private int x;//x-coordinate
    private int y;//y-coordinate
    private int width;
    private int height;
    private boolean flag;//for indicating marked/unmarked cell

    public Cell(int x, int y, int w, int h) {
        //constructor
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
        this.flag = false;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean active) {
        flag = active;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
