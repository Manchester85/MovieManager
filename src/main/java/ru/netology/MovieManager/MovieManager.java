package ru.netology.MovieManager;

public class MovieManager {
    //Добавить фильм в ленту (класс фильма напишите сами по аналогии с лекции).
    //Выдать последние 10 добавленных фильмов* (фильмы выдаются в обратном порядке, т.е. первым в массиве результатов будет тот, который был добавлен последним).
    private PurchaseMovie[] movies = new PurchaseMovie[0]; //создаем пустой массив
    private int moviesList = 10; // желаемый рр массива

    public MovieManager() {
    }

    public MovieManager(int moviesList) {
        this.moviesList = moviesList;
    }

    /*public PurchaseMovie[] findMovies() {
        return movies; // вернуть все фильмы
    }*/

    public void add(PurchaseMovie movie) {
        int length = movies.length + 1;
        PurchaseMovie[] tmp = new PurchaseMovie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public PurchaseMovie[] getAll() {
        int resultLength;
        if (movies.length > moviesList) {
            resultLength = moviesList;
        } else {
            resultLength = movies.length;
        }
        PurchaseMovie[] result = new PurchaseMovie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}

    /*???resultLength;
        if ???{
            resultLength = ???
        } else{
            resultLength = ???
        }
  ???result = new ???[resultLength];
        for (???){
            // заполняем result из массива что лежит в поле
            // в обратном порядке*/
