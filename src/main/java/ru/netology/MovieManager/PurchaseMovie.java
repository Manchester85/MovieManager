package ru.netology.MovieManager;

public class PurchaseMovie {
    private int id; // номер в корзине
    private int movieId; // id фильма
    private String movieName; // название фильма
    private int productPrice; // цена
    private int quantity; // количество


    public PurchaseMovie(int id, int movieId, String movieName, int productPrice, int quantity) {
        this.id = id;
        this.movieId = movieId;
        this.movieName = movieName;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }
}


