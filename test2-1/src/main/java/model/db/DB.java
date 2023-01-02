package model.db;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DB {
		public DriverManagerDataSource datasourec(){
		DriverManagerDataSource datasource=new DriverManagerDataSource("jdbc:mysql://localhost:3306/bookshop","root","123456789");
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	return datasource;
	}
}
