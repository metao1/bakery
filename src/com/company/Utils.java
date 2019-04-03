package com.company;

import com.company.models.Pack;

import java.math.BigDecimal;
import java.util.List;

public class Utils {

    private int minSolution = Integer.MAX_VALUE;
    private String totalSolution;
    private int counter;

    public float calculatePrice(int number, List<Pack> packs) {
        float cost = 0f;
        packs.sort((o1, o2) -> o1.getQuantity() < o2.getQuantity() ? 1 : -1);
        int[] quantities = packs.stream().mapToInt(Pack::getQuantity).toArray();
        String result = "";
        printActualSolution(result, number, quantities);

        String[] solutionsString = totalSolution.split(" ");
        int[] solutions = new int[solutionsString.length];
        for (String solution : solutionsString) {
            int value = Integer.parseInt(solution);
            solutions[counter++] = value;
        }
        for (int solution : solutions) {
            for (Pack pack : packs) {
                if (pack.getQuantity() == solution) {
                    cost += pack.getPrice();
                    cost = round(cost);
                    break;
                }
            }
        }
        return cost;
    }

    private float round(float d) {
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }

    private void printActualSolution(String result, int total, int coins[]) {
        // System.out.println(result + " == " + total);
        if (total == 0) {
            //System.out.println(result + " ");
            if (result.length() < minSolution) {
                totalSolution = result;
                //System.out.println(totalSolution);
                minSolution = result.length();
            }
            return;
        }
        if (total < 0) {
            return;
        }

        for (int coin : coins) {
            if (coin <= total) {
                printActualSolution(coin + " " + result, total - coin, coins);
            }
        }
    }

}
