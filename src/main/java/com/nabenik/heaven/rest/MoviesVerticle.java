package com.nabenik.heaven.rest;

import com.nabenik.heaven.controller.FunctionalMovieDAO;
import com.nabenik.heaven.controller.ImperativeMovieDAO;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.Json;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;

public class MoviesVerticle extends AbstractVerticle {

	// TODO - ConsiderDI
	FunctionalMovieDAO bestService = new FunctionalMovieDAO();
	ImperativeMovieDAO imperativeService = new ImperativeMovieDAO();
	
	@Override
	public void start(Future<Void> fut) {
		// Create a router object.
		Router router = Router.router(vertx);

		//Routes programming
		router.route("/").handler(routingContext -> {
			HttpServerResponse response = routingContext.response();
			response.putHeader("content-type", "text/html").end("<h1>Hello from my verticle</h1>");
		});
		router.get("/api/functional/movies").handler(this::getFromFunctionalMovieDao);
		router.get("/api/imperative/movies").handler(this::getFromImperativeMovieDao);

		vertx.createHttpServer().requestHandler(router::accept).listen(
				config().getInteger("http.port", 8080), result -> {
					if (result.succeeded()) {
						fut.complete();
					} else {
						fut.fail(result.cause());
					}
				});
	}

	private void getFromFunctionalMovieDao(RoutingContext routingContext) {
		routingContext.response().putHeader("content-type", "application/json; charset=utf-8")
				.end(Json.encodePrettily(bestService.retrieveNewCenturyMovies().toJavaArray()));
	}
	
	private void getFromImperativeMovieDao(RoutingContext routingContext) {
		routingContext.response().putHeader("content-type", "application/json; charset=utf-8")
				.end(Json.encodePrettily(imperativeService.retrieveNewCenturyMovies()));
	}
}