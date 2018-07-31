package com.rensyu.dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import com.rensyu.util.DBConnector;
import com.rensyu.dto.UserdeleteDTO;
import java.util.ArrayList;

public class UserdeleteDAO {

	private DBConnector dbc = new DBConnector();
	private Connection con = dbc.getConnection();



	public  ArrayList<UserdeleteDTO> getUserInfo()throws SQLException{

		ArrayList<UserdeleteDTO> userdeletedto = new ArrayList<UserdeleteDTO>();

		String sql = "select * from user";


		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				UserdeleteDTO dto = new  UserdeleteDTO();
				dto.setUserId(rs.getString("userId"));
				dto.setUserName(rs.getString("userName"));
				dto.setUserPassword(rs.getString("userPassword"));
				dto.setId(rs.getInt("id"));
				userdeletedto.add(dto);
			}


		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return userdeletedto;



	}

}
