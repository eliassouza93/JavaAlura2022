import java.io.NotActiveException;

public class Principal {
    public static void main(String[] args) {

        Conta novaConta = new Conta(888,9955);
        novaConta.nome = "Joao";
        novaConta.idade = 28;
        novaConta.setAgencia(88999);
      

        System.out.println(novaConta.nome);

    }

}
