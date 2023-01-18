public class SpeedConverter {
    public static void main(String[] args){
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));
    }

    public static long toMilesPerHour(double kilometersPerHour){
//        long result;
        if (kilometersPerHour < 0){
//            result = -1;
            return -1;
        } else{
//            result = Math.round(kilometersPerHour *  0.621371);
            return Math.round(kilometersPerHour *  0.621371);
        }
//        return result;

    }


}
