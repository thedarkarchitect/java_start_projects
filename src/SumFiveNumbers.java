import java.util.Scanner;

public class SumFiveNumbers {
    public static void main(String[] args){
        System.out.println(fiveNumberSum(5));
    }

    public static String fiveNumberSum(int num){
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        boolean validNum = false;
        int addedNum = 0;
        int numbers = num;

        do {
            System.out.println("Enter number #" + num + ": ");
            String add = scanner.nextLine();
            try {
                //if the "add" is not an int the try will stop at line 20 and go to the catch
                addedNum = Integer.parseInt(add);
                num--;
                counter += addedNum;
            }catch (NumberFormatException badUserData){
                System.out.println("Invalid number");
            }

            validNum = num <= 0? true : false;
        }while(!validNum);

        return "The sum of the "+numbers+" numbers is "+counter;
    }
}
