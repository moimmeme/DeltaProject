package tn.esprit;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class HelloServiceClient {

	public static void main(String[] args) throws NamingException {

		String JJ = "pidev-DeltaProject-ear/pidev-DeltaProject-ejb/AccountServices!Interfaces.IAccountRemote";
		Context context = new InitialContext();
		//IAccountRemote a =new IAccountRemote();context.lookup(JJ);
		// a.addAccount(new BankAccount());

	}

}
