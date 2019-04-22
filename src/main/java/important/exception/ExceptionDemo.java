package important.exception;

import java.io.IOException;

/**
 * 必须处理的异常叫做检查性异常
 * 不用特别处理的叫非检查性异常
 */
public class ExceptionDemo {


    public void test1(){
        throw new BizException(101, "运行时异常");
    }

    public void test11(){
        throw new RuntimeException("非检查性异常");
    }

    public void test2(){
        try {
            throw new IOException("文件访问出错");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void test3() throws IOException{
        throw new IOException("文件访问出错");
    }


    public void test4(){
        int[] ary = new int[4];
        System.out.println(ary[100]);
    }
}
