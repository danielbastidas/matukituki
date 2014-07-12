package main.java.com.dataca.appengine.queue;

//The Enqueue servlet should be mapped to the "/enqueue" URL.
import static com.google.appengine.api.taskqueue.TaskOptions.Builder.withUrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;

public class Enqueue extends HttpServlet {
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
	 String[] keys = new String[10];
	// Adds the task to the default queue.
	 Queue queue = QueueFactory.getDefaultQueue();
	 for (int i = 0; i < keys.length;i++) {
		 keys[i] = request.getParameter("key"+(i+1));
		 queue.addAsync(withUrl("/worker").param("key", keys[i]));
		 
	 }

     response.sendRedirect("/");
 }
}
