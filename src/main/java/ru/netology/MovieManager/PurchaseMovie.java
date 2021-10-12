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

    public PurchaseMovie(int id, int movieId, String movieName, int productPrice, int quantity) {
        this.id = id;
        this.movieId = movieId;
        this.movieName = movieName;
        this.productPrice = productPrice;
        Quantity = quantity;
    }

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
}
