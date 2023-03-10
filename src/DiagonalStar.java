public class DiagonalStar {

    public static void main(String[] args){
        printSquareStart(8);
        printSquareStart(8);
        printSquareStart(3);
    }

    public static void printSquareStart(int num){
        if (num < 5){
            System.out.println("Invalid Value");
        }else{
            for (int i = 0; i < num; i++){//loop denoting rows
                for(int j = 0; j < num ; j++ ){//loop denoting columns

                    // Checking boundary conditions
                    // and main diagonal and
                    // secondary diagonal conditions
                    if(i == 0 || j == 0 || i == j || i == num -1 || j == num -1 || i + j == num - 1 ) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();

            }
        }
    }
}
