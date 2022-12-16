public class student extends person {
    private String course;
    private String regNo;
    private double gpa;

    public student(String fName, String lName, int Age, String Course, String regNo,Double gpa) {
        super(fName, lName, Age);
        this.course=Course;
        this.regNo=regNo;
        this.gpa=gpa;
    }
    public void printInfo(){
        super.printInfo();  //overrides method in person
        System.out.println(regNo+" "+ course+" "+ gpa);
    }
}
