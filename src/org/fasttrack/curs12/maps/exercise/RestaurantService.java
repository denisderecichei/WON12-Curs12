package org.fasttrack.curs12.maps.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantService {

    public static List<Restaurant> getAllRestaurantInACity(List<Restaurant> allRestaurants, String city) {
        List<Restaurant> restaurantsByCity = new ArrayList<>();

        for (Restaurant currentRestaurant : allRestaurants) {
            if (currentRestaurant.getCity().equals(city)) {
                restaurantsByCity.add(currentRestaurant);
            }
        }
        return restaurantsByCity;
    }

    public static List<Restaurant> getAllRestaurantsByType(List<Restaurant> allRestaurant, RestaurantType type) {
        List<Restaurant> restaurantsByType = new ArrayList<>();

        for (Restaurant currRest : allRestaurant) {
            if (currRest.getType().equals(type)) {
                restaurantsByType.add(currRest);
            }
        }
        return restaurantsByType;
    }

    public static Map<String, List<String>> mapRestaurantNamesByCity(List<Restaurant> allRestaurants) {
        Map<String, List<String>> groupedRestaurantsByCity = new HashMap<>();

        for(Restaurant currentRestaurant: allRestaurants) {
            String myCity = currentRestaurant.getCity();
            String restaurantName = currentRestaurant.getName();

            if (!groupedRestaurantsByCity.containsKey(myCity)) {
                List<String> listOfCities = new ArrayList<>();
                listOfCities.add(restaurantName);
                groupedRestaurantsByCity.put(myCity, listOfCities);
            } else {
                List<String> existingRestaurants = groupedRestaurantsByCity.get(myCity);
                existingRestaurants.add(restaurantName);
                groupedRestaurantsByCity.put(myCity, existingRestaurants);
            }
        }

        return groupedRestaurantsByCity;
    }

    public static Map<RestaurantType, List<Restaurant>> mapRestaurantsByType(List<Restaurant> allRestaurants) {
        Map<RestaurantType, List<Restaurant>> restaurantsByType = new HashMap<>();

        for(Restaurant currentRestaurant: allRestaurants) {
            RestaurantType type = currentRestaurant.getType();

            if (!restaurantsByType.containsKey(type)) {
                List<Restaurant> listOfRestauranta = new ArrayList<>();
                listOfRestauranta.add(currentRestaurant);
                restaurantsByType.put(type, listOfRestauranta);
            } else {
                List<Restaurant> existingRestaurants = restaurantsByType.get(type);
                existingRestaurants.add(currentRestaurant);
                restaurantsByType.put(type, existingRestaurants);
            }
        }
        return restaurantsByType;
    }

    public static Restaurant getBestRestaurantInCityByType(
            List<Restaurant> allRestaurants, String city, RestaurantType type) {
        Map<RestaurantType, List<Restaurant>> allRestaurantsByType = mapRestaurantsByType(allRestaurants);
        List<Restaurant> restaurantsOfMyType = allRestaurantsByType.get(type);

        int maxRating = 0;
        Restaurant restaurant = null;

        for (Restaurant currentResutrant:restaurantsOfMyType) {
            if (currentResutrant.getCity().equals(city) && currentResutrant.getRating() > maxRating) {
                maxRating = currentResutrant.getRating();
                restaurant = currentResutrant;
            }
        }

        return restaurant;
    }
}
