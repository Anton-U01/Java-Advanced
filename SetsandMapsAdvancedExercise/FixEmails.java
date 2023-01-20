package SetsandMapsAdvancedExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        Pattern pattern = Pattern.compile("^[\\w\\-\\.]+@[\\w-]+\\.+(?<domain>[\\w-]{2,4})$");
        Map<String,String> collection = new LinkedHashMap<>();
        while (!line.equals("stop")){
            String name = line;
            String email = scan.nextLine();
            Matcher matcher = pattern.matcher(email);
            String domain = "";
            if(matcher.find()){
                domain = matcher.group("domain");
            }
            if(domain.equals("us") || domain.equals("uk") || domain.equals("com")){
            } else {
                collection.put(name,email);
            }
            line = scan.nextLine();
        }
        for (Map.Entry<String, String> entry : collection.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
