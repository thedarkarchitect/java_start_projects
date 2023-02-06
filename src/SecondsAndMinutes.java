public class SecondsAndMinutes {
    public static void main(String[] args){
        System.out.println(getDurationString(5400));
        System.out.println(getDurationString(65, 45));

    }

    public static String getDurationString( int seconds ){
        if (seconds < 0){
            return "invalid data for seconds ("+ seconds +"), must be a  positve integeer value";
        }
       // we pass in expresssions to make it easy to validate the code and also make the code concise
       return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0){
            return "invalid data for minutes("+ minutes +"), must be a positive integer value";
        }

        if (seconds < 0 || seconds >= 59){
            return "invalid data for seconds("+ seconds +"), must be between 0 and 59";
        }

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours+"h "+remainingMinutes+"m "+remainingSeconds+"s";
    }
}
