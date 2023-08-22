package main.java.com.iphoneprojeto;


public class iPod {
    private SincronizarConteudoItunes sincronizarConteudoItunes;
    private PesquisarMusicas pesquisarMusicas;
    private ReproduzirMusicas reproduzirMusicas;
    private AvaliarMusicas avaliarMusicas;
    private VisualizarCapaDosAlbuns visualizarCapaDosAlbuns;
    private ReproduzirVideos reproduzirVideos;

    public iPod() {
        sincronizarConteudoItunes = new SincronizarConteudoItunes();
        pesquisarMusicas = new PesquisarMusicas();
        reproduzirMusicas = new ReproduzirMusicas();
        avaliarMusicas = new AvaliarMusicas();
        visualizarCapaDosAlbuns = new VisualizarCapaDosAlbuns();
        reproduzirVideos = new ReproduzirVideos();
    }

    public void useSincronizarConteudoItunes() {
        sincronizarConteudoItunes.sincronizar();
    }

    public void usePesquisarMusicas() {
        pesquisarMusicas.pesquisar();
    }
    
    public void useReproduzirMusicas() {
        reproduzirMusicas.reproduzir();
    }
    
    public void useAvaliarMusicas() {
        avaliarMusicas.avaliar();
    }
    
    public void useVisualizarCapaDosAlbuns() {
        visualizarCapaDosAlbuns.visualizar();
    }
    
    public void useReproduzirVideos() {
        reproduzirVideos.reproduzir();
    }

    public class SincronizarConteudoItunes {
        public void sincronizar() {
            System.out.println("Sincronizando conteudo iTunes.");
        }
    }
    
    public class PesquisarMusicas {
        public void pesquisar() {
            System.out.println("Pesquisando musicas.");
        }
    }
    
    public class ReproduzirMusicas {
        public void reproduzir() {
            System.out.println("Reproduzindo musicas.");
        }
    }
    
    public class AvaliarMusicas {
        public void avaliar() {
            System.out.println("Avaliando musicas.");
        }
    }
    
    public class VisualizarCapaDosAlbuns {
        public void visualizar() {
            System.out.println("Visualizando capas dos albuns.");
        }
    }
    
    public class ReproduzirVideos {
        public void reproduzir() {
            System.out.println("Reproduzindo videos.");
        }
    }

}
