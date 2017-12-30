public class Circle {

    private double promien_kola;
    public final double PI = Math.PI;

    public Circle(double promien_kola) {
        this.promien_kola = promien_kola;
    }

    public Circle(Circle circle) {
        this(circle.promien_kola);
    }


    public double getPromien_kola() {
        return promien_kola;
    }

    public void setPromien_kola(double promien_kola) {
        this.promien_kola = promien_kola;
    }
}
