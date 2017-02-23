package com.nabenik.heaven.rest;

import io.vertx.core.Vertx;

public class MoviesMain {
	public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(MoviesVerticle.class.getName());
    }
}
