public class BarkingDog {
    public static void main(String[] args){
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean results = false;

        if (hourOfDay < 0 && hourOfDay > 23){
            results = false;
        } else if ( hourOfDay < 8 || hourOfDay >= 9) {
            if (barking){
                results = true;
            }else {
                results = false;
            }
        }
        return results;
    }
}
//the program is not taking into negatives and if barking == true
