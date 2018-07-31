package com.rensyu.action;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import com.rensyu.dao.DeleteSDAO;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;

public class DeleteSAction extends ActionSupport implements SessionAware{

	public String[] deleteids;

	private DeleteSDAO dao = new DeleteSDAO();

	public Map<String, Object>session;

	public String execute()throws SQLException{

		String result;

		if(deleteids==null){
			result = ERROR;
		}else{
			dao.deleteSInfo(deleteids);
			result =SUCCESS;
		}
		return result;
	}
	public void setSession(Map<String ,Object>session){
		this.session = session;
	}
}
