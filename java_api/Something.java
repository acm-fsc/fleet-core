package java_api;

public class Something {
    public static void main(String[] args) {
        Location loc1 = new Location(0.6f, 0.8f);
        Location loc2 = loc1; 
        
        System.out.println(loc2);
    }
}
