package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1 seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2 seller findByDepartment =====");
		Department department = new Department(4, null); 
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj: list) {
			System.out.println(obj);
		}
		System.out.println("\n=== TEST 3 seller findAll =====");
		list = sellerDao.findAll();
		for(Seller obj: list) {
			System.out.println(obj);
		}
		System.out.println("\n=== TEST 4 seller insert =====");
		Seller  objSeller = new Seller(null,"Tony","tony@hawks.com",new Date(), 8000.0,department);
		sellerDao.insert(objSeller); 
		System.out.println("Inserted! New id =" + objSeller.getId());
	}

}
