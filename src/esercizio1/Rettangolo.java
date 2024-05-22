package esercizio1;

public class Rettangolo {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public static void singoloRettangolo(Rettangolo unRettangolo) {
        System.out.println("L'area di questo rettangolo è:" + unRettangolo.areaRettangolo());
        System.out.println("Il perimetro di questo rettangolo è:" + unRettangolo.perimetroRettangolo());

    }

    public static void dueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("La somma dei due perimetri è :" + r1.perimetroRettangolo() + r2.perimetroRettangolo());

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

    @Override
    public String toString() {
        return "Rettangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }
}