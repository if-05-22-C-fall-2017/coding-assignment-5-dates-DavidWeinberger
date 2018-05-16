import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    static Matcher getMatcher(String input) {
        Pattern p2 = Pattern.compile("(^([1-2][0-9])|^(0{0,1}[1-9])|^(3(0|1)))(\\.|-| )((1[0-2])|(0{0,1}[1-9]))(\\.|-| )([1-2](0|9)){0,1}[0-9][0-9]$");
        Matcher m2 = p2.matcher(input);
        return m2;
    }
}
