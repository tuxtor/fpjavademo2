/*
 * This file is generated by jOOQ.
*/
package com.nabenik.model.tables.records;


import com.nabenik.model.tables.Movie;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MovieRecord extends UpdatableRecordImpl<MovieRecord> implements Record7<Long, String, Integer, Byte, String, String, String> {

    private static final long serialVersionUID = -2017484798;

    /**
     * Setter for <code>public.movie.movie_id</code>.
     */
    public void setMovieId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.movie.movie_id</code>.
     */
    public Long getMovieId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.movie.title</code>.
     */
    public void setTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.movie.title</code>.
     */
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.movie.release_year</code>.
     */
    public void setReleaseYear(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.movie.release_year</code>.
     */
    public Integer getReleaseYear() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.movie.price</code>.
     */
    public void setPrice(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.movie.price</code>.
     */
    public Byte getPrice() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>public.movie.description</code>.
     */
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.movie.description</code>.
     */
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.movie.imdb_id</code>.
     */
    public void setImdbId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.movie.imdb_id</code>.
     */
    public String getImdbId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.movie.poster_url</code>.
     */
    public void setPosterUrl(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.movie.poster_url</code>.
     */
    public String getPosterUrl() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, Integer, Byte, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, Integer, Byte, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Movie.MOVIE.MOVIE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Movie.MOVIE.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Movie.MOVIE.RELEASE_YEAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return Movie.MOVIE.PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Movie.MOVIE.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Movie.MOVIE.IMDB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Movie.MOVIE.POSTER_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getMovieId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getReleaseYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getImdbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPosterUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MovieRecord value1(Long value) {
        setMovieId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MovieRecord value2(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MovieRecord value3(Integer value) {
        setReleaseYear(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MovieRecord value4(Byte value) {
        setPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MovieRecord value5(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MovieRecord value6(String value) {
        setImdbId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MovieRecord value7(String value) {
        setPosterUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MovieRecord values(Long value1, String value2, Integer value3, Byte value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MovieRecord
     */
    public MovieRecord() {
        super(Movie.MOVIE);
    }

    /**
     * Create a detached, initialised MovieRecord
     */
    public MovieRecord(Long movieId, String title, Integer releaseYear, Byte price, String description, String imdbId, String posterUrl) {
        super(Movie.MOVIE);

        set(0, movieId);
        set(1, title);
        set(2, releaseYear);
        set(3, price);
        set(4, description);
        set(5, imdbId);
        set(6, posterUrl);
    }
}
