package com.internousdev.ecsite.dao;

import com.internousdev.ecsite.dto.UserDeleteDTO;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.internousdev.ecsite.util.DBConnector;
import java.util.ArrayList;

public class UserDeleteDAO {

	private DBConnector dbc = new DBConnector();
	private Connection con = dbc.getConnection();

	public ArrayList<UserDeleteDTO> getUserInfo()throws SQLException{
		ArrayList<UserDeleteDTO> userList = new ArrayList<UserDeleteDTO>();

		String sql = "select * from login_user_transaction";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				UserDeleteDTO dto = new UserDeleteDTO();
				dto.setId(rs.getInt("id"));
				dto.setLogin_id(rs.getString("login_id"));
				dto.setLogin_pass(rs.getString("login_pass"));
				dto.setUser_name(rs.getString("user_name"));
				userList.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return userList;
	}
	public void DeleteUser(String[] id)throws SQLException{

		String sql = "delete from login_user_transaction where id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			int s = 0;

			while(id[s] !=null){
				ps.setString(1, id[s]);
				ps.execute();
				s++;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
