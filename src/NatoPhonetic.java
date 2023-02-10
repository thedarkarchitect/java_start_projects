public class NatoPhonetic {
    public static void main(String[] args){
        char letter = 'E' ;

        switch (letter){
            case 'A':
                System.out.println("Able");
                break;

            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;

            default:
                System.out.println("The letter " +letter+" was not found");

        }
        printDayOfWeek(3);
        printDayOfWeek(2);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(12);

        printWeekDay(12);
        printWeekDay(6);
        printWeekDay(5);
        printWeekDay(2);
        printWeekDay(3);

    }

    public static void printDayOfWeek(int day){
        String dayOfTheWeek = switch (day){
            case 0 -> {
                yield "Sunday";
            }
            case 1 ->{
                yield "Monday";
            }
            case 2 -> {
                yield "Tuesday";
            }
            case 3 -> {
                yield "Wednesday";
            }
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 ->  "Saturday";
            default -> "The day does not exist";

        };
        System.out.println("the day "+day+" is "+dayOfTheWeek);
    }

    public static void printWeekDay(int day){
        if (day == 0){
            System.out.println("Sunday");
        }else if (day == 1){
            System.out.println("Monday");
        }else if (day == 2){
            System.out.println("Tuesday");
        }else if (day == 3){
            System.out.println("Wednesday");
        }else if (day == 4){
            System.out.println("Thursday");
        }else if (day == 5){
            System.out.println("Friday");
        }else if (day == 6){
            System.out.println("Saturday");
        }else {
            System.out.println("That day doesn't exist");
        }
    }
}
