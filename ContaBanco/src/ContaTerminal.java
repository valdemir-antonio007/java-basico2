import javax.swing.plaf.metal.MetalButtonUI;
import java.util.Comparator;
import java.util.Objects;

public class ContaTerminal implements Comparable<ContaTerminal> {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo = 0.00;

    public ContaTerminal() {
    }

    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaTerminal{" +
                "numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", saldo=" + saldo +
                '}'+"\n";

    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaTerminal that = (ContaTerminal) o;
        return numero == that.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }


    @Override
    public int compareTo(ContaTerminal o) {
        return this.getNomeCliente().compareTo(o.getNomeCliente());

    }
}
