package com.example;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class CircleTest {

    @Test(dataProvider = "radiusValues")
    public void testCalculateArea(double radius, double expectedArea) {
        if (radius < 0) {
            // Проверяем, что при отрицательном радиусе выбрасывается исключение
            assertThrows(IllegalArgumentException.class, () -> Circle.calculateArea(radius));
        } else {
            // Проверяем правильность расчета площади
            double actualArea = Circle.calculateArea(radius);
            assertEquals(actualArea, expectedArea, 1e-9);
        }
    }

    @org.testng.annotations.DataProvider(name = "radiusValues")
    public Object[][] createData() {
        return new Object[][] {
                { 1.0, 3.141592653589793 },
                { 2.0, 12.566370614359172 },
                { 0.0, 0.0 },
                { -2.0, Double.NaN }        // радиус -2.0, ожидаемая ошибка (не проверяется)
        };
    }
}