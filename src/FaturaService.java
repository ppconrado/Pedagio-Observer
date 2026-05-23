import java.util.HashMap;
import java.util.Map;

public class FaturaService implements Observer {

    private Map<String, Double> totalPorTag = new HashMap<>();

    @Override
    public void atualizar(Passagem passagem) {
        totalPorTag.merge(
            passagem.getCodigoTag(),
            passagem.getValor(),
            Double::sum
        );

        System.out.println("[FATURA] Atualizada para tag "
                + passagem.getCodigoTag());
    }

    public double getTotalPorTag(String tag) {
        return totalPorTag.getOrDefault(tag, 0.0);
    }
}
