package org.fasttrack.curs12.maps.exercise;

public class Restaurant {
    private String name;
    private String city;
    private RestaurantType type;
    private int rating;

    public Restaurant(String name, String city, RestaurantType type, int rating) {
        this.name = name;
        this.city = city;
        this.type = type;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public RestaurantType getType() {
        return type;
    }

    public int getRating() {
        return rating;
    }

    public String toString() {
        return name + "|" + city + "|" + type + "|" + rating;
    }
}
