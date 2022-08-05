package Day6;

public class PassbyValueOrRefrence {

    public static void main(String[] args) {
        int personAge = 35;
        changePersonAge(personAge);
        System.out.println(personAge);
}

static void changePersonAge(int personAge) {
        personAge = 40;
}                                               //PRINTS 35, PRIMITIVE TYPE -> WHEN passed to another method, value gets stored in another lcoal variable called 35
                                                // changing this value doesnt change original value
    
}
/* 2 methods for how values and objects as parameters are handled
 *  PASS BY VALUE: Copy of contents of actual paramter stored under new local var., if changed in methods, original stays unchanged
 * PASS BY REF.: Copy of adress where parameter is stored; CHANGE VALUE IN METHOD? CHANGES PARAMETER
 */

 //DATA STORAGE//
 
 /*JAVA STORES DATA AS PRIMITIVE AND NON-PRIMITIVE
  * PRIMITIVE = BASIC (I.E. BOOLEAN, INT....) start with lower case generally
    Only store values of 1 kinds
    NON-PRIMITIVE = e.g. STRINGS // start with upper case
    Dont store value but refrence of value
        Although we are still passing by value, using non-prim, method receives refrence stored as value thus, can update original object
  */