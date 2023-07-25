package org.fasttrack.curs12.maps.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainClassExercise {

    public static void main(String[] args) {
        Restaurant r1 = new Restaurant("Via29", "Oradea", RestaurantType.FUSION, 5);
        Restaurant r2 = new Restaurant("Piata9", "Oradea", RestaurantType.ROMANIAN, 4);
        Restaurant r3 = new Restaurant("Ciao NY", "Cluj", RestaurantType.MEDITERANEEAN, 3);
        Restaurant r4 = new Restaurant("Athena", "Bucuresti", RestaurantType.GREEK, 5);
        Restaurant r5 = new Restaurant("Marty", "Cluj", RestaurantType.FUSION, 5);
        Restaurant r6 = new Restaurant("Marty 2", "Cluj", RestaurantType.FUSION, 2);
        Restaurant r7 = new Restaurant("Carul cu bere", "Bucuresti", RestaurantType.ROMANIAN, 5);

        List<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(r1);
        restaurants.add(r2);
        restaurants.add(r3);
        restaurants.add(r4);
        restaurants.add(r5);
        restaurants.add(r6);
        restaurants.add(r7);

        System.out.println(RestaurantService.getAllRestaurantInACity(restaurants, "Oradea"));
        System.out.println(RestaurantService.getAllRestaurantInACity(restaurants, "Bucuresti"));
        System.out.println(RestaurantService.getAllRestaurantInACity(restaurants, "Cluj"));

        System.out.println("_-------------------");
        System.out.println(RestaurantService.getAllRestaurantsByType(restaurants, RestaurantType.FUSION));
        System.out.println(RestaurantService.getAllRestaurantsByType(restaurants, RestaurantType.ROMANIAN));
        System.out.println(RestaurantService.getAllRestaurantsByType(restaurants, RestaurantType.MEDITERANEEAN));
        System.out.println(RestaurantService.getAllRestaurantsByType(restaurants, RestaurantType.GREEK));

        System.out.println("_____________________");
        Map<String, List<String>> restaurantsByCity = RestaurantService.mapRestaurantNamesByCity(restaurants);
        System.out.println(restaurantsByCity.get("Cluj"));
        System.out.println(restaurantsByCity.get("Bucuresti"));
        System.out.println(restaurantsByCity.get("Oradea"));

        System.out.println("-------------------");
        Map<RestaurantType, List<Restaurant>> restaurantsByType = RestaurantService.mapRestaurantsByType(restaurants);
        System.out.println(restaurantsByType.get(RestaurantType.FUSION));
        System.out.println(restaurantsByType.get(RestaurantType.ROMANIAN));
        System.out.println(restaurantsByType.get(RestaurantType.MEDITERANEEAN));
        System.out.println(restaurantsByType.get(RestaurantType.GREEK));

        System.out.println(RestaurantService.getBestRestaurantInCityByType(restaurants, "Cluj", RestaurantType.FUSION));
    }
}
