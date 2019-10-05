package servlets;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import date.Produs;
import date.ProduseCSVParser;
import parser.CSVParserTest;

/**
 * Servlet implementation class LoadData
 */
@WebServlet("/LoadData")
public class LoadData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath()).append("***Data este "+new java.util.Date());
		
		request.getSession().setAttribute("lista", "");
		//TODO Implement db reading
//		Produs p1 = new Produs("supe", "ciorba de vacuta", "ciorba cu vacuta, legume", "9.50",  "poza ciorba", "1", "100");
//		Produs p2 = new Produs("supe", "supa de rosii", "supa", "12.00", "poza supa", "1", "100");
//		Produs p3 = new Produs("supe", "supa de cartofi", "supa", "10.50", "poza supa", "1", "100");
//		
//		List listaProduse = new ArrayList<Produs>();
//		listaProduse.add(p1);
//		listaProduse.add(p2);
//		listaProduse.add(p3);
//		request.getSession().setAttribute("listaProduse", listaProduse);
		
		File sursa = new File ("c:\\meniu\\produse.csv");
        ProduseCSVParser parser = new ProduseCSVParser(sursa);
        parser.parse();
    	request.getSession().setAttribute("listaProduse", parser.getLista());
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/meniu.jsp");
		 rd.forward(request, response);
		
		 //response.sendRedirect(meniu.jsp);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
