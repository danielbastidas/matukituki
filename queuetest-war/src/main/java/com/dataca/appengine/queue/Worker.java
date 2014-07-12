package main.java.com.dataca.appengine.queue;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//The Worker servlet should be mapped to the "/worker" URL.
public class Worker extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// Do something with key.
		String key = request.getParameter("key");
		int number = Integer.valueOf(key);
		int result = number * 10;
		
		System.out.println("The key times 10 is equal to:" + result);
	}
}
