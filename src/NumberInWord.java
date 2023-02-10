public class NumberInWord {
    public static void main(String[] args){
        printNumberInWord(2);
        printNumberInWord(4);
        printNumberInWord(8);
        printNumberInWord(232);
        printNumberInWord(-4);

    }

    public static void printNumberInWord(int number){
        String numberToWord = switch (number){
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "Other";
        };
        if (number >= 0 && number <= 9) {
            System.out.println("The number " + number + " is '" + numberToWord + "' in words");
        }else {
            System.out.println(numberToWord);
        }
    }
}
