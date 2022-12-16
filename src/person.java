public class person {
    protected String firstName;
    protected String lastName;
    protected int age;

    public person(String fName, String lName, int Age){
        this.firstName=fName;
        this.lastName=lName;
        this.age=Age;
    }
    public void printInfo(){
        System.out.println(firstName+" "+lastName+" is :"+ age+" years old.");
    }
}
