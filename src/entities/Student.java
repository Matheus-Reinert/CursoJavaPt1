package entities;

public class Student {

        public String name;
        public double nota1, nota2, nota3;


        public double average () {
            double media = ((nota1 * 30) + (nota2 * 35) + (nota3 * 35));
            double result = media / 33.50;
            return result;
        }

        public String checkAverage () {

            double total = average();
            String saida;

            if (total > 60) {
               saida = "\nPASS ";
            } else {
                double absence = 60.00 - total;
                saida = "\nFAILED \nMISSING " + absence + " POINTS";
            }
            return saida;
        }



        public String toString () {
            return "FINAL GRADE= "
                    + average()
                    + checkAverage();
            }
}
