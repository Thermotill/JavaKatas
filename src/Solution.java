import java.lang.StringBuilder;
public class Solution{

    static String toCamelCase(String s){
        String camelCaseString;
        StringBuilder sb = new StringBuilder(s);

        camelCaseString = sb.toString().replaceAll("(-_)", "");

        return camelCaseString;
    }
}

