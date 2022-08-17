package DevXSchoolPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap2Example {

        public static void main(String[] args) {

            Map<String, String> domains = new HashMap<>();

            domains.put("kz", "Kazakhstan");
            domains.put("sk", "Turkmenistan");
            domains.put("tb", "Tibet");
            domains.put("ky", "Krygyztan");
            domains.put("uz", "Uzebekistan");
            domains.put("tj", "Tajikistan");

            System.out.println(domains.get("pl"));

            for (String item : domains.values()) {

                System.out.println(item);
            }

            Set keys = domains.keySet();

            System.out.println(keys);
        }
    }