public class MinutesToYearsandDaysCalculator {
    public static void main(String[] args){
        printYearsAndDays(525600);
        printYearsAndDays(1050200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }else{
            double min = (float) minutes;
            double year = Math.round((min / 525600));
            double days = (((min % 525600) / 1440) % 365);
            if (days >= 364){
                days = 0;
            }

            System.out.println(minutes+" min = "+(long)year+" y and "+ (long) days+" d");
//            System.out.println(minutes+" min = "+  (long)year+" y ");
        }
    }
}
