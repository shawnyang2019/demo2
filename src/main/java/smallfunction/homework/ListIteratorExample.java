package smallfunction.homework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("aaa");
        a.add("bbb");
        a.add("ccc");
        System.out.println("Before iterate : " + a);
        ListIterator<String> it = a.listIterator();
        //hasNext表示队列头向队列尾遍历
        while (it.hasNext()) {
            //类似于索引指针，it.next()表示当前元素， it.previousIndex()表示当前元素的前面索引，可以看做         //当前元素的索引，it.nextIndex()表示当前元素的后面索引，可以看做后面一个元素的索引
            System.out.println(it.next() + ", " + it.previousIndex() + ", " + it.nextIndex());
        }
        //hasPrevious() 表示从队尾向队列头逆向遍历
        while (it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }
        System.out.println();
        it = a.listIterator(1);
        while (it.hasNext()) {
            String t = it.next();
            System.out.println(t);
            if ("ccc".equals(t)) {
                it.set("nnn");
            } else {
                it.add("kkk");
            }
        }
        System.out.println("After iterate : " + a);
    }
}