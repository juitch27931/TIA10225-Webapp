package com.reply.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ReplyJDBCDAO implements ReplyDAO_interface{
	private static final String INSERT_STMT = 
			"INSERT INTO reply (customer_id, reply_subject, reply_message, reply_time, member_id) VALUES (?, ?, ?, ?, ?)";

	@Override
	public void insert(ReplyVO ReplyVO) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Context ctx = new javax.naming.InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/TIA102G2abc");
			con = ds.getConnection();
			
			pstmt = con.prepareStatement(INSERT_STMT);
			pstmt.setInt(1, ReplyVO.getCustomer_id());
			pstmt.setString(2, ReplyVO.getReply_subject());
			/////////////////
			pstmt.executeUpdate();
		}catch(NamingException | SQLException e) {
			throw new RuntimeException("A database error occured.");
		}finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
	}

	@Override
	public List<ReplyVO> getByCustomer(Integer customer_id) {
		List<ReplyVO> getByCustomer = new ArrayList<>();
		
		
		
		
		
		return getByCustomer;
	}

}
