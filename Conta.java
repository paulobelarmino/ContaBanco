/**
 * A classe recebe os parâmetros:
 * <li>int numeroConta (número da conta do usuário).</li>
 * <li>String agencia (número da agência do usuário).</li>
 * <li>String nomeCliente (nome do cliente da conta).</li>
 * <br>
 *
 * E retorna:
 * <li>O número da conta.</li>
 * <li>A agências do cliente.</li>
 * <li>O nome do cliente.</li>
 * <li>O saldo atualizado do cliente.</li>
 */

public class Conta {

   int numeroConta;
   String agencia;
   String nomeCliente;
   Double saldo = 12025.25;

    /**
     * Este método retorna um número de conta.
     * @return numeroConta.
    */
    public int getNumeroConta() {
        return numeroConta;
    }

    /**
     * Este método recebe um número de conta.
     * @param  numeroConta
   */
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    /**
     * Este método retorna um número da agência.
     * @return agencia.
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Este método recebe um número de agência.
     * @param  agencia
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * Este método retorna o nome do cliente.
     * @return nomeCliente.
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * Este método recebe o nome do cliente.
     * @param  nomeCliente
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * Este método retorna o sdldo atual da conta.
     * @return saldo.
     */
    public Double getSaldo() {
        return saldo;
    }

}
