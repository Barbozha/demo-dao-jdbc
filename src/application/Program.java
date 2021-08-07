package application;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//Department obj = new Department(1, "Books");
		//Seller seller = new Seller(1, "Alex Green", "alex@gmail.com", sdf.parse("16/07/1966"), 3000.00, obj);
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TESTE 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TESTE 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TESTE 3: seller findAll ===");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TESTE 4: seller Insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserido! Novo id = " + newSeller.getId());

		System.out.println("\n=== TESTE 5: seller Update ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update Realizado com Sucesso!");
		
		System.out.println("\n=== TESTE 6: seller Delete ===");
		
		System.out.print("Entre com o Id: ");
		int id = sc.nextInt();
		sellerDao.deletById(id);
		System.out.println("Delete Completo!");
		sc.close();

	}

}
