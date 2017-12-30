public class ShapeCalculator {

    double squareArea(Square square) {
        double bok = square.getBok_kwadratu();
        return bok * bok;
    }

    double circleArea(Circle cirle) {
        double promien = cirle.getPromien_kola();
        return cirle.PI * promien * promien;
    }

    double trianglePerimeter(Triangle triangle) {
        double bok_a = triangle.getBok1();
        double bok_b = triangle.getBok2();
        double bok_c = triangle.getBok3();
        return bok_a + bok_b + bok_c;
    }

    double rectPerimeter(Rectangle rectangle) {
        double bok_p1 = rectangle.getBok1_prostokata();
        double bok_p2 = rectangle.getBok2_prostokata();
        return 2 * bok_p1 + 2 * bok_p2;
    }
}
