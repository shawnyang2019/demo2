package important.socket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 客户端
 */
public class SocketClientDemo {

	public static void main(String[] args) throws Exception {
		// 1、创建客户端Socket，指定服务器地址和端口
		Socket socket = new Socket("localhost", 9000);
		// 2、获取输出流，向服务器端发送信息
		OutputStream os = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(os);
		pw.write("hello");
		pw.flush();
		socket.shutdownOutput();
		// 3、获取输入流，并读取服务器端的响应信息
		InputStream is = socket.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String info = null;
		while ((info = br.readLine()) != null) {
			System.out.println("client receive: " + info);
		}

		// 4、关闭资源
		br.close();
		is.close();
		pw.close();
		os.close();
		socket.close();
	}

}
