public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, this is transport project");
        groundTransport autobus = new groundTransport(100, 19999, 35, false, 4, false);
        autobus.display();
        autobus.attack();
    }
}