package com.rensyu.action;
import com.rensyu.dao.UserdeleteDAO;
import com.rensyu.dto.UserdeleteDTO;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserdeleteAction extends ActionSupport{

	private UserdeleteDAO dao = new UserdeleteDAO();
	private ArrayList<UserdeleteDTO> userList = new ArrayList<UserdeleteDTO>();

	public String execute()throws SQLException{

		String result = SUCCESS;
		userList = dao.getUserInfo();

		return result;
	}
	public ArrayList<UserdeleteDTO> getUserList(){
		return this.userList;
	}
}
