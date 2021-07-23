package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	// Terá operações estáticas para implementar o DAO
	// O createSellerDao terá que retornar um SellerDao
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection()); //retorna um SellerDaoJDBC
		// Desta forma, a minha classe DaoFactory vai expor um método que retorna
		// o tipo da interface(SellerDao) mas internamente ela vai instanciar
		// um implementação(return new SellerDaoJDBC())
	}
}
