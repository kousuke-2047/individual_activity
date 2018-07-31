package com.rensyu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rensyu.util.DBConnector;
import com.rensyu.dto.LoginCDTO;

public class LoginCDAO {

	private DBConnector dbc = new DBConnector();
	private Connection con = dbc.getConnection();
	private LoginCDTO logincdto = new LoginCDTO();

	public LoginCDTO ItemInfo(){
		String sql = "select * from item";

		try{
			PreparedStatement ps = con.prepareStatement(sql);



			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				logincdto.setId(rs.getInt("id"));
				logincdto.setItemName(rs.getString("itemName"));
				logincdto.setItemPrice(rs.getInt("itemPrice"));

			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return logincdto;
	}

}
