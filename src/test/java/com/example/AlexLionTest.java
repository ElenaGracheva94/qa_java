package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensReturnsZero() throws Exception {
        AlexLion alex = new AlexLion(feline);
        assertEquals(0, alex.getKittens());
    }

    @Test
    public void getFriendsReturnsList() throws Exception {
        AlexLion alex = new AlexLion(feline);
        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        List<String> actualFriends = alex.getFriends();
        assertEquals("Список друзей должен соответствовать ожидаемому",
                expectedFriends,
                actualFriends);
    }

    @Test
    public void getPlaceOfLivingReturnsZoo() throws Exception {
        AlexLion alex = new AlexLion(feline);
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }
}