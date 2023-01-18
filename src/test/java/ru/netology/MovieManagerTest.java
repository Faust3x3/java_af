package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void addMovies() {
        MovieManager manager = new MovieManager();

        manager.add("1");
        manager.add("2");
        manager.add("3");
        String[] expected = {"1", "2", "3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        MovieManager manager = new MovieManager();

        manager.add("1");
        manager.add("2");
        manager.add("3");
        String[] expected = {"3", "2", "1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithNumber() {
        MovieManager manager = new MovieManager();

        manager.add("1");
        manager.add("2");
        manager.add("3");
        manager.add("4");
        manager.add("5");
        String[] expected = {"5", "4", "3", "2"};
        String[] actual = manager.findLast(4);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithLimit() {
        MovieManager manager = new MovieManager();

        manager.add("1");
        manager.add("2");
        manager.add("3");
        manager.add("4");
        manager.add("5");
        manager.add("6");
        manager.add("7");
        manager.add("8");
        manager.add("9");
        manager.add("10");
        manager.add("11");
        String[] expected = {"11", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
