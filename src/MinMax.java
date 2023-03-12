import java.util.Scanner;

public class MinMax {
    public static void main(String[] args){
        minMaxNumber();
    }
    public static void minMaxNumber(){
        Scanner scanner = new Scanner(System.in);
        //the 2 variables below letyou keep track of the min and max values  entered by the user
        double max = 0;
        double min = 0;
        int loopCount = 0;

        while(true){
            System.out.println("Enter a number, or any character to exit: ");
            String nextEntry = scanner.nextLine();

            try{
                double validNum = Double.parseDouble(nextEntry);
                if(loopCount == 0 || validNum < min){
                    min = validNum;
                }

                if (loopCount == 0 || validNum > max){
                    max = validNum;
                }
                loopCount ++;
            }catch(NumberFormatException badUserData){
                break;
            }
        }

    }
}
