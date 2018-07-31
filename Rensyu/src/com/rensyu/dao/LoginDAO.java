package com.rensyu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.rensyu.util.DBConnector;
import com.rensyu.dto.LoginDTO;

public class LoginDAO {

	private DBConnector dbc = new DBConnector();
	private Connection con = dbc.getConnection();
	private LoginDTO  logindto = new LoginDTO();

	public LoginDTO LoginInfo(String LoginId,String LoginPassword){


		String sql ="select * from user where userId = ? and userPassword = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1,LoginId);
			ps.setString(2, LoginPassword);

			ResultSet rs =  ps.executeQuery();

			if(rs.next()){
				logindto.setLoginId(rs.getString("userId"));
				logindto.setLoginPassword(rs.getString("userPassword"));

				if(!(rs.getString("userId").equals(null))){
					logindto.setLoginFlg(true);
				}else{
					logindto.setLoginFlg(false);
				}
			}

		}catch(Exception e){
			e.printStackTrace();

		}
	return logindto;
	}
	public LoginDTO getLoginDTO(){
		return logindto;
	}



}
