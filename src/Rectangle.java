public class Rectangle {

    private double bok1_prostokata;
    private double bok2_prostokata;

    public Rectangle(double bok1_prostokata, double bok2_prostokata) {
        this.bok1_prostokata = bok1_prostokata;
        this.bok2_prostokata = bok2_prostokata;
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.bok1_prostokata, rectangle.bok2_prostokata);
    }

    public double getBok1_prostokata() {
        return bok1_prostokata;
    }

    public void setBok1_prostokata(double bok1_prostokata) {
        this.bok1_prostokata = bok1_prostokata;
    }

    public double getBok2_prostokata() {
        return bok2_prostokata;
    }

    public void setBok2_prostokata(double bok2_prostokata) {
        this.bok2_prostokata = bok2_prostokata;
    }


}
