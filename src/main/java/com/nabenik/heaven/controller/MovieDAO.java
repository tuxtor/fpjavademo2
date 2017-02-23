package com.nabenik.heaven.controller;

import static com.nabenik.model.tables.Movie.MOVIE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.stream.Collectors;

import org.jooq.DSLContext;
import org.jooq.Record3;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import com.nabenik.heaven.rest.MovieDTO;

import javaslang.collection.List;
import javaslang.control.Try;

public class MovieDAO {
	String userName = "postgres";
	String password = "informatica";
	String url = "jdbc:postgresql://localhost:5432/movies";

	/**
	 * Try monad demonstration with javaslang
	 * 
	 * @return
	 */
	public List<MovieDTO> retrieveNewCenturyMovies() {
		return Try.of(this::retrieveMovies)// No stream
				.getOrElse(List.empty())
				.filter(x -> x.getYear() > 2000);// No collector
	}

	/**
	 * Retrieval demonstration with jooq
	 * 
	 * @return movies list in MovieDTO format
	 * @throws SQLException
	 */
	public List<MovieDTO> retrieveMovies() throws SQLException {
		try (Connection conn = DriverManager.getConnection(url, userName, password)) {
			DSLContext context = DSL.using(conn, SQLDialect.POSTGRES_9_5);

			Result<Record3<String, Integer, String>> result = context
					.select(MOVIE.MOVIE_TITLE, MOVIE.TITLE_YEAR, MOVIE.MOVIE_IMDB_LINK)
					.from(MOVIE)
					.orderBy(MOVIE.MOVIE_TITLE)
					.maxRows(50)
					.fetch();

			// DTO on the fly!
			return List.ofAll(result.stream()// Stream
					//.peek(System.out::println)// Debug
					.map(r -> new MovieDTO(r.getValue(MOVIE.MOVIE_TITLE),
							r.getValue(MOVIE.TITLE_YEAR),
							r.getValue(MOVIE.MOVIE_IMDB_LINK)))
					.collect(Collectors.toList()));// Collector
		}
	}

}
