public class lecturer extends person {
    private String position;
    private double salary;


    public lecturer(String fName, String lName, int Age, String position, double salary ) {
        super(fName, lName, Age);
        this.position=position;
        this.salary=salary;

    }
    public void printInfo(){
        super.printInfo();
        System.out.println(position+" "+salary);

    }
}
