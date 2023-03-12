import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args){
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        int count = 0;
        int average = 0;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter number: ");
            String num = scanner.nextLine();
            try {
                int number = Integer.parseInt(num);

                sum += number;
                count++;
            }catch(NumberFormatException badUserData){
                break;
            }

        }

        try {
            average = sum / count;
        }catch(ArithmeticException nfe){
            sum = 0;
            average = 0;
        }

        System.out.println("SUM:"+sum+" AVG:"+average);

    }
}
