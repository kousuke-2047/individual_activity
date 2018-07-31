package com.internousdev.ecsite.dao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.internousdev.ecsite.util.DBConnector;

public class UserDeleteCDAO {

	private DBConnector dbc = new DBConnector();
	private Connection con = dbc.getConnection();
	String sql = "delete from login_user_transaction where id = ?";

	public void DeleteUser(String[] id)throws SQLException{
	try{
		PreparedStatement ps = con.prepareStatement(sql);
		int s = 0;

		while(id[s].equals(null)){
			ps.setString(1, id[s]);
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
