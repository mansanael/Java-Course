
public class TryMethods {
    /**
     * This methods is the TryMethods
     * We will have for methods in this class
     * 
     * @param args
     */
    public static void main(String[] args) {
        TryMethods myDay = new TryMethods();

        String theDay = myDay.dayOfTheWeek(3); 
        System.out.println(theDay);
        
    }

    String dayOfTheWeek(int D) {
        String theDay = "";
        switch (D) {
            case 1:
                theDay = "Monday";
                break;
            case 2:
                theDay = "Tuesday";
                break;
            case 3:
                theDay = "Wednesday";
                break;
            case 4:
                theDay = "Thursday";
                break;
            case 5:
                theDay = "Friday";
                break;
            case 6:
                theDay = "Saturday";
                break;
            case 7:
                theDay = "Sunuday";
                break;
            default:
                break;

        }
        return theDay;
    }

    
}