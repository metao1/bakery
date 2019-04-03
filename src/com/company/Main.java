package com.company;

import com.company.repository.CakeBuilder;
import com.company.repository.CakeRepository;

public class Main {


    private Main(String text) {
        CakeBuilder cakeBuilder = new CakeBuilder();
        CakeRepository cakeRepository = cakeBuilder.prepareCakes();
        System.out.println("Orders are:\n" + text);
        String[] orders = text.split("\n");
        for (String order : orders) {
            String[] items = order.split("\\s");
            System.out.print(items[0] + "x" + cakeRepository.showCakes(items[1]));
            System.out.println("price :$" + cakeRepository.getCost(items[1],
                    Integer.parseInt(items[0])));
        }
    }

    public static void main(String[] args) {
        String stringBuilder =
                "44 VS5\n" +
                        "14 MB11\n" +
                        "13 CF\n";
        new Main(stringBuilder);
    }
}
