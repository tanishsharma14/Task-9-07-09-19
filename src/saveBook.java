

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/saveBook")
public class saveBook extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String subject=request.getParameter("subject");
		int price=Integer.parseInt(request.getParameter("price"));
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "");
			
			PreparedStatement psmt=con.prepareStatement("insert into book values(?,?,?,?)");
			psmt.setInt(1,id);
			psmt.setString(2,name);
			psmt.setString(3,subject);
			psmt.setInt(4,price);
			
			int res=psmt.executeUpdate();
			out.println("Records:"+res);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
