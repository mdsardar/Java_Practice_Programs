package practice.com.company.practice.oca8part2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonMain {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        Map<String, List<String>> tweetMap = new HashMap<>();
        try {
            JSONArray jsonArray = (JSONArray) parser.parse(new FileReader
                    ("/Users/mohammedsardar/Desktop/Practiced_Codes/Java_Practice_Programs/com/company/practice/oca8part2/tweets_users.json"));

            for (Object o : jsonArray) {
                // System.out.println("Content of Object Json Array: " + o);
                JSONObject jsonObject = (JSONObject) o;
                String userName = (String) jsonObject.get("user");
                //System.out.println("User Name: " + userName);

                String tweet = (String) jsonObject.get("tweet");
                //System.out.println("Tweet: " + tweet);

                if (!tweetMap.containsKey(userName)) {
                    // New User
                    List<String> newList = new ArrayList<>();
                    newList.add(tweet);
                    tweetMap.put(userName, newList);
                } else {
                    // User exists
                    List<String> currList = tweetMap.get(userName);
                    currList.add(tweet);
                    tweetMap.put(userName, currList);
                }
            }

            Map.Entry<String, List<String>> maxEntry = null;

            for (Map.Entry<String, List<String>> entry : tweetMap.entrySet()) {
                if (maxEntry == null || entry.getValue().size() > maxEntry.getValue().size()) {
                    maxEntry = entry;
                }
            }
            System.out.println("Max user name - " + maxEntry.getKey() + " had a count of " + maxEntry.getValue().size());

            for (String tweet : maxEntry.getValue()) {
                System.out.println(tweet);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
