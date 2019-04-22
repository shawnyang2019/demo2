package smallfunction.homework;

import java.beans.Customizer;
import java.util.ArrayList;
import java.util.List;

import com.fiberhome.demo.Person;
import org.springframework.core.io.support.PropertySourceFactory;

/**
 * @author vv
 * @since 2019/2/13
 */
public class TemplatesTest extends Person {
    //prsf
    private static final Customer cust=new Customer();

    //psf
    public static final int NUM=1;

    //psfi
    public static final int INT=2;

    //psfs
    public static final String STRING="yangxuan";

	public void test1() {
		this.skin();
	}

	@Override
	public int add(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		Person p = new TemplatesTest();
		int c = p.add(2, 6);
		// sout
		System.out.println(c);
		// c.sout
		System.out.println(c);
		// soutp
		System.out.println("args = [" + args + "]");
		// soutm
		System.out.println("TemplatesTest.main");
		// souv
		System.out.println("p = " + p);

		String[] str = new String[] { "yangxuan", "xiangweiwei", "zhangxiumei" };
		// fori
		for (int i = 0; i < str.length; i++) {
			// str[i].sout
			System.out.println(str[i]);
			System.out.println(str[i]);

		}
		// iter
		for (String s : str) {
			System.out.println(s);
		}
		// itar

		for (int i = 0; i < str.length; i++) {
			String s = str[i];

		}

		List list = new ArrayList<Integer>();
		list.add(111);
		list.add(222);
		list.add(333);
		// list.for
		for (Object o : list) {
			System.out.println(o);
		}
		// list.fori
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// list.forr 倒序遍历
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(i);
		}


        List list1 = new ArrayList<Integer>();
        list1.add(111);
        list1.add(222);
        list1.add(333);
		//ifn
        if (list1 == null) {

        }
        //inn
        if (list1 != null) {

        }
        //xxx.nn
        if (list != null) {

        }
		//xxx.null
        if (list == null) {

        }


	}
}
