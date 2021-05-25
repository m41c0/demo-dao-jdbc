package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TESTE 1: department findById ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		
		System.out.println("\n=== TESTE 2: department findAll ===");
		Department department = new Department();
		List<Department> list =  departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		/*
		System.out.println("\n=== TESTE 2: seller findByDepartmentId ===");
		Department department = new Department(2, null);
		List<Seller> list =  sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		
		
		System.out.println("\n=== TESTE 4: seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "gerg@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = "+ newSeller.getId());
		
		System.out.println("\n=== TESTE 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		
		System.out.println("\n=== TESTE 5: seller delete ===");
		System.out.println("Enter id for delete teste> ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete complete");
		*/
		sc.close();
	}

}
