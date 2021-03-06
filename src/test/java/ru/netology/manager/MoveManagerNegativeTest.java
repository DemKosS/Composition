package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveManagerNegativeTest {
    private final FilmItem first = new FilmItem(
            1, 300, "first");
    private final FilmItem second = new FilmItem(
            2, 250, "second");
    private final FilmItem third = new FilmItem(
            3, 550, "third");
    MoveManager manager10 = new MoveManager();
    MoveManager manager = new MoveManager(5);

    @Test
    public void shouldGetAllFromManager() {
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        FilmItem[] actual = manager.getItems();
        FilmItem[] expected = {
                third,
                second,
                first
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAllFromManager10() {
        manager10.addFilm(first);
        manager10.addFilm(second);
        manager10.addFilm(third);
        FilmItem[] actual = manager10.getItems();
        FilmItem[] expected = {
                third,
                second,
                first
        };
        assertArrayEquals(expected, actual);
    }

}

