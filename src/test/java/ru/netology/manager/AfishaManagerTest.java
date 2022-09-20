package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {

    @Test
    public void addMovies() {
        AfishaManager afisha = new AfishaManager();
        afisha.add("Film 1");
        afisha.add("Film 2");
        afisha.add("Film 3");
        afisha.add("Film 4");
        afisha.add("Film 5");

        String[] expected = { "Film 1", "Film 2", "Film 3", "Film 4","Film 5" };
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastMovies() {
        AfishaManager afisha = new AfishaManager(3);
        afisha.add("Film 1");
        afisha.add("Film 2");
        afisha.add("Film 3");
        afisha.add("Film 4");
        afisha.add("Film 5");

        String[] expected = { "Film 5", "Film 4", "Film 3" };
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
