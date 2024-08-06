public class OperadoresRelacionais {
    public static void main(String[] args) {

        String nomeUm = "Gleison";
        String nomeDois = new String("Gleison");

        int numeroInteiro = 5;
        double numeroReal = 5.5;

        boolean igual = numeroInteiro == numeroReal;
        System.out.println(igual);

        boolean diferente = numeroInteiro != numeroReal;
        System.out.println(diferente);

        boolean maior = numeroInteiro > numeroReal;
        System.out.println(maior);

        boolean menor = numeroInteiro < numeroReal;
        System.out.println(menor);

        boolean maiorQue = numeroInteiro >= numeroReal;
        System.out.println(maiorQue);

        boolean menorQue = numeroInteiro <= numeroReal;
        System.out.println(menorQue);

        // Comparar conteudos de dois objetos
        boolean palavrasString = nomeUm == nomeDois;
        System.out.println(palavrasString);

        boolean palavrasStringEquals = nomeUm.equals(nomeDois);
        System.out.println(palavrasStringEquals);
    }
}
