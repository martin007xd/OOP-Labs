package question4;
public class PersonTest {
    public static void main(String[] args) {
        
        Mother m = new Mother();
        m.setFirstName("Alice");
        System.out.println("Mother name : " + m.getFirstName()); 

        Father f = new Father(m);
        f.setFirstName("Bob");
        System.out.println("Father name : " + f.getFirstName()); 

        Person p = new Person();
        p.setFirstName("John");
        System.out.println("Child  name : " + p.getFirstName()); 
    }
}
