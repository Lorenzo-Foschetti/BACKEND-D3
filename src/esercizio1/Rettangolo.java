package esercizio1;

public class Rettangolo {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public void singoloRettangolo() {
        System.out.println("L'area di questo rettangolo è:" + this.areaRettangolo());
        System.out.println("Il perimetro di questo rettangolo è:" + this.perimetroRettangolo());

    }


    public double perimetroRettangolo() {

        return (base + altezza) * 2;

    }

    public double areaRettangolo() {
        return base * altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}