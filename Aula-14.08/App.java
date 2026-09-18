public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria c1 = new ContaBancaria(1234, 100.0);

        c1.depositar(100);
        c1.sacar(70);
        
        System.out.println(c1.getSaldo());
        System.out.println(c1);
    }
}


