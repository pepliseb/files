package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String txt = "evh8  acnisdfj    8999000 axb 4ggggg";
        String regex = "a[a-z]+b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(txt);
     StringBuilder sb = new StringBuilder();
    while(matcher.find()){
        sb.append(matcher.group());
    }


    }

}
