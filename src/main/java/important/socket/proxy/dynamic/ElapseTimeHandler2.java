package important.socket.proxy.dynamic;

import important.socket.proxy.Student;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ElapseTimeHandler2  implements InvocationHandler {

    private Student student;
    ElapseTimeHandler2(Student student){

        this.student=student;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long begin=System.currentTimeMillis();
        Object result =method.invoke(student,args);
        long end=System.currentTimeMillis();
        System.out.println(end-begin);
        return result;
    }
}
