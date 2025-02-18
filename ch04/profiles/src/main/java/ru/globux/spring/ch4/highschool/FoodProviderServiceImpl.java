package ru.globux.spring.ch4.highschool;

import java.util.ArrayList;
import java.util.List;

import ru.globux.spring.ch4.Food;
import ru.globux.spring.ch4.FoodProviderService;

public class FoodProviderServiceImpl implements FoodProviderService {
    @Override
    public List<Food> provideLunchSet() {
        List<Food> lunchSet = new ArrayList<>();
        lunchSet.add(new Food("Coke"));
        lunchSet.add(new Food("Hamburger"));
        lunchSet.add(new Food("French Fries"));
        return lunchSet;
    }
}
