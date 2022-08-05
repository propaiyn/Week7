package Day6;

public class ImmutableObj {

    public static void main(String[] args) {
        String personName = "";
        changePersonName(personName);
        System.out.println(personName);
}

static void changePersonName(String personName) {
        personName = "Stephan";
}
}

// IMMUTABLE, thus object cannot be changed
    // nothing will be printed