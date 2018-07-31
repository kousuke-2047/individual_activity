package com.rensyu.action;

import com.opensymphony.xwork2.ActionSupport;
import com.rensyu.dao.UserdeleteCDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import com.rensyu.dao.UserdeleteDAO;
import com.rensyu.dto.UserdeleteDTO;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;


public class UserdeleteCAction extends ActionSupport implements SessionAware{

	private UserdeleteCDAO dao = new UserdeleteCDAO();
	public String[] deleteusers;
	private UserdeleteDAO nodao = new UserdeleteDAO();
	private ArrayList<UserdeleteDTO> userList = new ArrayList<UserdeleteDTO>();
	public Map<String ,Object>session;


	public String execute()throws SQLException{

		String result;

		if(deleteusers==null){
			session.put("userdelete",false);
		}else{
			dao.DeleteUser(deleteusers);

			session.put("userdelete", true);

		}
		userList = nodao.getUserInfo();
		result = SUCCESS;
		return result;
	}
	public ArrayList<UserdeleteDTO> getUserList(){
		return this.userList;
	}
	public void setSession(Map<String,Object>session){
		this.session = session;
	}

}
