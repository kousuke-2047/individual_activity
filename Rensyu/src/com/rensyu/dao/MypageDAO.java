package com.rensyu.dao;

import com.rensyu.dto.MypageDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import com.rensyu.util.DBConnector;
import java.sql.SQLException;
import java.util.ArrayList;


public class MypageDAO {


	private DBConnector dbc = new DBConnector();
	private Connection con = dbc.getConnection();


	public ArrayList<MypageDTO> getHistoryInfo(String userId)throws SQLException{

		ArrayList<MypageDTO> mypagedto = new ArrayList<MypageDTO>();

		String sql = "select * from history h left join item i on h.itemid =i.id where h.userid = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, userId);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				MypageDTO dto= new MypageDTO();
				dto.setId(rs.getInt("id"));
				dto.setItemName(rs.getString("itemName"));
				dto.setTotalPrice(rs.getInt("totalPrice"));
				dto.setTotalCount(rs.getInt("totalCount"));
				dto.setPay(rs.getString("pay"));
				dto.setInsertdate(rs.getString("insertdate"));
				mypagedto.add(dto);

			}

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return mypagedto;
	}


}
