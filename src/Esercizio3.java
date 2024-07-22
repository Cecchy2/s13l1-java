public class Esercizio3 {

    public static void main(String[] args) {
        double result = perimetroRettangolo(5.15, 9.20);
        System.out.println(result);

        int parioDispari = pariDispari(4);
        System.out.println(parioDispari);

        System.out.println(pariDispari(9));

        System.out.println(perimetroTriangolo(25.10, 30, 12.3));


    }

    //-------------Metodo per calcolare il perimetro del rettangolo
    public static double perimetroRettangolo(double lato1, double lato2) {
        return ((lato1 + lato2) * 2);
    }


    //-------------Metodo che torna 0 se numero pari 1 se numero dispari
    public static int pariDispari(int numero) {
        if (numero % 2 == 0) {
            return (0);
        } else {
            return (1);
        }
    }

    //Metodo per calcolare lárea del Triangolo (formula di Erone)
    public static double perimetroTriangolo(double triang1, double triang2, double triang3) {
        double semiPerimetro = ((triang1 + triang2 + triang3) / 2);

        return Math.sqrt(semiPerimetro * (semiPerimetro - triang1) * (semiPerimetro - triang2) * (semiPerimetro - triang3));

    }


}
