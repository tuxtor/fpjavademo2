package com.nabenik.heaven.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nabenik.heaven.rest.MovieDTO;

public class ImperativeMovieDAO {
	String userName = "postgres";
	String password = "<yourpassword>";
	String url = "jdbc:postgresql://localhost:5432/movies";

	/**
	 * Simple "On memory filtering"
	 * 
	 * @return
	 */
	public List<MovieDTO> retrieveNewCenturyMovies() {
		List<MovieDTO> original = null;
		List<MovieDTO> result = new ArrayList<>();
		try {
			original = this.retrieveMovies();
			//Mutating the result set
			for (MovieDTO movieDTO : original) {
				if(movieDTO.getYear() > 2000){
					result.add(movieDTO);
				}
			}
			return result;
		} catch (SQLException e) {
			//Side effect
			return new ArrayList<>();
		}
		
	}

	/**
	 * Retrieval demonstration with imperative code
	 * 
	 * @return movies list in MovieDTO format
	 * @throws SQLException
	 */
	public List<MovieDTO> retrieveMovies() throws SQLException {
		List<MovieDTO> result = new ArrayList<>();
		try (Connection c = DriverManager.getConnection(url, userName, password)) {
			//Declarative
		    String sql = "select movie_title, title_year, movie_imdb_link "
		    		+ "from movie "
		    		+ "order by movie_title";
		 
		    //Imperative and not typesafe
		    try (PreparedStatement stmt = c.prepareStatement(sql);) {
		    	stmt.setMaxRows(50);
		    	ResultSet rs = stmt.executeQuery();

		        while (rs.next()) {
		        	MovieDTO dto = new MovieDTO(rs.getString("movie_title"), 
		        			rs.getInt("title_year"),
							rs.getString("movie_imdb_link"));
		        	result.add(dto);
		        }
		    }
		}
		return result;
	}
}
