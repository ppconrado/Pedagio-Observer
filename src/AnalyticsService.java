public class AnalyticsService implements Observer {

    @Override
    public void atualizar(Passagem passagem) {
        System.out.println("[ANALYTICS] Evento registrado para BI: "
                + passagem.getCodigoPraca());
    }
}
