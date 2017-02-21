package com.nabenik.heaven;

import com.nabenik.heaven.fblocks.FunctionalController;
import com.nabenik.heaven.fblocks.StreamController;

public class Main {
	


	public static void main(String[] args) {
		// First demo - Lambda function
		FunctionalController functionalController = new FunctionalController();
		functionalController.doDemo();
		
		// Second demo - Streams
		StreamController streamController = new StreamController();
		streamController.doDemo();

	}

}
