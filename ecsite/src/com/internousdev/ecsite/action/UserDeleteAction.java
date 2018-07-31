package com.internousdev.ecsite.action;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.ArrayList;
import com.internousdev.ecsite.dao.UserDeleteDAO;
import com.internousdev.ecsite.dto.UserDeleteDTO;

public class UserDeleteAction extends ActionSupport{

	private ArrayList<UserDeleteDTO> userList = new ArrayList<UserDeleteDTO>();
	private UserDeleteDAO userddao = new UserDeleteDAO();
	private String[] deleteu;
	private String deleteF;
	private String message;

	public String execute() throws SQLException{

		if(deleteF==null){

		}else{
			if(getDeleteu() != null){
				userddao.DeleteUser(deleteu);
				message = "ユーザー削除に成功しました";
			}else{
				message = "ユーザー削除に失敗しました";
			}
		}
		userList = userddao.getUserInfo();
		String result = SUCCESS;
		return result;
	}
	public ArrayList<UserDeleteDTO> getUserList(){
		return this.userList;
	}
	public String getMessage(){
		return message;
	}
	public void setMessage(String message){
		this.message = message;
	}
	public String[] getDeleteu(){
		return deleteu;
	}
	public void setDeleteu(String[] deleteu){
		this.deleteu = deleteu;
	}
	public String getDeleteF(){
		return deleteF;
	}
	public void setDeleteF(String deleteF){
		this.deleteF = deleteF;
	}

}
