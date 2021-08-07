package application;

import java.text.ParseException;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDois {

	public static void main(String[] args)  throws ParseException{
		// Gerencia Department
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println(" === TESTE 1: department findById === ");
		System.out.print("Digite o código do departamento: ");
		int codigo = sc.nextInt();
		Department department = departmentDao.findByid(codigo);
		System.out.println(department);
		
		System.out.println(" === TESTE 2: department findAll === ");
		
		System.out.println(" === TESTE 3: department Insert === ");
		
		System.out.println(" === TESTE 4: department Update === ");
		
		System.out.println(" === TESTE 5: department Delete === ");
		
		sc.close();

	}

}
