package ch12.Wrapper;

class Person {
    private   String name;
    public Person(String val) {
        name = val;
    }
    public Person() {
    	
    }
    public static String get() {
    	Person p = new Person();
    return p.name;
    }
    public void print() {
        System.out.println(name);
    }
}
public class main {
    public static void main(String[] args) {
        Person obj = new Person("Kim");
        obj.print();
    }
}
