class Person {
    public String name;
    public int age;
    public String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}

public class Main {
    public static void Main(String[] args) {
        Person persA = new Person("Alan", 19, "Male");
        System.out.println("Nombre: " + persA.getName());
        System.out.println("Edad: " + persA.getAge());
        System.out.println("Género: " + persA.getGender());
        System.out.println("");

        Person persB = new Person("Alan", 19, "Male");
        System.out.println("Nombre: " + persB.getName());
        System.out.println("Edad: " + persB.getAge());
        System.out.println("Género: " + persB.getGender());
        System.out.println("");

        Person persC = new Person("Alan", 19, "Male");
        System.out.println("Nombre: " + persC.getName());
        System.out.println("Edad: " + persC.getAge());
        System.out.println("Género: " + persC.getGender());
        System.out.println("");


        Person persD = new Person("Alan", 19, "Male");
        System.out.println("Nombre: " + persD.getName());
        System.out.println("Edad: " + persD.getAge());
        System.out.println("Género: " + persD.getGender());
        System.out.println("");
    }
}