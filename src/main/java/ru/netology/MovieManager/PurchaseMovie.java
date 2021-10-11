package ru.netology.MovieManager;

public class PurchaseMovie {
    private int id; // номер в корзине
    private int movieId; // id фильма
    private String movieName; // название фильма
    private int productPrice; // цена
    private int Quantity; // количество
    private Movie1 Movie1;
    private Movie2 Movie2;
    private Movie3 Movie3;
    private Movie4 Movie4;
    private Movie5 Movie5;
    private Movie6 Movie6;
    private Movie7 Movie7;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public ru.netology.MovieManager.Movie1 getMovie1() {
        return Movie1;
    }

    public void setMovie1(ru.netology.MovieManager.Movie1 movie1) {
        Movie1 = movie1;
    }

    public ru.netology.MovieManager.Movie2 getMovie2() {
        return Movie2;
    }

    public void setMovie2(ru.netology.MovieManager.Movie2 movie2) {
        Movie2 = movie2;
    }

    public ru.netology.MovieManager.Movie3 getMovie3() {
        return Movie3;
    }

    public void setMovie3(ru.netology.MovieManager.Movie3 movie3) {
        Movie3 = movie3;
    }

    public ru.netology.MovieManager.Movie4 getMovie4() {
        return Movie4;
    }

    public void setMovie4(ru.netology.MovieManager.Movie4 movie4) {
        Movie4 = movie4;
    }

    public ru.netology.MovieManager.Movie5 getMovie5() {
        return Movie5;
    }

    public void setMovie5(ru.netology.MovieManager.Movie5 movie5) {
        Movie5 = movie5;
    }

    public ru.netology.MovieManager.Movie6 getMovie6() {
        return Movie6;
    }

    public void setMovie6(ru.netology.MovieManager.Movie6 movie6) {
        Movie6 = movie6;
    }

    public ru.netology.MovieManager.Movie7 getMovie7() {
        return Movie7;
    }

    public void setMovie7(ru.netology.MovieManager.Movie7 movie7) {
        Movie7 = movie7;
    }

    public PurchaseMovie(int id, int movieId, String movieName, int productPrice, int quantity, ru.netology.MovieManager.Movie1 movie1, ru.netology.MovieManager.Movie2 movie2, ru.netology.MovieManager.Movie3 movie3, ru.netology.MovieManager.Movie4 movie4, ru.netology.MovieManager.Movie5 movie5, ru.netology.MovieManager.Movie6 movie6, ru.netology.MovieManager.Movie7 movie7) {
        this.id = id;
        this.movieId = movieId;
        this.movieName = movieName;
        this.productPrice = productPrice;
        Quantity = quantity;
        Movie1 = movie1;
        Movie2 = movie2;
        Movie3 = movie3;
        Movie4 = movie4;
        Movie5 = movie5;
        Movie6 = movie6;
        Movie7 = movie7;


    }
}




