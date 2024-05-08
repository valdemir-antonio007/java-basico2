import java.util.Comparator;

public class ContaTerminalByNumero implements Comparator<ContaTerminal> {

    @Override
    public int compare(ContaTerminal o1, ContaTerminal o2) {
        if(o1.getNumero() > o2.getNumero()){
            return 1;
        }else if(o1.getNumero() < o2.getNumero()){
            return -1;
        }else {
            return 0;
        }
    }
}
