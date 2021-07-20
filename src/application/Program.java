package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Department obj = new Department(1, "Books");
		Seller seller = new Seller(1, "Alex Green", "alex@gmail.com", sdf.parse("16/07/1966"), 3000.00, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);

	}

}
