package com.rensyu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.rensyu.util.DBConnector;
import com.rensyu.util.DateUtil;


public class BuyItemCDAO{

	private DBConnector dbc = new DBConnector();
	private Connection con = dbc.getConnection();
	private DateUtil dateUtil = new DateUtil();



	private String sql = "insert into history(itemid,totalPrice,totalCount,userid,pay,insertdate) values(?,?,?,?,?,?)";

	public void BuyItemInfo(String itemid,String totalPrice,String totalCount,String userid,String pay)throws SQLException{



		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1,itemid);
			ps.setString(2,totalPrice);
			ps.setString(3,totalCount);
			ps.setString(4,userid);
			ps.setString(5,pay);
			ps.setString(6,dateUtil.getDate());
			ps.execute();





		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			con.close();
		}
	}
}
