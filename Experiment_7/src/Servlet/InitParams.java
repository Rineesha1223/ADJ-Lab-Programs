package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParams extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletConfig cfg = null;
	
    public InitParams() {
        super();
    }

    public void init(ServletConfig config) {
    	cfg = config;
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie c[] = new Cookie[4];
		int i = 0;
		
		Enumeration enu = cfg.getInitParameterNames();
		while(enu.hasMoreElements()) {
			String name = enu.nextElement().toString();
			String value = cfg.getInitParameter(name);
			c[i] = new Cookie(name,value);
			response.addCookie(c[i]);
			i++;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		Cookie c[] = request.getCookies();
		int flag = 0;
		
		for(Cookie x:c) {
			String cname = x.getName().toString();
			String cpass = x.getValue().toString();
			System.out.println(cname+" "+cpass);
			if(name.equals(cname) && pass.equals(cpass)) {
				//System.out.println("HIII");
				out.println("<h3>Hello,"+cname+"....You have logged in successfully.");
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			out.println("Invalid user.");
		}
	}

}
