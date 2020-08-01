import java.util.regex.*;
public class ClassNameExample {
    public static final String CLASS_NAME_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";

    public ClassNameExample(){
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
