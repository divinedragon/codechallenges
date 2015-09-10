package com.divinedragon.kidas.codechallenges.numbertotext;

public class NumberToTextConverter {

    public static void main(String[] args) {

        System.out.println("1 --> " + convertNumberToTextDollar(1));
        System.out.println("2 --> " + convertNumberToTextDollar(2));
        System.out.println("3 --> " + convertNumberToTextDollar(3));
        System.out.println("4 --> " + convertNumberToTextDollar(4));
        System.out.println("5 --> " + convertNumberToTextDollar(5));
        System.out.println("6 --> " + convertNumberToTextDollar(6));
        System.out.println("7 --> " + convertNumberToTextDollar(7));
        System.out.println("8 --> " + convertNumberToTextDollar(8));
        System.out.println("9 --> " + convertNumberToTextDollar(9));
        System.out.println("10 --> " + convertNumberToTextDollar(10));
        System.out.println("11 --> " + convertNumberToTextDollar(11));
        System.out.println("12 --> " + convertNumberToTextDollar(12));
        System.out.println("13 --> " + convertNumberToTextDollar(13));
        System.out.println("14 --> " + convertNumberToTextDollar(14));
        System.out.println("15 --> " + convertNumberToTextDollar(15));
        System.out.println("16 --> " + convertNumberToTextDollar(16));
        System.out.println("17 --> " + convertNumberToTextDollar(17));
        System.out.println("18 --> " + convertNumberToTextDollar(18));
        System.out.println("19 --> " + convertNumberToTextDollar(19));
        System.out.println("20 --> " + convertNumberToTextDollar(20));
        System.out.println("21 --> " + convertNumberToTextDollar(21));
        System.out.println("25 --> " + convertNumberToTextDollar(25));
        System.out.println("30 --> " + convertNumberToTextDollar(30));
        System.out.println("31 --> " + convertNumberToTextDollar(31));
        System.out.println("35 --> " + convertNumberToTextDollar(35));
        System.out.println("40 --> " + convertNumberToTextDollar(40));
        System.out.println("41 --> " + convertNumberToTextDollar(41));
        System.out.println("45 --> " + convertNumberToTextDollar(45));
        System.out.println("50 --> " + convertNumberToTextDollar(50));
        System.out.println("51 --> " + convertNumberToTextDollar(51));
        System.out.println("55 --> " + convertNumberToTextDollar(55));
        System.out.println("60 --> " + convertNumberToTextDollar(60));
        System.out.println("61 --> " + convertNumberToTextDollar(61));
        System.out.println("65 --> " + convertNumberToTextDollar(65));
        System.out.println("70 --> " + convertNumberToTextDollar(70));
        System.out.println("71 --> " + convertNumberToTextDollar(71));
        System.out.println("75 --> " + convertNumberToTextDollar(75));
        System.out.println("80 --> " + convertNumberToTextDollar(80));
        System.out.println("81 --> " + convertNumberToTextDollar(81));
        System.out.println("85 --> " + convertNumberToTextDollar(85));
        System.out.println("90 --> " + convertNumberToTextDollar(90));
        System.out.println("91 --> " + convertNumberToTextDollar(91));
        System.out.println("95 --> " + convertNumberToTextDollar(95));
        System.out.println("99 --> " + convertNumberToTextDollar(99));
        System.out.println("100 --> " + convertNumberToTextDollar(100));
        System.out.println("101 --> " + convertNumberToTextDollar(101));
        System.out.println("110 --> " + convertNumberToTextDollar(110));
        System.out.println("113 --> " + convertNumberToTextDollar(113));
        System.out.println("140 --> " + convertNumberToTextDollar(140));
        System.out.println("299 --> " + convertNumberToTextDollar(299));
        System.out.println("399 --> " + convertNumberToTextDollar(399));
        System.out.println("499 --> " + convertNumberToTextDollar(499));
        System.out.println("1000 --> " + convertNumberToTextDollar(1000));
        System.out.println("1001 --> " + convertNumberToTextDollar(1001));
        System.out.println("1011 --> " + convertNumberToTextDollar(1011));
        System.out.println("1211 --> " + convertNumberToTextDollar(1211));
        System.out.println("10000 --> " + convertNumberToTextDollar(10000));
        System.out.println("20001 --> " + convertNumberToTextDollar(20001));
        System.out.println("30031 --> " + convertNumberToTextDollar(30031));
        System.out.println("40431 --> " + convertNumberToTextDollar(40431));
        System.out.println("55431 --> " + convertNumberToTextDollar(55431));
        System.out.println("99999 --> " + convertNumberToTextDollar(99999));
        System.out.println("100000 --> " + convertNumberToTextDollar(100000));
        System.out.println("200002 --> " + convertNumberToTextDollar(200002));
        System.out.println("300033 --> " + convertNumberToTextDollar(300033));
        System.out.println("400433 --> " + convertNumberToTextDollar(400433));
        System.out.println("505533 --> " + convertNumberToTextDollar(505433));
        System.out.println("665533 --> " + convertNumberToTextDollar(665433));
        System.out.println("999999 --> " + convertNumberToTextDollar(999999));
        System.out.println("1000000 --> " + convertNumberToTextDollar(1000000));
        System.out.println("2000007 --> " + convertNumberToTextDollar(2000007));
        System.out.println("8000087 --> " + convertNumberToTextDollar(8000087));
        System.out.println("9000987 --> " + convertNumberToTextDollar(9000987));
        System.out.println("6006987 --> " + convertNumberToTextDollar(6006987));
        System.out.println("12345678 --> " + convertNumberToTextDollar(12345678));
        System.out.println("123456789 --> " + convertNumberToTextDollar(123456789));
        System.out.println("1234567890 --> " + convertNumberToTextDollar(1234567890));
        System.out.println("12345678901 --> " + convertNumberToTextDollar(12345678901L));
        System.out.println("123456789012 --> " + convertNumberToTextDollar(123456789012L));
        System.out.println("1234567890123 --> " + convertNumberToTextDollar(1234567890123L));
        System.out.println("12345678901234 --> " + convertNumberToTextDollar(12345678901234L));
        System.out.println("123456789012345 --> " + convertNumberToTextDollar(123456789012345L));
        System.out.println("1234567890123456 --> " + convertNumberToTextDollar(1234567890123456L));
    }

    public static String convertNumberToTextDollar(final long number) {

        String convertedTextDollar = convertToText(number);

        convertedTextDollar += "Dollar";

        return ((number != 1) ? convertedTextDollar + "s" : convertedTextDollar);

    }

    public static String convertToText(final long number) {

        String convertedText = "";

        long value = number;
        long base  = 0;

        while (value != 0) {

            if (value < 20) {
                base = value;
                convertedText += getNumericText(value);
            }  else if (value < 100) {
                base = 10;
                convertedText += getNumericText(value - (value % base));
            } else if (value < 1000) {
                base = 100;
                convertedText += getNumericText(value / base) + getNumericText(base);
            } else if (value < 1000000L) {
                base = 1000;
                convertedText += convertToText(value / base) + getNumericText(base);
            } else if (value < 1000000000L) {
                base = 1000000;
                convertedText += convertToText(value / base) + getNumericText(base);
            } else if (value < 1000000000000L) {
                base = 1000000000;
                convertedText += convertToText(value / base) + getNumericText(base);
            } else if (value < 1000000000000000L) {
                base = 1000000000000L;
                convertedText += convertToText(value / base) + getNumericText(base);
            } else {
                throw new IllegalArgumentException("Number too long to convert.");
            }

            value = value % base;
        }

        return convertedText;
    }

    public static String getNumericText(final long value) {

        String text = "";

        if (value == 1) {
            text = "One";
        } else if (value == 2) {
            text = "Two";
        } else if (value == 3) {
            text = "Three";
        } else if (value == 4) {
            text = "Four";
        } else if (value == 5) {
            text = "Five";
        } else if (value == 6) {
            text = "Six";
        } else if (value == 7) {
            text = "Seven";
        } else if (value == 8) {
            text = "Eight";
        } else if (value == 9) {
            text = "Nine";
        } else if (value == 10) {
            text = "Ten";
        } else if (value == 11) {
            text = "Eleven";
        } else if (value == 12) {
            text = "Twelve";
        } else if (value == 13) {
            text = "Thirteen";
        } else if (value == 14) {
            text = "Fourteen";
        } else if (value == 15) {
            text = "Fifteen";
        } else if (value == 16) {
            text = "Sixteen";
        } else if (value == 17) {
            text = "Seventeen";
        } else if (value == 18) {
            text = "Eighteen";
        } else if (value == 19) {
            text = "Nineteen";
        } else if (value == 20) {
            text = "Twenty";
        } else if (value == 30) {
            text = "Thirty";
        } else if (value == 40) {
            text = "Forty";
        } else if (value == 50) {
            text = "Fifty";
        } else if (value == 60) {
            text = "Sixty";
        } else if (value == 70) {
            text = "Seventy";
        } else if (value == 80) {
            text = "Eighty";
        } else if (value == 90) {
            text = "Ninety";
        } else if (value == 100) {
            text = "Hundred";
        } else if (value == 1000) {
            text = "Thousand";
        } else if (value == 1000000) {
            text = "Million";
        } else if (value == 1000000000L) {
            text = "Billion";
        } else if (value == 1000000000000L) {
            text = "Trillion";
        }

        return text;
    }
}
