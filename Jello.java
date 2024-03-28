public class Jello {

    int returnNothing() {
        return 1;
    }

    public static void main(String[] args) {
        Jello jello = new Jello(); // Create an instance of the Jello class
        System.out.println(jello.returnNothing()); // Call the returnNothing() method on the instance
    }
}