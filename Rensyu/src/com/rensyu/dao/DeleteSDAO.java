package com.rensyu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.rensyu.util.DBConnector;
import java.sql.SQLException;

public class DeleteSDAO {

	private DBConnector dbc = new DBConnector();
	private Connection con = dbc.getConnection();

	public void deleteSInfo(String[] deleteids)throws SQLException{

		String sql = "delete from history where id = ?";
		int s = 0;

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			while(deleteids[s] != null){
			ps.setString(1, deleteids[s]);
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
