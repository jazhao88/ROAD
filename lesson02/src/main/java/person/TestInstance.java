package person;

public class TestInstance {
    public void method1(Person e){
        String info = e.getInfo();
        System.out.println(info);
        if (e instanceof Graduate){
            System.out.println("a person\n" +"a student\n" + "a graduate");
        }
        else if (e instanceof Student){
            System.out.println("a person\n" +"a student");
        }
        else if (e instanceof Person){
            System.out.println("a person");
        }
        else {
            System.out.println("not person");
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Student p2 = new Student();
        Graduate p3 = new Graduate();
        TestInstance ti = new TestInstance();
        //ti.method1(p1);
        ti.method1(p2);
        //ti.method1(p3);
    }
}

