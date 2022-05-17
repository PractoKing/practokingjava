import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
 private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

 /**
  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  //response.getWriter().append("Served at: ").append(request.getContextPath());
  
  PrintWriter out = response.getWriter();
  String name = request.getParameter("n");
  double n1 = Double.parseDouble(request.getParameter("n1"));
  double n2 = Double.parseDouble(request.getParameter("n2"));
  String cal = request.getParameter("cal");
  
  out.println("<h1>Welcome<h1> " +name);
  switch(cal) {
  case"+":
   out.println(n1+n2);
      break;
  case"-":
   out.println(n1-n2);
      break;
  case"*":
   out.println(n1*n2);
      break;
  case"/":
   out.println(n1/n2);
      break;
  }
 }

 /**
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  doGet(request, response);
 }

}
