package servlet3;


import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletFormularioEntradaDatosPersona extends HttpServlet {
	public ServletFormularioEntradaDatosPersona() {
		// TODO Auto-generated constructor stub
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
	//Obtenim els paràmetres del formulari
		
	String nombre=request.getParameter("nombre");
	String apellidos=request.getParameter("apellidos");
	String DNI=request.getParameter("DNI");
	String telefono=request.getParameter("telefono");
	String fechaNacimiento=request.getParameter("fechaNacimiento");
	
	//Preparem la sortida d'aquest mètode, que serà una plana HTML
	
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	//Generació de la resposta html
	
	out.println("<html>");
	out.println("<head><title>Datos introducidos en el formulario</title></head>");
	out.println("<body>");
	out.println("<h2>Datos del formulario:</h2>");
	out.println("<table border=\"0\">");
	out.println("<tr><td><b>Nombre:</b></td><td><i>"+nombre+"</i></td></tr>");
	out.println("<tr><td><b>Apellidos:</b></td><td><i>"+apellidos+"</i></td></tr>");
	out.println("<tr><td><b>DNI:</b></td><td><i>"+DNI+"</i></td></tr>");
	out.println("<tr><td><b>Teléfono:</b></td><td><i>"+telefono+"</i></td></tr>");
	out.println("<tr><td><b>Fecha de Nacimiento:</b></td><td><i>"+fechaNacimiento+"</i></td></tr>");
	out.println("</table><p>");
	out.println("</body>");
	out.println("</html>");
	}
}