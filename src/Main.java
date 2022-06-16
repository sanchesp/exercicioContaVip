import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        ContaVip novaConta = new ContaVip(123456l, 150);

        System.out.println("Saldo disponivel na conta é R$"+ novaConta.getSaldo());

        novaConta.liberarChequeEspecial(BigDecimal.valueOf(1000));

        System.out.println("Saldo disponivel na conta é R$"+ novaConta.getSaldo());
        System.out.println("E há disponivel R$"+novaConta.getChequeEspecial()+" cheque especial");
    }
}
