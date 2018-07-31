package com.item.dao;

import com.item.dto.ItemDTO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import com.item.util.DBConnector;
import java.util.ArrayList;
import com.item.dto.ItemCDTO;

public class ItemDAO {

	private DBConnector dbc = new DBConnector();
	private Connection con = dbc.getConnection();

	private  ItemCDTO itemcdto = new ItemCDTO();

	public ArrayList<ItemCDTO> Itemcount()throws SQLException{

		ArrayList<ItemCDTO> pagecdto = new ArrayList<ItemCDTO>();
		String sql = "select count(*) from item";

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			rs.next();

			itemcdto.setCount(rs.getInt(1));

			int f =itemcdto.getCount()/4+1;


			for( int i=1; i<=f;i++){
				ItemCDTO dto =new ItemCDTO();
				dto.setPage(i);
				pagecdto.add(dto);
			}

		}catch(Exception e ){
			e.printStackTrace();
		}

		return pagecdto;
	}


	public ArrayList<ItemDTO> getItemInfo(int number)throws SQLException{

		ArrayList<ItemDTO> itemdto = new ArrayList<ItemDTO>();

		String sql ="select * from item limit ?,4";


		try{
			PreparedStatement ps = con.prepareStatement(sql);


				int num = number*4-4;
				ps.setInt(1,num);


			ResultSet rs =ps.executeQuery();

			while(rs.next()){
				ItemDTO dto = new ItemDTO();
				dto.setId(rs.getInt("id"));
				dto.setItemName(rs.getString("itemName"));
				dto.setItemPrice(rs.getInt("itemPrice"));
				dto.setCategory(rs.getString("category"));
				itemdto.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return itemdto;
	}



}
