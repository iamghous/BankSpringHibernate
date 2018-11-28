package com.noman.main.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.noman.main.entity.AccountEntity;
import com.noman.main.model.Account;

@Repository
public class AccountDAOImpl implements AccountDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean saveAccount(Account account) {
		
		boolean saveFlag = true;
		
		AccountEntity accountEntity = new AccountEntity();
		accountEntity.setAccountNumber(account.getAccountNumber());
		accountEntity.setAccountHolderName(account.getAccountHolderName());
		accountEntity.setAccountBalance(account.getAccountBalance());
		accountEntity.setAccountType(account.getAccountType());
		accountEntity.setDateOfBirth(account.getDateOfBirth());
		accountEntity.setPsCode(account.getPsCode());
		
		try {
			Session session = sessionFactory.getCurrentSession();
			session.save(accountEntity);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
	}

}
