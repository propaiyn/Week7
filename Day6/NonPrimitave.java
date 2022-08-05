package Day6;

public class NonPrimitave {

    public static void main(String[] args) {
        Person personObj = new Person();
        personObj.name = "Matthew";
        changeToMatt(personObj);
        System.out.println(personObj.name);
}

static void changeToMatt(Person passedPerson) {
        passedPerson.name = "Matt";
}
}
class Person {
String name;
    
}

//Above code prints matt
// passing a non primitaive type, passed by refrence thus updating the new local variable changes the same refrence in the object personObj
