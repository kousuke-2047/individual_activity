package com.rensyu.action;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import com.rensyu.dao.DeleteHDAO;

public class DeleteHAction extends ActionSupport{

	private DeleteHDAO dao = new DeleteHDAO();
	public String deleteid;

	public String execute()throws SQLException{

		String result;

		if(deleteid == null){
		result =ERROR;
		}else{
		dao.deleteHInfo(deleteid);
		result = SUCCESS;
		}
		return result;
	}

}
