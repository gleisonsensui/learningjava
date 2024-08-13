public class App {
    public static void main(String[] args) throws Exception {
        EscopoClass escopoClass = new EscopoClass();

        escopoClass.setSalario(12675.75);
        System.out.println(escopoClass.getSalario());
        escopoClass.setSalario(1500);
        System.out.println(escopoClass.getSalario());

    }
}
