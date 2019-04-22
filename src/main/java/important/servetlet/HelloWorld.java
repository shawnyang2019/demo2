package important.servetlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *Socket与Servlet的简单理解和区别  https://blog.csdn.net/sdjkjsdh/article/details/51569481
 */
public class HelloWorld extends HttpServlet {

	private String message;

	public void init() throws ServletException {
		// 初始化
		message = "Hello, First Servlet!\\";
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        String a = request.getParameter("value");
        request.getParameterNames();
        System.out.println(a);
		// 设置:响应内容类型
		response.setContentType("text/html");

		// 输出文本
		PrintWriter out = response.getWriter();
		out.write("<h1> " + message + " </h1>");
	}
}