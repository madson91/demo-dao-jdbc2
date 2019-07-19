package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao dao = DaoFactory.createSellerDao();
		
		System.out.println("teste 1");
		Seller seller = dao.findById(7);
		System.out.println(seller);
		
		System.out.println("teste 2");
		Department dep = new Department(4, null);
		List<Seller> list = dao.findByDepartment(dep);
		for (Seller seller2 : list) {
			System.out.println(seller2);
		}
//		list.stream().forEach(list -> System.out.println(list));
	} 

}
