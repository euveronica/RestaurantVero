package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import date.Produs;
import util.HibernateUtil;

@WebServlet("/AddProductController")
public class AddProductController extends HttpServlet {

	//protected SessionFactory sessionFactory;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String numeCategorie = request.getParameter("numeCategorie"); 
        String numeProdus = request.getParameter("numeProdus");
        String descriereProdus = request.getParameter("descriereProdus");
        Float pretUnitar = Float.parseFloat(request.getParameter("pretUnitar"));
        Integer stoc = Integer.parseInt(request.getParameter("nivelExistant"));
        Integer numarPortii = Integer.parseInt(request.getParameter("numarPortii"));
        String poza = request.getParameter("poza");
        
        SessionFactory factory = HibernateUtil.getSessionfactory();
		Session session = factory.openSession();
		
		Produs produs = new Produs();
    	produs.setNume_categorie(numeCategorie);
    	produs.setNume_produs(numeProdus);
    	produs.setDescriere_produs(descriereProdus);
    	produs.setPret_unitar(pretUnitar);
    	produs.setNivel_existent(stoc);
    	produs.setNumar_portii(numarPortii);
    	produs.setPoza(poza);
    	
     
        session.beginTransaction();
     
        session.save(produs);
     
        session.getTransaction().commit();
        session.close();
        
//        RequestDispatcher rd = request.getRequestDispatcher("/adaugaProdus.jsp");
//		 rd.forward(request, response);
//		
	
}}
