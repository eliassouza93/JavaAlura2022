public class testaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337,22456);

        
        System.out.println(conta.getAgencia());
        conta.setAgencia(12121);

        Conta conta2 = new Conta(5557,2698);

        System.out.println(conta.getTotal());
    }
}
