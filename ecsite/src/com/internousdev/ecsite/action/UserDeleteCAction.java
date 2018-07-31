package com.internousdev.ecsite.action;

import com.internousdev.ecsite.dao.UserDeleteCDAO;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;

public class UserDeleteCAction extends ActionSupport{

	private String[] deleteu;
	private UserDeleteCDAO userdeletecdao = new UserDeleteCDAO();


	public String execute()throws SQLException{
		String result;

		if(deleteu[0].equals(null)){
			result=ERROR;
		}else{
		userdeletecdao.DeleteUser(deleteu);
		result = SUCCESS;
		}
		return result;
	}
	public String[] getDeleteu(){
		return deleteu;
	}
	public void setDeleteu(String[] deleteu){
		this.deleteu = deleteu;
	}

}
