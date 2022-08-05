package Day6;

/* STATIC KEYWORD means that the member (i.e. methods, variable class ...) 
 * belongs to the TYPE itself RATHER THAN to an instance of that type
 */

// VARIABLES are very commonly static
//if CLASS VARIABLE = static - single copy of that variable created that every instance of that class will access



public class Statics {
    private Statics() {}                                        // called an inner class; UNLESS STATIC, THEN is called a static nested class

    private static class SingletonHolder {
        public static final Statics INSTANCE = new Statics();   // INNER CLASS = ACCESS TO ALL MEMBERS IN ENCLOSING CLASS (EVEN PRIVATES)
                                                                // STATIC NEST. = ONLY HAVE ACCESSS TO STATIC MEMBERS OF OUTERR CLASS
    }

    public static Statics getInstance() { // belongs to outer class
        return SingletonHolder.INSTANCE;
    }
}




// IMAGINE STATICS ABOVE = SINGLETON
// above is an example of nested class
            //

// get methods are defined e.g. public sTRING getEyecolour and setters take paramaters e.g. GETeyECOLOUR(String Eyecolour)
// STATIC BLOCKS//
/*
Initialise static variables that require multi-line logic.
 * public class StaticBlockDemo {
    public static List<String> languages = new LinkedList<>();

    static {
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");
    }

    static {
        languages.add("HTML");
        languages.add("Groovy");
    }
}
 */