package important.socket.proxy;

import com.fiberhome.demo.proxy.IPerson;

public class Student implements IPerson {

    private String name;
    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        System.out.println(name + "上交班费50元");
    }
}
