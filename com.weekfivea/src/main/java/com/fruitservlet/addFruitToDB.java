package com.fruitservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fruitstuff.DAO;
import com.fruitstuff.Fruit;

/**
 * Servlet implementation class addToDb
 */
@WebServlet("/addToDb")
public class addFruitToDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addFruitToDB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Fruit addTodb = new Fruit();
		
		addTodb.setFruit_name("fruit_name");
		addTodb.setFruit_taste("fruit_taste");
		addTodb.setFruit_price("fruit_price");
		addTodb.setFruit_season("fruit_season");
	
		
		DAO.writeToDatabase(addTodb);
		
		request.getRequestDispatcher("index.html").forward(request, response);
		
	}//doPost

}//class

