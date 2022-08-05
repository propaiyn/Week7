package Day6;

public class GarbageCollection {
    public static void main(String[] args) {

        Integer i = new Integer(4); // value set
    
        i = null; // value now reassigned to null, value in heap becomes unreachable -> marked for garbage collection
    }
    
}

// process of automatic memory management//
/* When java programs run on jvm, objects created on heap(portion of mem. dedicated to program)
 * Eventually some objects ARE NO LONGER NEEDED and garbage collector finds these and removes them from memory
 */

 /*MAKE AN OBJECT UNREACHABLE (i.e. Elligibile for garbage collection) IF IT IS NO LONGER REQUIRED
  * 4 WAYS THAT MAKE OBJECT ELLIGIBLE FOR GARBAGE
        Null refrence variable
        Reassign refrence variable
        object created inside method
        ISLAND OF ISOLATION - e.g. 2 objects refrence eachother but no code refrences either object
  */