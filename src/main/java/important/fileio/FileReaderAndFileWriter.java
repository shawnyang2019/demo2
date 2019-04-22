package important.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * https://blog.csdn.net/weixin_36586120/article/details/80486112
 * https://blog.csdn.net/nightcurtis/article/details/51324105
 */

public class FileReaderAndFileWriter {

	public static void main(String[] args) throws IOException {
		//由于从txt文件中就是字符，所以不需要通过字节转化成字符的操作（InputStreamReader()),
		//从键盘中输入的是字节，所以如果要把键盘中输入的内容在txt文件中显示出来就需要字节字符转化操作
		BufferedReader br = new BufferedReader(new FileReader("test3.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("test4.txt"));
		char[] chars = new char[1024];
		int len = 0;
		while ((len = br.read(chars)) != -1) {
			bw.write(chars, 0, len);
			bw.flush();
		}
		br.close();
		bw.close();
	}
}
//	//
//	public static void main(String[] args) throws IOException {
//		// 创建字符输入流
//		FileReader fileReader = new FileReader("test3.txt");
//		// 创建一个长度为1024的竹筒
//		char[] c = new char[1024];
//		int hasRead=0;
//		// 用竹筒来取水。read 的三种方法
//		// int read();
//		// 从输入流中读取单个字符（相当于从图15.5所示的水管中取出一滴水），返回所读取的字符数据（字节数据可直接转换为int类型）。
//		// int read(char[] b)从输入流中最多读取b.length个字符的数据，并将其存储在字节数组b中，返回实际读取的字符数。
//		// int read(char[] b,int off,int len);
//		// 从输入流中最多读取len个字符的数据，并将其存储在数组b中，放入数组b中时，并不是从数组起点开始，而是从off位置开始，返回实际读取的字符数。
//		while ((hasRead=fileReader.read(c))>0){
//
//
//        }
//	}
//}

//public class FileReaderAndFileWriter {
//	public static void main(String[] args) throws IOException {
//		FileInputStream fis = null;
//		try {
//			//创建字节输入流
//			fis = new FileInputStream("Test3.txt");
//			//创建一个长度为1024的竹筒
//			byte[] b = new byte[1024];
//			//用于保存的实际字节数
//			int hasRead = 0;
//			//使用循环来重复取水的过程
//			while ((hasRead = fis.read(b)) > 0) {
//				//取出竹筒中的水滴（字节），将字节数组转换成字符串进行输出
//				System.out.print(new String(b, 0, hasRead));
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			fis.close();
//		}
//	}
//}
//

