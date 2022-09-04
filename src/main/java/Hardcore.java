public class Hardcore {

    public static String convert2RomanNumerals(int number){
        String RomanNumerals = null;
        // define
        if(number == 0){
            String Message = "0 is not defined in roman numerals.";
            return Message;
        } else if (number == 1) {
            RomanNumerals = "I";
        } else if (number == 5) {
            RomanNumerals = "V";
        } else if (number == 10) {
            RomanNumerals = "X";
        } else if (number == 50) {
            RomanNumerals = "L";
        } else if (number == 100) {
            RomanNumerals = "C";
        } else{
            RomanNumerals = "IIIIIIIII";
        }
        return RomanNumerals;
    }

//    public static String plus(int number){
//        if(number>1 && number <4){
//           String result = convert2RomanNumerals(1).repeat();
//        }
//    }


}
