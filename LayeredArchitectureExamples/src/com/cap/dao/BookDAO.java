package com.cap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.cap.beans.BookBean;

public class BookDAO implements BookDaoI{

	public int addBook(BookBean bookBean) throws Exception {
		
		Connection conn=null;
		
		PreparedStatement pstmt=null;
		
		conn=BookDB.getConnection1();

			String ins_str="insert into book values (?,?,?,?)";
			
			pstmt = conn.prepareStatement(ins_str);
			
			pstmt.setInt(1, bookBean.getBookId());
			pstmt.setString(2, bookBean.getTitle());
			pstmt.setFloat(3, bookBean.getPrice());
			pstmt.setString(4, bookBean.getGrade());
			
			int updateResult=pstmt.executeUpdate();
			
			conn.close();
			return updateResult;
		}
		
	}

