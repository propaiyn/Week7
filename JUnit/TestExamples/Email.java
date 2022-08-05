package JUnit.TestExamples;

public class Email {

    
    /** 
     * @param string
     * @return boolean
     */
    public boolean isValidEmail(String string){
        String regex = "^(.+)@(.+)$"; // regular erxpression that the email adresses should match
        boolean match = string.matches(regex);
        return false;
    }
}

// /Library/Java/JavaVirtualMachines/jdk-10.
