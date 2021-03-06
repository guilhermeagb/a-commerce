package br.com.acommerce.cart;

import static java.lang.Long.valueOf;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.acommerce.book.Book;
import br.com.acommerce.book.BookDAO;

@WebServlet("/add-to-cart")
public class AddToCartServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		Connection connection = (Connection) req.getAttribute("connection");
		
		Long id = valueOf(req.getParameter("id"));
		BookDAO books = new BookDAO(connection);
		
		
		Book book = books.withId(id);
		Cart cart = (Cart) req.getSession().getAttribute("cart");
		cart.add(book);
		
		res.sendRedirect(req.getContextPath()+"/cart");
	}
	
}
