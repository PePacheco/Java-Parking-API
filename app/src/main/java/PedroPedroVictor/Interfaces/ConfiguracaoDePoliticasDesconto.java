package PedroPedroVictor.Interfaces;

import PedroPedroVictor.CasosDeUso.PoliticaCalculoDesconto;
import PedroPedroVictor.CasosDeUso.PoliticaCalculoDescontoFeriados;
import PedroPedroVictor.CasosDeUso.PoliticaCalculoDescontoFidelidade;
import PedroPedroVictor.CasosDeUso.PoliticaCalculoDescontoNormal;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfiguracaoDePoliticasDesconto {
    @Bean
    @ConditionalOnProperty(name = "politica.desconto", havingValue = "normal", matchIfMissing = true)
    public PoliticaCalculoDesconto opcaoCalculoDescontoNormal() {
        return new PoliticaCalculoDescontoNormal();
    }
 
    @Bean
    @ConditionalOnProperty(name = "politica.desconto", havingValue = "fidelidade")
    public PoliticaCalculoDesconto opcaoCalculoDescontoFidelidade() {
        return new PoliticaCalculoDescontoFidelidade();
    }

    @Bean
    @ConditionalOnProperty(name = "politica.desconto", havingValue = "feriado")
    public PoliticaCalculoDesconto opcaoCalculoDescontoFeriados() {
        return new PoliticaCalculoDescontoFeriados();
    }
}
