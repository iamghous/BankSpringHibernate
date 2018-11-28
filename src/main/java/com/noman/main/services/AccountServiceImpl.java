package com.noman.main.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noman.main.dao.AccountDAO;
import com.noman.main.model.Account;


@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountDAO accountDAO;
	@Transactional
	public boolean saveAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDAO.saveAccount(account);
	}

}
