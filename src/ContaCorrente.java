import java.math.BigDecimal;

public class ContaCorrente {

    protected Long numeroConta;
    protected Integer agencia;
    protected BigDecimal saldo;

    public ContaCorrente(Long numeroConta, Integer agencia) {
        this.setNumeroConta(numeroConta);
        this.setAgencia(agencia);
        this.setSaldo(BigDecimal.ZERO);
    }

    public Long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal deposita(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
        return this.saldo;
    }

    public BigDecimal saque(BigDecimal valor) {
        this.saldo = this.saldo.subtract(valor);
        return this.saldo;
    }

    public BigDecimal transferencia(BigDecimal valor, ContaCorrente destino) {
        BigDecimal saldoAtualizadoDaContaOrigem = saque(valor);
        destino.deposita(valor);
        return saldoAtualizadoDaContaOrigem;
    }
}
