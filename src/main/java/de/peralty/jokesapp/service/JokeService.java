package de.peralty.jokesapp.service;

/***
 * Best practice gegen ein Interface zu implementieren,
 * ,damit Änderungen im Interface angepasst werden können
 * und nicht in jeder Klasse angepasst werden müssen
 */
public interface JokeService {
    String getJoke();
}
