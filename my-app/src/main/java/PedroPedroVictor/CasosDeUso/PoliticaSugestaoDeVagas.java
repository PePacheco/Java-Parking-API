package PedroPedroVictor.CasosDeUso;

import PedroPedroVictor.Entidades.Vaga;
import java.util.ArrayList;
import PedroPedroVictor.Entidades.Cliente;

public class PoliticaSugestaoDeVagas implements PoliticaSugestao{

    @Override
    public Vaga sugereVaga(Cliente c, RepositorioVagas rep) {
        ArrayList<Vaga> vagasPreferidas = c.getVagasPreferidas();
        int media = 0;
        int count = 0;
        for(Vaga v: vagasPreferidas) {
            media = v.getPosicao();
            count++;
        }
        media = media/count;
        return rep.findByPosition(media);
    }
}