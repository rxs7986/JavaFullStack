package Maven.dependenciesTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Autowired
    private Address add;


    @Autowired
    private Account acc;


    public Person(Address add, Account acc) {
        this.add = add;
        this.acc = acc;
    }
}
