

import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Display
 */
@WebServlet("/Display")
public class Display extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String path="C:/Users/shiv/Desktop/Myfiles/";
		String ext=request.getParameter("name").substring(request.getParameter("name").lastIndexOf("."));
		path+=request.getParameter("name");
		
		System.out.println(path);
		FileInputStream fis=new FileInputStream(path);
		byte b[]=new byte[fis.available()];
		fis.read(b);
		fis.close();
		ServletOutputStream sos;
		
		
		
		if(ext.equals(".jpg"))
		{
			response.setContentType("application/msword");
			sos=response.getOutputStream();
			sos.write(b);
			sos.close();
			
		}else if(ext.equals(".doc"))
		{
			response.setContentType("application/msword");
			sos=response.getOutputStream();
			sos.write(b);
			sos.close();
		}
		
		
	}

}
