public class Runner{

    public static void main(String[] args) {

        Scanner inputTaker = new Scanner(System.in);

        System.out.println("Enter your name: ");
            String name = inputTaker.nextLine();


        System.out.println("Enter your age: ");
            int age = Integer.parseInt(inputTaker.nextLine());

    
        System.out.println("Enter your Job Title: ");
            String jobTitle = inputTaker.nextInt();


            PersonClass newPerson = new PersonClass();
            newperson.setName(name);
            newperson.setAge(age);
            newperson.setJobTitle(jobTitle);

            System.out.println(newPerson)

    }
}
