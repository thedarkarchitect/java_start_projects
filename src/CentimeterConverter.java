public class CentimeterConverter {
    public static void main(String[] args){
        System.out.println(convertToCentimeters(5, 8));
        System.out.println(convertToCentimeters(12));
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
