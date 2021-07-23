package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	// Ter� opera��es est�ticas para implementar o DAO
	// O createSellerDao ter� que retornar um SellerDao
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection()); //retorna um SellerDaoJDBC
		// Desta forma, a minha classe DaoFactory vai expor um m�todo que retorna
		// o tipo da interface(SellerDao) mas internamente ela vai instanciar
		// um implementa��o(return new SellerDaoJDBC())
	}
}
