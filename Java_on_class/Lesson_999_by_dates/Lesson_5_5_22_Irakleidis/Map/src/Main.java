import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        // add key and value to map --> .put(key, value)
        hashMap.put("Andreas", 200);
        hashMap.put("George", 300);
        hashMap.put("Daphne", 280);

        // .get(key) grabs the key and returns it's value
        System.out.println(hashMap.get("Daphne"));

        // returns a set of all keys in the map
        System.out.println(hashMap.keySet());

        // returns a collection of all keys-values in the map
        System.out.println(hashMap.entrySet());


    }
}