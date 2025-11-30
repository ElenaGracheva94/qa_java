package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnimalTest {

    private final Animal animal = new Animal();

    @Test
    public void getFamilyReturnsCorrectText() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, animal.getFamily());
    }

    @Test
    public void getFoodReturnsHerbivoreListForHerbivoreKind() throws Exception {
        // Тестируем ветку "Травоядное"
        List<String> expectedFood = List.of("Трава", "Различные растения");
        List<String> actualFood = animal.getFood("Травоядное");
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getFoodReturnsPredatorListForPredatorKind() throws Exception {
        // Тестируем ветку "Хищник" (которая ранее покрывалась косвенно через Feline)
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = animal.getFood("Хищник");
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getFoodThrowsExceptionForUnknownKind() {
        // Тестируем ветку с исключением
        String unknownKind = "Всеядное";
        boolean exceptionThrown = false;
        String expectedMessage = "Неизвестный вид животного, используйте значение Травоядное или Хищник";

        try {
            animal.getFood(unknownKind);
        } catch (Exception exception) {
            exceptionThrown = true;
            assertEquals(expectedMessage, exception.getMessage());
        }

        assertTrue("Ожидалось исключение для неизвестного вида животного", exceptionThrown);
    }
}