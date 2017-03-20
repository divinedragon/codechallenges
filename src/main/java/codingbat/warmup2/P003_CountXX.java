package codingbat.warmup2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P003_CountXX {

    public int countXX(String str) {

        int count = 0;

        if (str != null && !str.isEmpty()) {

            Pattern p = Pattern.compile("([x]){2}");
            Matcher m = p.matcher(str);

            // The trick is to start again at the first matched position
            if (m.find()) {
                do {
                    count++;
                } while(m.find(m.start(1)));
            }
        }

        return count;
    }
}
