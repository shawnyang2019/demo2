package important.fileio;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndFileWriter2 {

	// static BufferedReader bufferedReader;
	// static BufferedWriter bufferedWriter;
	// static BufferedWriter bufferedWriter1;

	public static void main(String[] args) {
		// 这里的变量的定义是局部变量，定义在函数内部，虽然是主函数，那也是函数，局部变量必须进行初始化，所以这里定义为null
		// 同样把这些变量的定义也可以定义在函数外面，则为全局变量，但是有与主函数时static
		// 类型的，所有定义的全局变量必须也是static，实际上全局变量会默认进行初始化
		// 引用类型变量默认为null，
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		BufferedWriter bufferedWriter1 = null;

		try {
			// 1 创建一个字符输入流
			FileReader fileReader = new FileReader("D:\\oschina\\demo\\test5.txt");
			// 2 把字符输入流包装成一个缓冲字符输入流
			bufferedReader = new BufferedReader(fileReader);

			FileWriter fileWriter = new FileWriter("D:\\oschina\\demo\\test6.txt");

			bufferedWriter = new BufferedWriter(fileWriter);

			FileWriter fileWriter1 = new FileWriter("D:\\oschina\\demo\\test67.txt");

			bufferedWriter1 = new BufferedWriter(fileWriter1);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// String str; String str=null;
		// 这两者都会报空指针异常，原因是str在这里是局部变量，局部变量必须进行初始化，不然会报编译错误，这是其一，其二是
		// 也作为引用类型变量，如果没有对进行new操作的话，就没有分配一个地址给他，则会报空指针异常
		// String str = "012345";
		// str=null; 同样及时，在之前new 了 str
		// 的对象，这里如果同样写上这个语句，也会报空指针异常，因为这个语句表示这里指向了一个空的地址
		char[] chars = new char[1024];
		int len = 0;
		// bufferedRead.read(c) 把字符读进数组，返回的是读入的字符数，当返回的是-1，表示流的末尾已经到达
		try {
			while ((len = bufferedReader.read(chars)) != -1) {
				bufferedWriter.write(chars, 0, len);
				// System.out.println(bufferedWriter.write(c,0,len));
				// bufferedRead.write() 返回值类型为空，所以不能打印出来
				// 需要下面的flush或者close 语句 缓冲区的语句才会写入到文件中，切记
				String a = new String(chars);
				// 把chars中的内容赋值给啊 之后才能用write进行输出给文件
				bufferedWriter1.write(a, 0, a.length());
				bufferedWriter.flush();
				bufferedWriter1.flush();
				System.out.println(chars);
				System.out.println(a);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
				bufferedWriter.close();
				bufferedWriter1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
