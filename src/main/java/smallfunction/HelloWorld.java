package smallfunction;

		import java.io.IOException;
		import java.io.PrintWriter;

		import javax.servlet.ServletException;
		import javax.servlet.http.HttpServlet;
		import javax.servlet.http.HttpServletRequest;
		import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
	private String message;

	public void init() throws ServletException {
		// 初始化
		message = "Hello, First Servlet!";
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








