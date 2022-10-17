
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

        System.out.println(sumThousand());

        System.out.println(sumEven());
        
    }

    String dayOfTheWeek(int D) {
        String theDay = "";
        switch (D) {
            case 1 -> theDay = "Monday";
            case 2 -> theDay = "Tuesday";
            case 3 -> theDay = "Wednesday";
            case 4 -> theDay = "Thursday";
            case 5 -> theDay = "Friday";
            case 6 -> theDay = "Saturday";
            case 7 -> theDay = "Sunuday";
            default -> {
            }
        }
        return theDay;
    }
    public static int sumThousand(){
       int sum = 0;
       int i = 0;
        while (i<1000){
            i++;
            sum+=i;
        }
        return sum;
    }

    public static int sumEven(){
        int sum = 0;
        for (int i = 12; i < 104 ; i+=2) {
            sum+=i;
        }

        return sum;
    }
}