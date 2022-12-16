# JavaSchool
Displays java polymorphism, inheritance, and method overriding


# Person class
This class demonstrates the common attributes and methods of both teachers and students.
The <b>protected</b> keyword provides encapsulation while supporting inheritance.

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
# Student class
The <b> extends</b> keyword is used to display inheritance. 
In this case the <b>student class</b>(sub-class/ child class) inherits several attributes from the <b>person class</b>(parent class/ base class).
<b>Overriding</b> deals with two methods, one in a parent class and one in the child class that share a common signature.
The <b>printInfo()</b> method is an example of method overriding as it has a similar signature to the one present in the person class.

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

# Lecturer class
It is similar in structure to the student class but has atributes that are better suited for staff.
      
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

# Main class
<b>Polymorphism</b> enables an object reference to refer to an object of its class, or to an object of any class related to it by inheritance.
A line of code may execute different methods at different times if the object points to the changes.
A single object <b>p1</b> of type <b>person</b> is able to take up values from two different classes(student and lecturer) without the need for additional objects.

            public class Main {
        public static void main(String[] args) {
            person p1;  //polymorphism
            p1 =new student("Mike", "West", 18, "Computer Science","IN13/0013/20",4.0);
            p1.printInfo();
            System.out.println("...............................................");
            p1=new lecturer("Carla", "Hansen", 29,"Lecturer",10000.0);
            p1.printInfo();

           }
        }
