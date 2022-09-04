public class Hardcore {
    public static void main(String[] args) {
        for (int i = 0; i<=100; i++){
            System.out.println(i + " in römische Zahlen: " + convert2RomanNumerals(i));
        }
    }

    public static String preDefining(int number){
        String RomanNumerals = null;
        // pre defined numbers
        if (number == 1) {
            RomanNumerals = "I";
        } else if (number == 5) {
            RomanNumerals = "V";
        } else if (number == 10) {
            RomanNumerals = "X";
        } else if (number == 50) {
            RomanNumerals = "L";
        } else if (number == 100) {
            RomanNumerals = "C";
        }
        return RomanNumerals;
    }

    public static String convert2RomanNumerals(int number){
        int quotient = number / 10;
        int remainder = number % 10;
        String RomanNumerals1 = preDefining(1);
        String RomanNumerals5 = preDefining(5);
        String RomanNumerals10 = preDefining(10);
        String RomanNumerals50 = preDefining(50);
        String RomanNumerals100 = preDefining(100);
        if(number == 0){
            String Message = "0 is not defined in roman numerals.";
            return Message;
        }else{
            switch (quotient){
                case 0:
                    switch(remainder){
                        case 1:
                            return RomanNumerals1;
                        case 2:
                            return RomanNumerals1.repeat(2);
                        case 3:
                            return RomanNumerals1.repeat(3);
                        case 4:
                            return RomanNumerals1+RomanNumerals5;
                        case 5:
                            return RomanNumerals5;
                        case 6:
                            return RomanNumerals5+ RomanNumerals1;
                        case 7:
                            return RomanNumerals5+ RomanNumerals1.repeat(2);
                        case 8:
                            return RomanNumerals5+ RomanNumerals1.repeat(3);
                        case 9:
                            return RomanNumerals1+RomanNumerals10;
                    }
                    break;
                case 1:
                    switch(remainder){
                        case 0:
                            return RomanNumerals10;
                        case 1:
                            return RomanNumerals10+RomanNumerals1;
                        case 2:
                            return RomanNumerals10+RomanNumerals1.repeat(2);
                        case 3:
                            return RomanNumerals10+RomanNumerals1.repeat(3);
                        case 4:
                            return RomanNumerals10+RomanNumerals1+RomanNumerals5;
                        case 5:
                            return RomanNumerals10+RomanNumerals5;
                        case 6:
                            return RomanNumerals10+RomanNumerals5+ RomanNumerals1;
                        case 7:
                            return RomanNumerals10+RomanNumerals5+ RomanNumerals1.repeat(2);
                        case 8:
                            return RomanNumerals10+RomanNumerals5+ RomanNumerals1.repeat(3);
                        case 9:
                            return RomanNumerals10+RomanNumerals1+RomanNumerals10;
                    }
                    break;
                case 2:
                    switch(remainder){
                        case 0:
                            return RomanNumerals10.repeat(2);
                        case 1:
                            return RomanNumerals10.repeat(2)+RomanNumerals1;
                        case 2:
                            return RomanNumerals10.repeat(2)+RomanNumerals1.repeat(2);
                        case 3:
                            return RomanNumerals10.repeat(2)+RomanNumerals1.repeat(3);
                        case 4:
                            return RomanNumerals10.repeat(2)+RomanNumerals1+RomanNumerals5;
                        case 5:
                            return RomanNumerals10.repeat(2)+RomanNumerals5;
                        case 6:
                            return RomanNumerals10.repeat(2)+RomanNumerals5+ RomanNumerals1;
                        case 7:
                            return RomanNumerals10.repeat(2)+RomanNumerals5+ RomanNumerals1.repeat(2);
                        case 8:
                            return RomanNumerals10.repeat(2)+RomanNumerals5+ RomanNumerals1.repeat(3);
                        case 9:
                            return RomanNumerals10.repeat(2)+RomanNumerals1+RomanNumerals10;
                    }
                    break;
                case 3:
                    switch(remainder){
                        case 0:
                            return RomanNumerals10.repeat(3);
                        case 1:
                            return RomanNumerals10.repeat(3)+RomanNumerals1;
                        case 2:
                            return RomanNumerals10.repeat(3)+RomanNumerals1.repeat(2);
                        case 3:
                            return RomanNumerals10.repeat(3)+RomanNumerals1.repeat(3);
                        case 4:
                            return RomanNumerals10.repeat(3)+RomanNumerals1+RomanNumerals5;
                        case 5:
                            return RomanNumerals10.repeat(3)+RomanNumerals5;
                        case 6:
                            return RomanNumerals10.repeat(3)+RomanNumerals5+ RomanNumerals1;
                        case 7:
                            return RomanNumerals10.repeat(3)+RomanNumerals5+ RomanNumerals1.repeat(2);
                        case 8:
                            return RomanNumerals10.repeat(3)+RomanNumerals5+ RomanNumerals1.repeat(3);
                        case 9:
                            return RomanNumerals10.repeat(3)+RomanNumerals1+RomanNumerals10;
                    }
                    break;
                case 4:
                    switch(remainder){
                        case 0:
                            return RomanNumerals10+RomanNumerals50;
                        case 1:
                            return RomanNumerals10+RomanNumerals50+RomanNumerals1;
                        case 2:
                            return RomanNumerals10+RomanNumerals50+RomanNumerals1.repeat(2);
                        case 3:
                            return RomanNumerals10+RomanNumerals50+RomanNumerals1.repeat(3);
                        case 4:
                            return RomanNumerals10+RomanNumerals50+RomanNumerals1+RomanNumerals5;
                        case 5:
                            return RomanNumerals10+RomanNumerals50+RomanNumerals5;
                        case 6:
                            return RomanNumerals10+RomanNumerals50+RomanNumerals5+ RomanNumerals1;
                        case 7:
                            return RomanNumerals10+RomanNumerals50+RomanNumerals5+ RomanNumerals1.repeat(2);
                        case 8:
                            return RomanNumerals10+RomanNumerals50+RomanNumerals5+ RomanNumerals1.repeat(3);
                        case 9:
                            return RomanNumerals10+RomanNumerals50+RomanNumerals1+RomanNumerals10;
                    }
                    break;
                case 5:
                    switch(remainder){
                        case 0:
                            return RomanNumerals50;
                        case 1:
                            return RomanNumerals50+RomanNumerals1;
                        case 2:
                            return RomanNumerals50+RomanNumerals1.repeat(2);
                        case 3:
                            return RomanNumerals50+RomanNumerals1.repeat(3);
                        case 4:
                            return RomanNumerals50+RomanNumerals1+RomanNumerals5;
                        case 5:
                            return RomanNumerals50+RomanNumerals5;
                        case 6:
                            return RomanNumerals50+RomanNumerals5+ RomanNumerals1;
                        case 7:
                            return RomanNumerals50+RomanNumerals5+ RomanNumerals1.repeat(2);
                        case 8:
                            return RomanNumerals50+RomanNumerals5+ RomanNumerals1.repeat(3);
                        case 9:
                            return RomanNumerals50+RomanNumerals1+RomanNumerals10;
                    }
                    break;
                case 6:
                    switch(remainder){
                        case 0:
                            return RomanNumerals50+RomanNumerals10;
                        case 1:
                            return RomanNumerals50+RomanNumerals10+RomanNumerals1;
                        case 2:
                            return RomanNumerals50+RomanNumerals10+RomanNumerals1.repeat(2);
                        case 3:
                            return RomanNumerals50+RomanNumerals10+RomanNumerals1.repeat(3);
                        case 4:
                            return RomanNumerals50+RomanNumerals10+RomanNumerals1+RomanNumerals5;
                        case 5:
                            return RomanNumerals50+RomanNumerals10+RomanNumerals5;
                        case 6:
                            return RomanNumerals50+RomanNumerals10+RomanNumerals5+ RomanNumerals1;
                        case 7:
                            return RomanNumerals50+RomanNumerals10+RomanNumerals5+ RomanNumerals1.repeat(2);
                        case 8:
                            return RomanNumerals50+RomanNumerals10+RomanNumerals5+ RomanNumerals1.repeat(3);
                        case 9:
                            return RomanNumerals50+RomanNumerals10+RomanNumerals1+RomanNumerals10;
                    }
                    break;
                case 7:
                    switch(remainder){
                        case 0:
                            return RomanNumerals50+RomanNumerals10.repeat(2);
                        case 1:
                            return RomanNumerals50+RomanNumerals10.repeat(2)+RomanNumerals1;
                        case 2:
                            return RomanNumerals50+RomanNumerals10.repeat(2)+RomanNumerals1.repeat(2);
                        case 3:
                            return RomanNumerals50+RomanNumerals10.repeat(2)+RomanNumerals1.repeat(3);
                        case 4:
                            return RomanNumerals50+RomanNumerals10.repeat(2)+RomanNumerals1+RomanNumerals5;
                        case 5:
                            return RomanNumerals50+RomanNumerals10.repeat(2)+RomanNumerals5;
                        case 6:
                            return RomanNumerals50+RomanNumerals10.repeat(2)+RomanNumerals5+ RomanNumerals1;
                        case 7:
                            return RomanNumerals50+RomanNumerals10.repeat(2)+RomanNumerals5+ RomanNumerals1.repeat(2);
                        case 8:
                            return RomanNumerals50+RomanNumerals10.repeat(2)+RomanNumerals5+ RomanNumerals1.repeat(3);
                        case 9:
                            return RomanNumerals50+RomanNumerals10.repeat(2)+RomanNumerals1+RomanNumerals10;
                    }
                    break;
                case 8:
                    switch(remainder){
                        case 0:
                            return RomanNumerals50+RomanNumerals10.repeat(3);
                        case 1:
                            return RomanNumerals50+RomanNumerals10.repeat(3)+RomanNumerals1;
                        case 2:
                            return RomanNumerals50+RomanNumerals10.repeat(3)+RomanNumerals1.repeat(2);
                        case 3:
                            return RomanNumerals50+RomanNumerals10.repeat(3)+RomanNumerals1.repeat(3);
                        case 4:
                            return RomanNumerals50+RomanNumerals10.repeat(3)+RomanNumerals1+RomanNumerals5;
                        case 5:
                            return RomanNumerals50+RomanNumerals10.repeat(3)+RomanNumerals5;
                        case 6:
                            return RomanNumerals50+RomanNumerals10.repeat(3)+RomanNumerals5+ RomanNumerals1;
                        case 7:
                            return RomanNumerals50+RomanNumerals10.repeat(3)+RomanNumerals5+ RomanNumerals1.repeat(2);
                        case 8:
                            return RomanNumerals50+RomanNumerals10.repeat(3)+RomanNumerals5+ RomanNumerals1.repeat(3);
                        case 9:
                            return RomanNumerals50+RomanNumerals10.repeat(3)+RomanNumerals1+RomanNumerals10;
                    }
                    break;
                case 9:
                    switch(remainder){
                        case 0:
                            return RomanNumerals10+RomanNumerals100;
                        case 1:
                            return RomanNumerals10+RomanNumerals100+RomanNumerals1;
                        case 2:
                            return RomanNumerals10+RomanNumerals100+RomanNumerals1.repeat(2);
                        case 3:
                            return RomanNumerals10+RomanNumerals100+RomanNumerals1.repeat(3);
                        case 4:
                            return RomanNumerals10+RomanNumerals100+RomanNumerals1+RomanNumerals5;
                        case 5:
                            return RomanNumerals10+RomanNumerals100+RomanNumerals5;
                        case 6:
                            return RomanNumerals10+RomanNumerals100+RomanNumerals5+ RomanNumerals1;
                        case 7:
                            return RomanNumerals10+RomanNumerals100+RomanNumerals5+ RomanNumerals1.repeat(2);
                        case 8:
                            return RomanNumerals10+RomanNumerals100+RomanNumerals5+ RomanNumerals1.repeat(3);
                        case 9:
                            return RomanNumerals10+RomanNumerals100+RomanNumerals1+RomanNumerals10;
                    }
                    break;
                case 10:
                    switch(remainder){
                        case 0:
                            return RomanNumerals100;
                    }
                    break;
            }
        }
        return null;
    }


}
