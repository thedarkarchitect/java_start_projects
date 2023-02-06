public class CentimeterConverter {
    public static void main(String[] args){
        System.out.println("5ft, 8 inches "+ convertToCentimeters(5, 8)+ " cm");
        System.out.println("12 inches "+ convertToCentimeters(+ 12)+ " cm");
    }

    public static double convertToCentimeters(int height){
        double height_in_centimeters = 2.54 * height;
        return height_in_centimeters;
    }
    public static double convertToCentimeters(int height_in_feet, int height_in_inches){
        int height_to_inches = (height_in_feet * 12) + height_in_inches;
        return  convertToCentimeters(height_to_inches);
    }
}
