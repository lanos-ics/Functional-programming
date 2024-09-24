public class Rectangle {
    private int length,breadth;

     Rectangle(int breadth, int length) {
        this.breadth = breadth;
        this.length = length;
    }

    // working method:

    int area()
    {
        return length * breadth;
    }
    boolean isSquare()
    {
        return length == breadth;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }
}
