package com.company.repository;

import com.company.models.BlueberryMuffin;
import com.company.models.Croissant;
import com.company.models.Pack;
import com.company.models.VegemiteScroll;

import java.util.Arrays;

public class CakeBuilder {

    public CakeRepository prepareCakes() {
        CakeRepository cakeRepository = new CakeRepository();
        cakeRepository.addCake(new VegemiteScroll(Arrays.asList(
                new Pack(3, 6.99f),
                new Pack(5, 8.99f))));
        cakeRepository.addCake(new BlueberryMuffin(Arrays.asList(
                new Pack(2, 9.99f),
                new Pack(5, 16.95f),
                new Pack(8, 24.95f))));
        cakeRepository.addCake(new Croissant(Arrays.asList(
                new Pack(3, 5.95f),
                new Pack(5, 9.95f),
                new Pack(9, 16.99f))));
        return cakeRepository;
    }
}
