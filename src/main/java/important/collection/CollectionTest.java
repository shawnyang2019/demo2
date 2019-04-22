package important.collection;



import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


/**
 * double shift 快速查找
 * ctrl+F12 查看方法
 * ctrl+/ 快速注释
 * ctrl+d 复制
 * alt+enter 错误修正
 * ctrl+shift+l 调整格式
 * @author vv
 * @since 2019/2/13
 */
public class CollectionTest {

    public static void main(String[] args) {
//    testArray();
//      testList();
      testSet();
//        testMap();
  //      testQueue();
    }

    public static void testArray(){
        int[] ary1 = new int[]{555,66,77};
        System.out.println(ary1[0]);
        System.out.println(ary1[1]);
        System.out.println(ary1[2]);

        int[] ary2 = new int[3];
        ary2[1]  = 100;
        for(int i=0; i< ary2.length; i++){
            System.out.println(ary2[i]);
        }
        for(int ab : ary2){
            System.out.println(ab);
        }

        int j = 0;
        while(j< ary2.length){
            System.out.println(ary2[j]);
            j++;
        }
    }

    public static void testList(){
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(10);
        list.add(100);
        list.add(1000);
     //   list.remove(1); // ctrl+/

      //  for(int i=0;i<list.size();i++){
        //    System.out.println(testArray()); 怎么调用Arraylist中的参数？
//        }
       for(Object a : list){
           System.out.println(a);
        }
//        System.out.println(list.indexOf(100));
    }

    public static void testSet(){
        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println(set1.size());
    }

    public static void testMap(){
        HashMap map = new HashMap();
        map.put("key1", "value1");
        map.put("key2", "value1");
        map.put("key2", "value2");
        System.out.println(map.size());
    }

    public static void testQueue(){
        ArrayDeque queue = new ArrayDeque(2);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.poll();
        System.out.println(queue.size());
    }
}
