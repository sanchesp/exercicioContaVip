import java.math.BigDecimal;

public class ContaVip extends ContaCorrente{

    private BigDecimal chequeEspecial;

    public ContaVip(Long numeroConta, Integer agencia) {
        super(numeroConta, agencia);
        this.setChequeEspecial(BigDecimal.ZERO);
    }
    public BigDecimal getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(BigDecimal chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    public BigDecimal liberarChequeEspecial(BigDecimal valor) {
        this.chequeEspecial = this.chequeEspecial.add(valor);
      return this.chequeEspecial;
    }


}
