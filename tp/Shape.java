package tp;
abstract public class Shape {

    private double startPosition;

    Shape(double startPosition){
        this.startPosition = startPosition;
    }

    abstract double calculateVolume();

    abstract  double findArea();


    void move(double nextPosition){
        System.out.println("Has moved from" + startPosition + "to" + nextPosition );
    }
}

