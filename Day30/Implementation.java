package Day30;

public class Implementation {
    public static void main(String[] args) {
        Hashing<String, Integer> map = new Hashing<>();
        map.put("Riya", 90);
        map.put("Nitish", 77);
        System.out.println(map.containsKey("Riya"));
        System.out.println(map.remove("Riya"));
        System.out.println(map);
    }
}