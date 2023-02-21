public class SumThreeAndFive {
    public static void main(String[] args){
        int sum = 0;
        int counter = 0;
        for (int num = 1; num<=1000; num ++){
            if (num % 3 == 0 && num % 5 == 0){
                sum += num;
                counter ++;
                if (counter == 5){
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
