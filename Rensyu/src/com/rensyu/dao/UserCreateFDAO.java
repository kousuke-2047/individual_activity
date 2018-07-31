package com.rensyu.dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import com.rensyu.util.DBConnector;
import com.rensyu.util.DateUtil;
import java.sql.SQLException;


public class UserCreateFDAO {

	private DBConnector dbc = new DBConnector();
	private Connection con = dbc.getConnection();
	private DateUtil dateutil = new DateUtil();

	private String sql ="insert into user(userId,userPassword,userName,insertdate) values(?,?,?,?)";

	public void UserCreate(String createId,String createPass,String createName)throws SQLException{

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, createId);
			ps.setString(2, createPass);
			ps.setString(3, createName);
			ps.setString(4, dateutil.getDate());
			ps.execute();



		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}



	}

}
