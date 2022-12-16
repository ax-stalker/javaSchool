public class Main {
    public static void main(String[] args) {
        person p1;//polymorphism
        p1 =new student("Mike", "West", 18, "Computer Science","IN13/0013/20",4.0);
        p1.printInfo();
        System.out.println("...............................................");
        p1=new lecturer("Carla", "Hansen", 29,"Lecturer",10000.0);
        p1.printInfo();

    }
}