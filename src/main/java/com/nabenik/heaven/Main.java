package com.nabenik.heaven;


import com.nabenik.heaven.controller.FunctionalMovieDAO;
import com.nabenik.heaven.rblocks.FunctionalController;
import com.nabenik.heaven.rblocks.StreamController;
import com.nabenik.heaven.rest.MovieDTO;

import javaslang.collection.List;

public class Main {
	


	public static void main(String[] args) {
		// First demo - Lambda function
		FunctionalController functionalController = new FunctionalController();
		functionalController.doDemo();
		
		// Second demo - Streams
//		StreamController streamController = new StreamController();
//		streamController.doDemo();
//		
//		// Third demo - Improved streams demo
//		com.nabenik.heaven.lblocks.StreamController impStreamController =
//				new com.nabenik.heaven.lblocks.StreamController();
//		impStreamController.doDemo();
//		
//		FunctionalMovieDAO movieController = new FunctionalMovieDAO();
//		List<MovieDTO> movies = movieController.retrieveNewCenturyMovies();
//		movies.forEach(System.out::println);

	}

}
