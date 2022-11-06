package class27;

import java.util.HashMap;

public class mapDemo {
    public static void main(String[] args) {
        HashMap<String,String> data =new HashMap<>();
        data.put("username","anton123");// this is how we store info inside the map
        data.put("password","pass123");

        System.out.println(data);
        System.out.println(data.get("password"));
    }
}
