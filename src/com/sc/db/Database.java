package com.sc.db;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Database {
	public static DISPLAY sex;
	private final String projectname = "Barcharts";

	public Database(){
		sex = DISPLAY.M;
	}
	public void query(){
		ResultSet r = null;
		try {
			// Test Connection
			String path = new File("").getAbsolutePath();
			path += "/" + projectname +".app/Contents/db";
			Connection conn = DriverManager.getConnection("jdbc:derby:"+path);
			System.out.println("Database Connected");
			Statement s = conn.createStatement();
//			r = s.executeQuery("SELECT * FROM ");
//			while(r.next()){
//				//result.add(new Runner(r.getInt("AGE"),r.getString("SEX") , r.getFloat("HOURS"), r.getInt("AGECAT8"), r.getInt("AGECAT6"), r.getInt("SEX2"), r.getInt("TIME5")));
//			}
		}catch(SQLException e){
			System.out.println("ERROR:::Database didn't connect");
		}
		
	}

}
