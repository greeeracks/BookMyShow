package com.saidul.BookMyShow.repository;

import com.saidul.BookMyShow.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
    public City findCityByName(String city);
}
