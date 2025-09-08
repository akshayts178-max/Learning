public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(54);
        obj.setName("dtyhb");
        System.out.println(obj.getName() + " : " + obj.getAge());

        Human obc = new Human();
        System.out.println(obc.getName() + " : " + obc.getName());
    }
}

class Human {
    private int age;
    private String name;

    public Human() {
        age = 12;
        name = "John";
    }

    public Human(int a, String n) {
        this.age = a;
        this.name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String nm) {
        name = nm;
    }
}