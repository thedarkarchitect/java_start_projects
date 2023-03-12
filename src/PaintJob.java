public class PaintJob {
    public static void main(String[] args){
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if ((width < 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)){
            return -1;
        }else {
            double Area = width * height;
            double bucketsNeeded = Area / areaPerBucket;
            long requiredBuckets = Math.round(bucketsNeeded) - extraBuckets;
            int Buckets = (int) requiredBuckets;
            return Buckets;
        }
    }
}
