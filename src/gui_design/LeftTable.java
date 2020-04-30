package gui_design;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class LeftTable extends RightTable implements MouseListener,MouseMotionListener{
    //this is the panel where the user draws by clicking the mouse
    /*
    A left mouse click draws(or marks) the cell whereas a right mouse click undoes it. This needs to record the clicking events of
    the mouse and hence implements the interfaces MouseListener and MouseMotionListener.

     */

    public LeftTable(int w, int h, int count) {
        super(w, h,count);
        addMouseMotionListener(this);
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        //mark each time the mouse is clicked
        //This marking is done after checking the range of the region where the mouse is clicked.
        paintSections(e);

    }

    private void paintSections(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
            for (Cell c : cell) {
                //System.out.print(c.getWidth()+" "+c.getX()+" ");
                if (e.getX() > c.getX() && e.getX() < c.getX() + c.getWidth() && e.getY() > c.getY() && e.getY() < c.getY() + c.getHeight()) {
                    {   //  System.out.print(("true "));
                        c.setFlag(true);
                    }

                }
            }
        } else if (SwingUtilities.isRightMouseButton(e)) {
            for (Cell c : cell) {
                if (e.getX() > c.getX() && e.getX() < c.getX() + c.getWidth() && e.getY() > c.getY() && e.getY() < c.getY() + c.getHeight())
                    c.setFlag(false);
            }
        }

        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        paintSections(e);

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
