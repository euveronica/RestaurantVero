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

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import date.Produs;
import date.ProduseCSVParser;
import parser.CSVParserTest;
import util.HibernateUtil;

/**
 * Servlet implementation class LoadData
 */
@WebServlet("/LoadData")
public class LoadData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected SessionFactory sessionFactory;
       
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

		SessionFactory factory = HibernateUtil.getSessionfactory();
		Session session = factory.openSession();
		try {
			Query query = session.createQuery("from Produs");
			List produse = query.list();
			request.setAttribute("produse", produse);
		} finally {
			session.close();
				}
		RequestDispatcher rd = request.getRequestDispatcher("/meniu.jsp");
		 rd.forward(request, response);
		
		
//		java.util.List listaProduse = Hibernate.getListData(data.getLista());
//			
//		Produs produs = new Produs();
//		request.getServletContext().setAttribute("listaProduse", produs);
//		
//		Session session = sessionFactory.openSession();
//   	       
//        Produs produs = session.get(Produs.class, produsId);
		
//		File sursa = new File ("c:\\meniu\\produse.csv");
//        ProduseCSVParser parser = new ProduseCSVParser(sursa);
//        parser.parse();
//    	request.getSession().setAttribute("listaProduse", parser.getLista());
		
		
		
		
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
