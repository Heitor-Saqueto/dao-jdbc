package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== TEST 1 department findById =====");
		Department department = departmentDao.findById(4);
		System.out.println(department);
		
		System.out.println("=== TEST 2 department deleteById =====");
		System.out.println("Delete department by id: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
	}

	
}
