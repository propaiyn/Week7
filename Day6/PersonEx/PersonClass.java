package PersonEx;

public class PersonClass{


        public class Runner{
            }
            public String name;
            public int age;
            public String jobTitle;

            public PersonClass(String name, int age, String jobTitle) {
                this.name = name;
                this.age = age;
                this.jobTitle = jobTitle;
            }

            @Override
            public String toString(){
                    return  name + " age " + age + "Job title" + jobTitle;
            }

            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }
            public void setAge(int age) {
                this.age = age;
            }

            public String getJobTitle() {
                return jobTitle;
            }
            public void setJobTitle(String jobTitle) {
                this.jobTitle = jobTitle;
            }
//constructor


        }