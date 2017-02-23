package com.nabenik.heaven.rest;

import com.nabenik.heaven.controller.MovieDAO;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.Json;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;

public class MoviesVerticle extends AbstractVerticle {

	// Maybe use DI
	MovieDAO movieService = new MovieDAO();

	@Override
	public void start(Future<Void> fut) {
		// Create a router object.
		Router router = Router.router(vertx);

		//Routes programming
		router.route("/").handler(routingContext -> {
			HttpServerResponse response = routingContext.response();
			response.putHeader("content-type", "text/html").end("<h1>Hello from my verticle</h1>");
		});
		router.get("/api/movies").handler(this::getAll);

		vertx.createHttpServer().requestHandler(router::accept).listen(
				// Retrieve the port from the configuration,
				// default to 8080.
				config().getInteger("http.port", 8080), result -> {
					if (result.succeeded()) {
						fut.complete();
					} else {
						fut.fail(result.cause());
					}
				});
	}

	/**
	 * Bullet proof JSON marshaling
	 * @param routingContext
	 */
	private void getAll(RoutingContext routingContext) {
		routingContext.response().putHeader("content-type", "application/json; charset=utf-8")
				.end(Json.encodePrettily(movieService.retrieveNewCenturyMovies().toJavaArray()));
	}
}