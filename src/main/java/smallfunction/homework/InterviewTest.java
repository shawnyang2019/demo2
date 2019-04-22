package smallfunction.homework;

import java.util.ArrayList;
import java.util.List;

public class InterviewTest {

	public void test01() {
		List<Integer> list = new ArrayList<>();
		System.out.println("向list里面添加数据");
		list.add(30);
		list.add(40);
		list.add(35);
		list.add(20);
		System.out.println("对list里的数进行从小到大的排序");
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) > list.get(j)) {
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		System.out.println("输出排序后的数");
		for (Integer i : list) {
			System.out.print(i + " ");
		}
	}

    public static void main(String[] args) {
        InterviewTest interviewTest=new InterviewTest();
        interviewTest.test01();
    }
}
