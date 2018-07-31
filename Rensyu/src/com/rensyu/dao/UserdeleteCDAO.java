package com.rensyu.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import com.rensyu.util.DBConnector;


public class UserdeleteCDAO {

	DBConnector dbc = new DBConnector();
	Connection con = dbc.getConnection();


	public void DeleteUser(String[] deleteusers)throws SQLException{

		String sql ="delete from user where id = ?";
		int s = 0;
		try{
			PreparedStatement ps = con.prepareStatement(sql);

			while(deleteusers[s] != null){
			ps.setString(1, deleteusers[s]);
			ps.execute();
			s++;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}

}
