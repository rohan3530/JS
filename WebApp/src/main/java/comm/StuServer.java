package comm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StuServer extends HttpServlet{

		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doPost(req, resp);
		}
		
//		@Override
//		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//			// TODO Auto-generated method stub	
//		}
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			
			Stu stud = new Stu();
			String str1 = req.getParameter("rollNo");
			String str3= req.getParameter("name");
			String str2 = req.getParameter("marks");
			int in1 = Integer.parseInt(str1);
			int in2 = Integer.parseInt(str2);

			stud.setStudRollNo(in1);
			stud.setStudName(str3);
			stud.setStudMarks(in2);
			
			PrintWriter pw = resp.getWriter();
			pw.write("<html>");
			pw.write("<body>");
			pw.write(stud.displayInfo());;
			pw.write("</body>");
			pw.write("</html>");
			
		}
		
		@Override
		public void destroy() {
			// TODO Auto-generated method stub
			System.out.println("Destroy Method");
		}
}
