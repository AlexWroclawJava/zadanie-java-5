public class Square {

    private double bok_kwadratu;

    public Square(double bok_kwadratu) {
        this.bok_kwadratu = bok_kwadratu;
    }

    public Square(Square square) {
        this(square.bok_kwadratu);
    }


    public double getBok_kwadratu() {
        return bok_kwadratu;
    }

    public void setBok_kwadratu(double bok_kwadratu) {
        this.bok_kwadratu = bok_kwadratu;
    }
}
