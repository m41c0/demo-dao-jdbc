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
		

		System.out.println("\n=== TESTE 3: department insert ===");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = "+ newDepartment.getId());
		
		System.out.println("\n=== TESTE 4: department update ===");
		Department dep2 = departmentDao.findById(1);
		dep2.setName("Food");
		departmentDao.update(dep2);
		System.out.println("Update completed");
		
		/*
		
		
		
		

		
		
		System.out.println("\n=== TESTE 5: seller delete ===");
		System.out.println("Enter id for delete teste> ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete complete");
		*/
		sc.close();
	}

}
