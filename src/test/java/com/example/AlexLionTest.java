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
        List<String> friends = alex.getFriends();
        assertEquals(3, friends.size());
        assertTrue(friends.contains("Марти"));
        assertTrue(friends.contains("Глория"));
        assertTrue(friends.contains("Мелман"));
    }

    @Test
    public void getPlaceOfLivingReturnsZoo() throws Exception {
        AlexLion alex = new AlexLion(feline);
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }
}