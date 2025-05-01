package com.example.restaurant_service;

import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;

@Service
public class RestaurantService {

    private final RestaurantRepository repository;

    public RestaurantService(RestaurantRepository repository) {
        this.repository = repository;
    }

    public List<Restaurant> getAllRestaurants() {
        return repository.findAll();
    }

    public Restaurant addRestaurant(Restaurant restaurant) {
        return repository.save(restaurant);
    }
    public Optional<Restaurant> getRestaurantById(Long id) {
        return repository.findById(id);
    }
    
    public Restaurant updateRestaurant(Long id, Restaurant updatedRestaurant) {
        return repository.findById(id)
                .map(existingRestaurant -> {
                    existingRestaurant.setName(updatedRestaurant.getName());
                    existingRestaurant.setAddress(updatedRestaurant.getAddress());
                    existingRestaurant.setCity(updatedRestaurant.getCity());
                    existingRestaurant.setZipcode(updatedRestaurant.getZipcode());
                    existingRestaurant.setPhone(updatedRestaurant.getPhone());
                    existingRestaurant.setEmail(updatedRestaurant.getEmail());
                    existingRestaurant.setOpeningHours(updatedRestaurant.getOpeningHours());
                    existingRestaurant.setCuisineType(updatedRestaurant.getCuisineType());
                    existingRestaurant.setRating(updatedRestaurant.getRating());
                    existingRestaurant.setAvgCost(updatedRestaurant.getAvgCost());
                    existingRestaurant.setIsOpen(updatedRestaurant.isIsOpen());
                    return repository.save(existingRestaurant);
                })
                .orElse(null);
    }
    public void deleteRestaurant(Long id) {
        repository.deleteById(id);
    }

    
}
