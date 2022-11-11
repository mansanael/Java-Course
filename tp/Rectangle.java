package tp;
public class Rectangle extends Shape{

    private double length;

    private double width;

    /**
     *
     * @param startPosition initial position of the shape
     */
    Rectangle(double startPosition, double length, double width) {
        super(startPosition);
        this.length = length;
        this.width = width;
    }

    /**
     * Calculate Rectangle Volume
     * @return
     */
    @Override
    double calculateVolume() {
        return 0;
    }

    /**
     * find the area of the rectangle
     * @return
     */
    @Override
    double findArea() {
        return (this.width*this.length);
    }

    public static void main(String args[]){
        Shape shape = new Rectangle(1, 12, 30);
        double area = shape.findArea();
        System.out.println(area);
    }
}
