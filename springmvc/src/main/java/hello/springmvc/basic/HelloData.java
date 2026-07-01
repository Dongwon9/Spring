package hello.springmvc.basic;

import lombok.Data;

//@getter,@setter,@requiredargsconstructor 등을 전부 적용한다.
@Data
public class HelloData {
    private String username;
    private int age;
}
