public class Gru {
    public static void main (String[] args) {

        int a = 10;
        int b = 12;
        int c = a + b;

        Gru g = new Gru();
        g.processando(a, b, c);

    }

    public void processando(int a, int b, int c) {
        System.out.println("O valor de A = " + a);
        System.out.println("O valor de pi = " + b);
        System.out.println("Resultado = "+ c);
    }
}


