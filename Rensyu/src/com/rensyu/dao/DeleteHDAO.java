package com.rensyu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import com.rensyu.util.DBConnector;

public class DeleteHDAO {

	private DBConnector dbc = new DBConnector();
	private Connection con = dbc.getConnection();

	public void deleteHInfo(String deleteid)throws SQLException{




		String sql = "delete from history where id = ?";


		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, deleteid);

			ps.execute();


		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}

}
