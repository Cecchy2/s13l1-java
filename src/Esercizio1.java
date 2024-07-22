public class Esercizio1 {
    public static void main(String[] args) {


        int result = moltiplica(5, 6);
        System.out.println(result);

        String concResult = concatena("Ciao", 9);
        System.out.println(concResult);

        String[] vecchioArray = {"uno", "due", "tre", "quattro", "cinque"};
        String nuovaStringa = "Esercizio1";
        String[] nuovoArray = inserisciInArray(vecchioArray, nuovaStringa);
        System.out.println(nuovoArray);


    }

    //----------Metodo somma di 2 numeri interi
    public static int moltiplica(int num1, int num2) {
        return num1 * num2;
    }


    //----------Metodo somma di una stringa ed 1 numero
    public static String concatena(String str, int num3) {
        return str + num3;
    }

    //----------Metodo inserisci in array
    public static String[] inserisciInArray(String[] array, String stringa) {

        String[] nuovoArray = new String[6];
        nuovoArray[0] = array[0];
        nuovoArray[1] = array[1];
        nuovoArray[2] = stringa;
        nuovoArray[3] = array[2];
        nuovoArray[4] = array[3];
        nuovoArray[5] = array[4];


        return nuovoArray;
    }


}
