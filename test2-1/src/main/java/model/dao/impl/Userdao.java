package model.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import domain.User;
import model.dao.userdao;
import model.db.DB;

public class Userdao implements userdao<User> {
DB datasourec=new DB();
int y=0;
//int x=0;
	JdbcTemplate jdbctemplet=new JdbcTemplate(datasourec.datasourec());
	
	@Override
	public void adduser(User item) {
		
		String usertname=item.getUsername();
		String password=item.getPassword();
		String firstname=item.getFirstname();
		String lastname=item.getLastname();
		String email=item.getEmail();
		boolean type=item.isType();
		
		String sql_insert= "insert into bookshop.user values(?,?,?,?,?,?,?);";
	  int x= jdbctemplet.update(sql_insert,incur(),usertname,password,firstname,lastname,email,type);
			
	}
	
		
	public int incur() {
		int x=0;
		return ++x;
	}
	
	

}
