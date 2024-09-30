package org.example;

public class PostersManager {
    private Posters[] movies = new Posters[0];
    private int last;

    public PostersManager() {
        this.last = 5;
    }

    public PostersManager(int last) {
        this.last = last;
    }

    public void save(Posters movie) {
        Posters[] tmp = new Posters[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;

    }

    public Posters[] getMovies() {
        return movies;
    }

    public Posters[] findAll() {
        Posters[] movies = getMovies();

        return movies;

    }

    public Posters[] findLast() {
        int resultLength;
        if (movies.length >= last) {
            resultLength = last;
        } else {
            resultLength = movies.length;
        }


        Posters[] result = new Posters[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;

    }
}
