package model.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;


import model.dao.daobook;
import model.db.DB;

public class Bookdao implements daobook {
DB datasourec=new DB();
	
	JdbcTemplate jdbctemplet=new JdbcTemplate(datasourec.datasourec());

	@Override
	public boolean addbook(Object item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletbook(Object item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatebook(Object item) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
