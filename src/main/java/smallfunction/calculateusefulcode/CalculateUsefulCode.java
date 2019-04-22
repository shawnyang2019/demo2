package smallfunction.calculateusefulcode;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CalculateUsefulCode {

	private int i;

	public int calculateUsefulCode() {

		try {
			FileReader fileReader = new FileReader(
					"D:\\oschina\\demo\\src\\main\\java\\smallfunction\\HelloWorld.java");

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			try {
				String line = "";
				while ((line = bufferedReader.readLine()) != null) {
					line = line.trim();
					if (line.length() != 0)
						i++;
					//// 下面的另外一种方法执行错误，需要找原因
					// if(line.matches("^[\\s&&[^\\n]]*\\n"))
					// continue;
					// else i++;
				}

				System.out.println("当前文本的行数:" + i);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return i;
	}
}
