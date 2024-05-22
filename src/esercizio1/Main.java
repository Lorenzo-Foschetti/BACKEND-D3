package esercizio1;


public class Main {
    public static void main(String[] args) {
        System.out.println("Ciao!");
        Rettangolo primoRettangolo = new Rettangolo(10, 5);
        Rettangolo secondoRettangolo = new Rettangolo(8, 6);
        System.out.println(primoRettangolo);
        Rettangolo.singoloRettangolo(primoRettangolo);
        Rettangolo.dueRettangoli(primoRettangolo, secondoRettangolo);

    }
}