public class BarkingDog {
    public static void main(String[] args){
//        System.out.println(shouldWakeUp(true, 1));
//        System.out.println(shouldWakeUp(false, 2));
//        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -25));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean result = false;

        if (hourOfDay < 0 && hourOfDay > 23){
            result = false;
        } else if ( hourOfDay < 8 ) {
            if ( barking == false ){
                result = false;
            }else {
                result = true;
            }
        } else if ( hourOfDay >= 8) {
            result =  false;
        }
        return result;
    }
}
