package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {
    private String name;
    private int age;
    
    static void main() {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("sadfsadf");
        System.out.println("helloLombok.getName() = " + helloLombok.getName());
        System.out.println("helloLombok = " + helloLombok);
    }
}
