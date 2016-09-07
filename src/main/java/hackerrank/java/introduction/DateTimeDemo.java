package hackerrank.java.introduction;

import java.io.ByteArrayInputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class DateTimeDemo {

    static {
        String input = "08 05 2015";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, Integer.parseInt(year));
        c.set(Calendar.MONTH, Integer.parseInt(month) - 1);
        c.set(Calendar.DATE, Integer.parseInt(day));

        System.out.println(new SimpleDateFormat("EEEE").format(c.getTime()).toUpperCase());

        in.close();
    }
}
