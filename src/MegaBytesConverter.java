public class MegaBytesConverter {
    public static void main(String[] args){
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        double mbz =  1024d;
        int XX = kiloBytes;
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            double YY = kiloBytes / mbz;
            double ZZ = kiloBytes % mbz;
        System.out.println(XX + "KB = " + (int) Math.floor(YY) + " MB and " + (int) ZZ + " KB");
        }
    }
}
