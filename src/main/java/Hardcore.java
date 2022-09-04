public class Hardcore {

    public static String convert2RomanNumerals(int number){
        String RomanNumerals = null;
        // pre defined numbers
        if(number == 0){
            String Message = "0 is not defined in roman numerals.";
            return Message;
        } else if (number == 1) {
            RomanNumerals = "I";
        } else if (number == 5) {
            RomanNumerals = "V";
        } else if (number == 10) {
            RomanNumerals = "X";
        } else if (number == 15) {
            RomanNumerals = "XV";
        } else if (number == 50) {
            RomanNumerals = "L";
        } else if (number == 100) {
            RomanNumerals = "C";
        } else{
            RomanNumerals = "IIIIIIIII";
        }
        return RomanNumerals;
    }

    public static String plus(int number){
        int quotient = number / 10;
        int remainder = number % 10;
        String RomanNumebrals = null;

        switch (quotient){
            case 0:
                RomanNumebrals = convert2RomanNumerals(1);
                switch(remainder){
                    case 1:
                        return RomanNumebrals;
                    case 2:
                        return RomanNumebrals.repeat(2);
                    case 3:
                        return RomanNumebrals.repeat(3);
                    case 6:
                        RomanNumebrals = convert2RomanNumerals(5);
                        return RomanNumebrals+convert2RomanNumerals(1).repeat(1);
                    case 7:
                        RomanNumebrals = convert2RomanNumerals(5);
                        return RomanNumebrals+convert2RomanNumerals(1).repeat(2);
                    case 8:
                        RomanNumebrals = convert2RomanNumerals(5);
                        return RomanNumebrals+convert2RomanNumerals(1).repeat(3);
                }
                break;
            case 1:
                switch(remainder){
                    case 0:
                        RomanNumebrals = convert2RomanNumerals(10);
                        return RomanNumebrals;
                    case 1:
                        RomanNumebrals = convert2RomanNumerals(10);
                        return RomanNumebrals+convert2RomanNumerals(1);
                    case 2:
                        RomanNumebrals = convert2RomanNumerals(10);
                        return RomanNumebrals+convert2RomanNumerals(1).repeat(2);
                    case 3:
                        RomanNumebrals = convert2RomanNumerals(10);
                        return RomanNumebrals+convert2RomanNumerals(1).repeat(3);
                    case 6:
                        RomanNumebrals = convert2RomanNumerals(15);
                        return RomanNumebrals+convert2RomanNumerals(1).repeat(1);
                    case 7:
                        RomanNumebrals = convert2RomanNumerals(15);
                        return RomanNumebrals+convert2RomanNumerals(1).repeat(2);
                    case 8:
                        RomanNumebrals = convert2RomanNumerals(15);
                        return RomanNumebrals+convert2RomanNumerals(1).repeat(3);
                }
            break;

        }

        return RomanNumebrals;
    }


}
