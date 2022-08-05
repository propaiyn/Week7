package Day11.greet;

public class Greeter {
    public static void main(String[] args) {

        Formal formal = new Formal();
        Casual casual = new Casual();

        formal.sayHello();
        casual.sayHello();
    }
}
