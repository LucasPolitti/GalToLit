class GalToLit {

    public static void main(String[] args) {
        /* Este programa exibe uma tabela de conversões de galões em litros. */

        double gallons, liters;
        int counter;

        counter = 0;

        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // Converte para litros
            System.out.println(gallons + " gallons is " + liters + " liters.");

            counter++;

            // A cada dez linhas, exibe uma linha em branco

            if (counter == 10) {
                System.out.println("");
                counter = 0; // Zera o contador de linhas

            }

        }

    }
}