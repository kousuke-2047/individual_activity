package com.rensyu.action;

import com.opensymphony.xwork2.ActionSupport;
import com.rensyu.dao.MypageDAO;
import com.rensyu.dto.MypageDTO;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;
import java.util.ArrayList;
import java.sql.SQLException;


public class MypageAction extends ActionSupport implements SessionAware{

	private MypageDAO mypagedao = new MypageDAO();
	public Map<String ,Object>session;
	private ArrayList<MypageDTO> mypageList = new ArrayList<MypageDTO>();


	public String execute() throws SQLException{

		mypageList = mypagedao.getHistoryInfo(session.get("userId").toString());




		String result = SUCCESS;

		return result;
	}
	public void setSession(Map<String,Object>session){
		this.session = session;
	}
	public ArrayList<MypageDTO> getMypageList(){
		return this.mypageList;
	}
}
