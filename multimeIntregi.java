package dataTable;

public class multimeIntregi {
    private int[] multime;

    public multimeIntregi() {
        multime = new int[10];
    }

    public multimeIntregi(int[] valoare) {
        multime = valoare;
    }

    public multimeIntregi(int valoare) {
        this();
        for (int i = 0; i < multime.length; i++) {
            multime[i] = (int) (Math.random() * 2);
        }
    }

    public multimeIntregi reuneste(multimeIntregi numar) {
        int[] r = new int[10];
        for (int i = 0; i < 10; i++) {
            if (numar.multime[i] == 1 || multime[i] == 1) {
                r[i] = 1;
            }
        }

        new multimeIntregi(r);
        return numar;
    }

    public multimeIntregi intersectia(multimeIntregi numar) {
        int[] r = new int[10];
        for (int i = 0; i < 10; i++) {
            if (numar.multime[i] == 1 && multime[i] == 1) {
                r[i] = 1;
            }
        }

        return new multimeIntregi(r);
    }

    public void insereazaElement(int n) {
        if (n > 0 && n <= 9) {
            if (multime[n] == 0) {
                multime[n] = 1;
            }
            System.out.println("Elementul " + n + "a fost adaugat la multime!");
        } else {
            System.out.println("Numarul trebuie sa fie intre 0 si 9!");
        }
    }

    public void stergeElement(int n) {
        if (n >= 0 && n <= 9) {
            if (multime[n] == 1) {
                multime[n] = 0;
            }
            System.out.println("Elementul a fost sters!");
        } else {
            System.out.println("Numarul trebuie sa fie intre 0 si 9!");
        }

    }

    public void afiseaza() {
        boolean f = false;
        for (int i = 0; i < multime.length; i++) {
            if (multime[i] != 0) {
                System.out.print(i + " ");
                f = true;
            }
        }

        if (f == false) {
            System.out.print("---");
        }
    }

    public static void main(String[] args) {
        multimeIntregi m1 = new multimeIntregi(1);

        m1.afiseaza();

        multimeIntregi m2 = new multimeIntregi(1);

        m2.afiseaza();

        var m3 = m1.reuneste(m2);

        m3.afiseaza();

        m3 = m1.intersectia(m2);

        m3.afiseaza();

        m1.insereazaElement(4);
        m1.insereazaElement(10);
        m1.afiseaza();

        m1.stergeElement(4);

        m1.afiseaza();
    }

}
