public class Cattle extends Mammal{

    private int numberOfHead;

    public Cattle (int numberOfEyes, int numberOfHead){
        super(numberOfEyes);
        this.numberOfHead = numberOfHead;
    }

    public static void main(String[] args){
        Cattle mainCattle = new Cattle(2, 1);
        mainCattle.closeEye();

    }
}
