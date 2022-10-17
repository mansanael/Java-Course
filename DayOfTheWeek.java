public class DayOfTheWeek {

       
       String dayOfTheWeek(int D) {
        String theDay = "";
        switch (D) {
            case 1:
                theDay = "Monday";
                break;
            case 2:
                theDay = "Thuesday";
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
