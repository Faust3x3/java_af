package ru.netology;

public class MovieManager {
    private String[] movies = new String[0];
    private int limit = 10;

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }
    public String[] findAll(){
        return movies;
    }

    public String[] findLast(){
        if (limit> movies.length){
            limit= movies.length;
        }
        String[] result = new String[limit];
        for (int i = 0; i<limit; i++){
            result[i] = movies[movies.length-1-i];
        }
        return result;
    }
    public String[] findLast(int number){
        limit = number;
        String[] result = new String[limit];
        for (int i = 0; i<limit; i++){
            result[i] = movies[movies.length-1-i];
        }
        return result;
    }
}
