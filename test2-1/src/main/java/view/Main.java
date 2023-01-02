package view;

import java.util.Scanner;

import domain.User;
import model.dao.impl.Userdao;

public class Main {
public static void main(String args[]) {	
	int x=0;
	do {
	Scanner input=new Scanner(System.in);
	System.out.print("1-enter username"+"\t");
	String username=input.next();
	System.out.print("2-enter password"+"\t");
	String password =input.next();
	System.out.print("3-enter name"+"\t\t");
	String name=input.next();
	System.out.print ("4-enter lastname"+"\t");
	String lastname=input.next();
	System.out.print("5-enter email"+"\t\t");
	String email=input.next();
	user(username,password,name,lastname,email);
	System.out.println("enter x");
	x=input.nextInt();
	}while(x==1);
}

public static void user(String username,String password,String name,String lastname,String email) {
		User user=new User(username,password,name,lastname,email,true);
		Userdao userdao=new Userdao();
		userdao.adduser(user);	
}
}

