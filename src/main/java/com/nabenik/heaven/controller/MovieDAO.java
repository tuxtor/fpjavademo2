package com.nabenik.heaven.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static com.nabenik.model.tables.Movie.*;

public class MovieDAO {
	String userName = "postgres";
    String password = "informatica";
    String url = "jdbc:postgresql://localhost:5432/demo";
    
    public void doConnection(){
    	try (Connection conn = DriverManager.getConnection(url, userName, password)) {
    		DSLContext create = DSL.using(conn, SQLDialect.POSTGRES_9_5);
    		Result<Record> result = create.select().from(MOVIE).fetch();
    		
    		for (Record r : result) {
                String title = r.getValue(MOVIE.TITLE);
                int year = r.getValue(MOVIE.RELEASE_YEAR);

                System.out.println("Title: " + title + " Release: " + year );
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
