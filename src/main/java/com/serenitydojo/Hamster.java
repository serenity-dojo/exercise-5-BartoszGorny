package com.serenitydojo;

public class Hamster extends Pet {

    private String favouriteGame;

    public String getFavouriteGame() {
        return favouriteGame;
    }

    public void setFavouriteGame(String favouriteGame) {
        this.favouriteGame = favouriteGame;
    }

    public Hamster(String name, int age, String favouriteGame) {
        super(name, age);
        this.favouriteGame = favouriteGame;
    }
    public String play(){
        return "runs in wheel";
    }
}
