import java.awt.Rectangle;

/**
 * Class for the Rectangle Object required in BSTNode
 * 
 * @author Jaineel Nandu
 * @version 20201011
 */
public class RectangleObj implements Comparable<RectangleObj> {
    private String rectName;
    private Rectangle r;
    private Rectangle bound = new Rectangle(0, 0, 1024, 1024);

    /**
     * Constructor for the object
     * 
     * @param name
     *            String name of the rectangle.
     * @param x
     *            int x upper left co-ordinate
     * @param y
     *            int y upper left co-ordinate
     * @param w
     *            int width of the rectangle.
     * @param h
     *            int height of the rectangle.
     */
    public RectangleObj(String name, int x, int y, int w, int h) {
        this.rectName = name;
        r = new Rectangle(x, y, w, h);
    }


    /**
     * Constructor to create a RectangleObj Object.
     */
    public RectangleObj() {
        //Just to create an empty object;
    }


    /**
     * getter for the name
     * 
     * @return
     *         String name
     */
    public String getName() {
        return rectName;
    }


    /**
     * getter for the x value
     * 
     * @return
     *         int x
     */
    public int getX() {
        return r.x;
    }


    /**
     * getter for the y value
     * 
     * @return
     *         int y
     */
    public int getY() {
        return r.y;
    }


    /**
     * getter for the w value
     * 
     * @return
     *         int width
     */
    public int getW() {
        return r.width;
    }


    /**
     * getter for the h value
     * 
     * @return
     *         int height
     */
    public int getH() {
        return r.height;
    }


    /**
     * getter for the Rectangle object.
     * 
     * @return
     *         Rectangle r
     */
    public Rectangle getRect() {
        return r;
    }


    /**
     * Checks if the rectangle is a valid rectangle
     * 
     * @return
     *         boolean true if valid
     */
    public boolean isValid() {
        /*
            Implementation hidden, contact Author
        */
        return false;
    }


    @Override
    public String toString() {
        /*
            Implementation hidden, contact Author
        */
        return "";
    }


    /**
     * Returns object to string for removal method.
     * 
     * @return
     *         String of the searching rectangle.
     */
    public String remString() {
        /*
            Implementation hidden, contact Author
        */
        return "";
    }


    @Override
    public int compareTo(RectangleObj compRec) {
        /*
            Implementation hidden, contact Author
        */
        return 0;
    }


    /**
     * Checks if the object intersects with value
     * 
     * @param value
     *            rectangle to check
     * @return
     *         boolean true if intersects.
     */
    public boolean intersects(RectangleObj value) {
        return r.intersects(value.r);
    }


    /**
     * Checks if the rectangle matches the name with the other.
     * 
     * @param value
     *            RectangleObject to check.
     * @return
     *         True if Name matches exactly.
     */
    public boolean isNameOrRect(RectangleObj value) {
        return (rectName.equals(value.getName())) || r.equals(value.getRect());
    }
}
