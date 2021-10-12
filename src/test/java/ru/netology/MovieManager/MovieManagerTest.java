package ru.netology.MovieManager;

import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    public void getMoviesList() {

    }


    @Test
    public void get10Movies() {
        MovieManager movies = new MovieManager();
        PurchaseMovie movie1 = new PurchaseMovie(1, 0, "Бладшот", 200, 1);
        PurchaseMovie movie2 = new PurchaseMovie(2, 1, "Вперед", 300, 1);
        PurchaseMovie movie3 = new PurchaseMovie(3, 2, "Отель Белград", 200, 1);
        PurchaseMovie movie4 = new PurchaseMovie(4, 3, "Джентльмены", 250, 1);
        PurchaseMovie movie5 = new PurchaseMovie(5, 4, "Человек-невидимка", 200, 1);
        PurchaseMovie movie6 = new PurchaseMovie(6, 5, "Тролли. Мировой тур", 250, 1);
        PurchaseMovie movie7 = new PurchaseMovie(7, 6, "Номер один", 200, 1);
        PurchaseMovie movie8 = new PurchaseMovie(8, 7, "Никто", 200, 1);
        PurchaseMovie movie9 = new PurchaseMovie(9, 8, "Повелитель бури", 300, 1);
        PurchaseMovie movie10 = new PurchaseMovie(10, 9, "По соображениям совести", 300, 1);


        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);
        movies.add(movie8);
        movies.add(movie9);
        movies.add(movie10);


        PurchaseMovie[] actual = movies.getAll();
        PurchaseMovie[] expected = new PurchaseMovie[]{movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};

        assertArrayEquals(expected, actual);


    }

@Disabled
    @Test
    public void get11Movies() {
        MovieManager movies = new MovieManager();
        PurchaseMovie movie1 = new PurchaseMovie (1, 0, "Бладшот", 200, 1);
        PurchaseMovie movie2 = new PurchaseMovie (2, 1, "Вперед", 300, 1);
        PurchaseMovie movie3 = new PurchaseMovie (3, 2, "Отель Белград", 200, 1);
        PurchaseMovie movie4 = new PurchaseMovie (4, 3, "Джентльмены", 250, 1);
        PurchaseMovie movie5 = new PurchaseMovie (5, 4, "Человек-невидимка", 200, 1);
        PurchaseMovie movie6 = new PurchaseMovie (6, 5, "Тролли. Мировой тур", 250, 1);
        PurchaseMovie movie7 = new PurchaseMovie (7, 6, "Номер один", 200, 1);
        PurchaseMovie movie8 = new PurchaseMovie (8, 7, "Никто", 200, 1);
        PurchaseMovie movie9 = new PurchaseMovie (9, 8, "Повелитель бури", 300, 1);
        PurchaseMovie movie10 = new PurchaseMovie (10, 9, "По соображениям совести", 300,1 );
        PurchaseMovie movie11 = new PurchaseMovie(11, 10, "Матрица", 300, 1);


        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);
        movies.add(movie8);
        movies.add(movie9);
        movies.add(movie10);
        movies.add(movie11);



        PurchaseMovie[] actual = movies.getAll();
        PurchaseMovie[] expected = new PurchaseMovie[]{movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};

        assertArrayEquals(expected, actual);


    }

    @Test
    public void get7Movies() {
        MovieManager movies = new MovieManager();
        PurchaseMovie movie1 = new PurchaseMovie (1, 0, "Бладшот", 200, 1);
        PurchaseMovie movie2 = new PurchaseMovie (2, 1, "Вперед", 300, 1);
        PurchaseMovie movie3 = new PurchaseMovie (3, 2, "Отель Белград", 200, 1);
        PurchaseMovie movie4 = new PurchaseMovie (4, 3, "Джентльмены", 250, 1);
        PurchaseMovie movie5 = new PurchaseMovie (5, 4, "Человек-невидимка", 200, 1);
        PurchaseMovie movie6 = new PurchaseMovie (6, 5, "Тролли. Мировой тур", 250, 1);
        PurchaseMovie movie7 = new PurchaseMovie (7, 6, "Номер один", 200, 1);


        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);


        PurchaseMovie[] actual = movies.getAll();
        PurchaseMovie[] expected = new PurchaseMovie[]{movie7, movie6, movie5, movie4, movie3, movie2, movie1};

        assertArrayEquals(expected, actual);


    }

}