public class isEvenNumber {
    public static void main(String[] args) {
        int j = 5;
        int even_count = 0;
        int odd_count = 0;

        while (j <= 20) {
            if (EvenNumber(j)) {
                System.out.println(j);
                even_count += 1;
                if (even_count == 5) {
                    break;
                }
            }else{
                odd_count += 1;
            }
            j ++ ;
        }
        System.out.println("Odd number count = "+odd_count);
        System.out.println("Even number count = "+even_count);
    }

    public static boolean EvenNumber(int num){
        if (num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}




