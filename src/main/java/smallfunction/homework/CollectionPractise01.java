package smallfunction.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * https://blog.csdn.net/qq_37067955/article/details/81903890
 */
class CollectionsPractice01 {

	// 编写一个程序，实现从命令行参数输入两个字符串类型的数值，并计算输出两个数值的和。 [必做题]
	public Long test01() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入第一个数值型字符串");
		String str1 = scanner.next();
		System.out.println("输入第er个数值型字符串");
		String str2 = scanner.next();

		Long sum = Long.parseLong(str1) + Long.parseLong(str2);

		System.out.println(sum);

		return sum;
	}

	// 编写一个程序，实现从命令行参数输入一字符串，统计该字符串中字符“e”出现的次数。（识点：String中常用的方法）

	public void test02() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个字符串");
		String str1 = scanner.next();
		// 方法一
		char[] chars = str1.toCharArray();
		int count = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == 'e') {
				count++;
			}
		}
		// 方法二
		int count1 = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == 'e') {
				count1++;
			}
		}
		System.out.println(count);
		System.out.println(count1);
	}

	// 生成十个0~100之间的随机数，放到数组中，然后排序输出。（知识点：Math类取整,获得随机数等） [必做题]
	public void test03() {

		double[] doubles = new double[10];
		for (int i = 0; i < 10; i++) {
			Double num = Math.random();
			if (num >= 0 && num <= 100) {
				doubles[i] = num;
				System.out.println("排序前的随机数" + num);
			}
		}
		// 简单排序， 由大到小 第一个是长度-1 要注意,https://www.cnblogs.com/chengxiao/p/6103002.html
		for (int j = 0; j < doubles.length - 1; j++) {
			for (int k = j + 1; k < doubles.length; k++) {
				if (doubles[j] < doubles[k]) {
					double temp = doubles[j];
					doubles[j] = doubles[k];
					doubles[k] = temp;
				}
			}
		}
		for(int j=0;j<doubles.length;j++)
		System.out.println("简单排序后的值" + doubles[j]);

		// 冒泡排序 有小到大 https://www.cnblogs.com/chengxiao/p/6103002.html
		for (int m = 0; m < doubles.length - 1; m++) {
			for (int n = 0; n < doubles.length - 1 - m; n++) {
				if (doubles[n] > doubles[n + 1]) {
					double temp = doubles[n];
					doubles[n] = doubles[n + 1];
					doubles[n + 1] = temp;
				}
			}}
        for(int j=0;j<doubles.length;j++)
            System.out.println("冒泡排序后的值" + doubles[j]);

		// 插入排序 由大到小 https://www.cnblogs.com/chengxiao/p/6103002.html
		for (int x = 1; x < doubles.length; x++) {
			int y = x;
			while (y > 0 && doubles[y] < doubles[y -1]) {
				double temp = doubles[y];
				doubles[y] = doubles[y - 1];
				doubles[y - 1] = temp;
				y--;
			}
        }
            for(int j=0;j<doubles.length;j++)
                System.out.println("插入排序后的值" + doubles[j]);
	}

	public void test04(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Scanner in = new Scanner(System.in);
        System.out.println("请依次输入北京时间的年份、月份、日期、时间数、分钟数，秒数用空格隔开……");
        String str1 = in.nextLine();
        String[] arr = str1.split(" ");
        if(arr.length != 6){
            System.out.println("你输入的数据个数不符合题意");
        }else{
            String str = arr[0]+"-"+arr[1]+"-"+arr[2]+" "+arr[3]+":"+arr[4]+":"+arr[5];

            Date date = null;
            try {
                date = sdf.parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            System.out.println("北京时间为：" + sdf.format(date.getTime()));
            System.out.println("巴黎时间为：" + sdf.format(date.getTime() - (long)7* 60 * 60 * 1000));
            System.out.println("纽约时间为：" + sdf.format(date.getTime() - (long)12* 60 * 60 * 1000));
        }
    }


	public static void main(String[] args) {
		CollectionsPractice01 collectionsPractice01 = new CollectionsPractice01();
		// collectionsPractice01.test01();
		// collectionsPractice01.test02();
//		collectionsPractice01.test03();
		collectionsPractice01.test04();


	}

}
