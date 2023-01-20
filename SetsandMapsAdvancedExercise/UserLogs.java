package SetsandMapsAdvancedExercise;

import java.util.*;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        Map<String,Map<String,Integer>> collection = new TreeMap<>();
        Map<String,Integer> ipOccurrence = new LinkedHashMap<>();
        while (!line.equals("end")){
            String[] data = line.split(" ");
            String ip = data[0].split("=")[1];
            String user = data[2].split("=")[1];
            if(ipOccurrence.containsKey(ip)){
                ipOccurrence.put(ip,ipOccurrence.get(ip) + 1);
            } else {
                ipOccurrence.put(ip,1);
            }
            collection.put(user,ipOccurrence);
            line = scan.nextLine();
        }
        for (Map.Entry<String, Map<String, Integer>> entry : collection.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Map<String, Integer> value : collection.values()) {
                String lastKey = "";
                for (Map.Entry<String, Integer> entry1 : value.entrySet()) {
                    lastKey = entry1.getKey();
                    }
                for (Map.Entry<String, Integer> entry1 : value.entrySet()) {
                    if(entry1.getKey().equals(lastKey)){
                        System.out.println(entry1.getKey() + " => " + entry1.getValue() + ".");
                }else {
                        System.out.println(entry1.getKey() + " => " + entry1.getValue() + ",");
                    }
                }

            }
        }
    }
}
