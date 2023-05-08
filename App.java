public class App {
    public static void main(String[] args){
        // double hashing - what Bitcoin uses
        String hash = SHA256Helper.doubleHash("Test!");
        System.out.println(hash);
    }
}
