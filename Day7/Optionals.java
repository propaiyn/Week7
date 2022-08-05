import java.util.Optional;

public class Optionals{
    public static void main(String[] args){
        String item;
if(Math.random() >= 0.5) {
    item = "Hello";
} else {
    item = null;
}
Optional.ofNullable(item);
    }
}
