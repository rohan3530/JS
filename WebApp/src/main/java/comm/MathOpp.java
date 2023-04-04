package comm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MathOpp extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Service Method");
		
		MathOperation jam = new MathOperation(5);
		
		PrintWriter pw = res.getWriter();
		
		pw.write("<html>");
		pw.write("<body>");
		pw.write(jam.table());
		pw.write("</body>");
		pw.write("</html>");
		
	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init Method");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy Method");
	}

	

}
