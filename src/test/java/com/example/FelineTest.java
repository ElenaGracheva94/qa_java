package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void eatMeatReturnsPredatorFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, feline.eatMeat());
    }

    @Test
    public void getFamilyReturnsFeline() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensReturnsOne() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithCountReturnsCount() {
        int kittensCount = 5;
        assertEquals(kittensCount, feline.getKittens(kittensCount));
    }
}