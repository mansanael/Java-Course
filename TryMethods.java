public class TryMethods {
    /**
     * This methods is the TryMethods
     * We will have for methods in this class
     * 
     * @param args
     */
    public static void main(String[] args) {
        DayOfTheWeek myDay = new DayOfTheWeek();
        String theDay = myDay.dayOfTheWeek(3); 
        System.out.println(theDay);

        TryMethods Mood  = new TryMethods();
        Mood.ifStatementMood("Happy");
        
    }

    public void ifStatementMood (String mood){
        if (mood == "Happy"){
            System.out.println("This guy is happy ! Hourra !");
        } else if (mood == "Sad") {
            System.out.println("Sorry ! Enjoy life my guy !");
        }else {
            System.out.println("No Mood !");
        }
    }

    
}