public class isEvenNumber {
    public static void main(String[] args) {
        int j = 5;

        while (j <= 20) {
            if (EvenNumber(j)) {
                System.out.println(j);
            }
            j ++ ;
        }
    }

    public static boolean EvenNumber(int num){
        if (num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}




