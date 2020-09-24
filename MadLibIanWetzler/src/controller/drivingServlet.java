package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MadLib;

/**
 * Servlet implementation class drivingServlet
 */
@WebServlet("/drivingServlet")
public class drivingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public drivingServlet() {
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
		ArrayList<String>adjectives = new ArrayList<String>();
		ArrayList<String> nouns = new ArrayList<String>();
		ArrayList<String> verbs = new ArrayList<String>();
		ArrayList<String> pluralNouns = new ArrayList<String>();
		String adjectiveOne = request.getParameter("adjectiveOne");
		String adjectiveTwo = request.getParameter("adjectiveTwo");
		String nounOne = request.getParameter("nounOne");
		String nounTwo = request.getParameter("nounTwo");
		String nounThree = request.getParameter("nounThree");
		String nounFour = request.getParameter("nounFour");
		String nounFive = request.getParameter("nounFive");
		String nounSix = request.getParameter("nounSix");
		String specialCase = request.getParameter("specialCase");
		String pluralNounOne = request.getParameter("pluralNounOne");
		
		
		adjectives.add(adjectiveOne);
		adjectives.add(adjectiveTwo);
		nouns.add(nounOne);
		nouns.add(nounTwo);
		nouns.add(nounThree);
		nouns.add(nounFour);
		nouns.add(nounFive);
		nouns.add(nounSix);
		pluralNouns.add(pluralNounOne);
		MadLib driving = new MadLib( adjectives,nouns,verbs,pluralNouns,specialCase);
		request.setAttribute("userMadLib", driving);
		getServletContext().getRequestDispatcher("/drivingResults.jsp").forward(request, response);
	}

}
