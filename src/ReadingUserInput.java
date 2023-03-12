import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args){
        System.out.println(getInputFromScanner(2023));
    }

    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, What's your name? ");
        String name = scanner.nextLine();

        System.out.println("Hi "+name+", Thanks for taking the course!");

        System.out.println("What year were you born? ");

        Boolean validDOB = false;
        int age = 0;

        do{
            System.out.println("Enter a year of birth >= "+(currentYear - 125) +" and <= "+(currentYear));
            //in case of bad data
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            }catch (NumberFormatException badUserData){
                System.out.println("Characters not allowed!!! Try again.");
            }

        }while(!validDOB);

        return "So you are "+ age +" years old";
    }

    //method to validate the data
    public static  int checkData(int currentYear, String dateOfBirth){

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if((dob < minimumYear) || (dob > currentYear)){
            return -1;
        }

        return (currentYear - dob);
    }
}
