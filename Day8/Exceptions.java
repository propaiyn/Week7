public class Exceptions {

    public static void main(String[] args) throws Exception {
        int[] numbersArr = new int[10];

        int index = 6;
        if(index < numbersArr.length){
                int i = numbersArr[index % 10];
            System.out.println(index);
        } else {
            System.out.println("Index out of range");
        }
 }
}

// Deal with situations you thought may arise and do something about it
// Exceptions are an abnormal condition that disrupts the normal flow of a program when run (i.e. atg runtime)
// prevents unexpected termination of the program
// alternate pathways through an application that allows you to navigate through the program


// runtime issues are typically caused by programming errors
// better practice toi change code so that errrors dont occur rather than using optionals
