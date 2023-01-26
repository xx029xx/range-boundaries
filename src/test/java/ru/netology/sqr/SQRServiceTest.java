package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void testWhenSeveralSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenSeveralSquaresFound2() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 400);
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenSeveralSquaresFound3() {
        SQRService service = new SQRService();

        int actual = service.calc(100, 200);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenSeveralSquaresFound4() {
        SQRService service = new SQRService();

        int actual = service.calc(800, 900);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenNoSeveralSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenNoSeveralSquaresFound2() {
        SQRService service = new SQRService();

        int actual = service.calc(400, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}