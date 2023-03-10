public class FlourPackProblem {

    public static void main(String[] args){
        System.out.println(flourPacker(2, 0, 9));
        System.out.println(flourPacker(1, 0, 4));
        System.out.println(flourPacker(1, 0, 5));
        System.out.println(flourPacker(0, 5, 4));
        System.out.println(flourPacker(2, 2, 11));
        System.out.println(flourPacker(-3, 2, 12));

    }

    public static Boolean flourPacker(int bigCount, int smallCount, int goal){
        boolean result = false;
        if ((bigCount < 0) || (smallCount < 0)){
            return false;

        }else{
            int big = bigCount * 5;
            int availableFlour = big + smallCount;
            int leftOver = availableFlour - goal;
            if (leftOver >= 0){
                int smallLeft = smallCount - leftOver;

                int needed = big +  Math.abs(smallLeft);

                if(needed == goal){
                    result = true;
                }else{
                    result = false;
                }
            }

        }
        return result;
    }
}
