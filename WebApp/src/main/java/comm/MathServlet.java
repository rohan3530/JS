package comm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MathServlet extends HttpServlet{
  
  @Override
  public void init() throws ServletException {
    // TODO Auto-generated method stub
    System.out.println(" init methode ");
  }
  
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // TODO Auto-generated method stub
    System.out.println(" service methode ");
   doPost(req, resp);
  }
  
//  @Override
//  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    // TODO Auto-generated method stub
//    System.out.println(" doGet methode ");
//    MathOperation mathOperation = new MathOperation(5);
//    PrintWriter pw = resp.getWriter();
//    
//    pw.write("<html>");
//    pw.write("<body>");
//    pw.write(mathOperation.table());
//    pw.write("</body>");
//    pw.write("</html>");
//  }
  
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // TODO Auto-generated method stub
    System.out.println(" doPost methode ");
    MathOperation mathOperation = new MathOperation(5);
    PrintWriter pw = resp.getWriter();
    
    pw.write("<html>");
    pw.write("<body>");
    pw.write(mathOperation.table());
    pw.write("</body>");
    pw.write("</html>");
  }
  
  @Override
  public void destroy() {
    // TODO Auto-generated method stub
    System.out.println(" destroy methode ");
  }

}


