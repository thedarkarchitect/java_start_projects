public class TeenChecker {
    public static void main(String[] args){
        System.out.println(TeenNumberChecker(9,99,19));
        System.out.println(TeenNumberChecker(23,15,42));
        System.out.println(TeenNumberChecker(22,23,34));
    }

    public static boolean TeenNumberChecker(int num1, int num2, int num3){
        if ((num1 > 13 || num1 < 19) || (num2 > 13 || num2 < 19) || (num3 > 13 || num3 < 19)){
            return true;
        }else{
            return false;
        }
    }
}
