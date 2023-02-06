public class AreaCalculator {
    public static void main(String[] args){
        System.out.println("Area of a Circle is "+area(5.0));
        System.out.println("Area of a Circle is "+area(-1));
        System.out.println("Area of a rectangle " + area(5.0, 9.0));
        System.out.println("Area of a rectangle "+ area(5.0, -4.0));
    }

    public static double area(double radius){
        double Pi = 3.141592654;
        if (radius < 0){
            return -1.0;
        }else{
            return Pi * (Math.pow(radius, 2));
        }
    }

    public static double area(double x, double y){
        if (x < 0 || y < 0){
            return -1.0;
        }else{
            return x * y ;
        }
    }
}
