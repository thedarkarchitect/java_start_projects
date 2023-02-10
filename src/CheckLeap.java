public class CheckLeap {
    public static void main(String[] args){
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));

    }

    public static boolean isLeapYear(int year){
        if (year <= 0 || year >= 9999){
            return false;
        }else{
            boolean ans;
            if ((year % 4) == 0){
                if((year % 100) == 0){
                    if((year % 400) == 0){
                        ans = true;
                    }else{
                        ans = false;
                    }
                }else {
                    ans = true;
                }
            }else{
                ans = false;
            }
            return ans;
        }
    }

    public static String getDaysInMonth(int month, int year){

        if (year < 1 || year > 9999){
            return "invalid year";
        }

        if (month < 1 || month > 12){
            return "invalid month";
        }

        String nameMonth = switch(month){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Not month of the year";
        };

        String days = switch (month){
            case 1,3,5,7,8,10,12 -> nameMonth+" has 31days";
            case 4,6,9,11 -> nameMonth+" has 30 days";
            case 2 -> {
                if (isLeapYear(year) == true){
                    yield nameMonth + " has 29 days because the "+year+" is a leap year";
                }else{
                    yield nameMonth + " has 28 days";
                }

            }
            default -> "no other days";
            };
            return days;

    }
}
