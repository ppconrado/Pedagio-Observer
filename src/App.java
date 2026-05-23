// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {

        PassagemPublisher publisher = new PassagemPublisher();

        FaturaService fatura = new FaturaService();
        AnalyticsService analytics = new AnalyticsService();
        ContabilidadeService contabilidade = new ContabilidadeService();
        NotificacaoClienteService notificacao = new NotificacaoClienteService();

        publisher.adicionarObserver(fatura);
        publisher.adicionarObserver(analytics);
        publisher.adicionarObserver(contabilidade);
        publisher.adicionarObserver(notificacao);

        // Simulando passagens
        publisher.registrarPassagem(
            new Passagem("TAG123", LocalDateTime.now(),
                "ABC-1234", "PRACA01", 12.50)
        );

        publisher.registrarPassagem(
            new Passagem("TAG123", LocalDateTime.now(),
                "ABC-1234", "PRACA02", 8.00)
        );

        publisher.registrarPassagem(
            new Passagem("TAG999", LocalDateTime.now(),
                "XYZ-9999", "PRACA01", 10.00)
        );

        // Consulta da fatura
        System.out.println("\nTOTAL TAG123: R$ "
                + fatura.getTotalPorTag("TAG123"));
    }
}