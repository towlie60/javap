package DevXSchoolPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap3Example {

        public static void main(String[] args) {

            Map<String, String> domains = new HashMap<>();

            domains.put("de", "Germany");
            domains.put("sk", "Slovakia");
            domains.put("us", "United States");
            domains.put("ru", "Russia");
            domains.put("hu", "Hungary");
            domains.put("pl", "Poland");
            domains.put("as", "Austrialia");
            domains.put("mx", "Mexico");

            System.out.println(domains.get("pl"));

            for (String item : domains.values()) {

                System.out.println(item);
            }

            Set keys = domains.keySet();

            System.out.println(keys);
        }
    }