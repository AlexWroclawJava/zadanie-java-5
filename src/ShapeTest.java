public class ShapeTest {

    public static void main(String[] args) {

        Square square = new Square(4.5);
        Rectangle rectangle = new Rectangle(3.0,4.1);
        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(3.0,4.0,5.0);

        ShapeCalculator shapeCalculator = new ShapeCalculator();

        System.out.print("Pole kwadratu o boku: " + square.getBok_kwadratu() + " wynosi: ");
        System.out.println(shapeCalculator.squareArea(square));

        System.out.print("Pole koła o promieniu: " + circle.getPromien_kola() + " wynosi: ");
        System.out.println(shapeCalculator.circleArea(circle));

        System.out.print("Obwód trójkąta o bokach: " + triangle.getBok1() + ", " + triangle.getBok2() + ", " + triangle.getBok3() + " wynosi: ");
        System.out.println(shapeCalculator.trianglePerimeter(triangle));

        System.out.print("Obwód prostokąta o bokach: " + rectangle.getBok1_prostokata() + ", " + rectangle.getBok2_prostokata() + " wynosi: ");
        System.out.println(shapeCalculator.rectPerimeter(rectangle));

    }
}
