package important.proxy2;

public class ProxyTest2 {

    public static void main(String[] args) {
        LiuDeHuaProxy2 proxy2=new LiuDeHuaProxy2();

        Person person=proxy2.getProxy();

        System.out.println(person.sing("冰雨"));
        System.out.println(person.dance("江南style"));
    }


}
