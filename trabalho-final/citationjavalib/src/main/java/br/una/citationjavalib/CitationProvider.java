package br.una.citationjavalib;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class CitationProvider {
    private static CitationProvider sInstance;

    private final List<Citation> mCitations = new ArrayList<>();
    private int lastIndex = -1;

    private CitationProvider() {
    }

    public static CitationProvider getInstance() {
        synchronized(CitationProvider.class) {
            if(sInstance == null) {
                sInstance = new CitationProvider();
                sInstance.addCitation("Charles Chaplin", "Estou sempre alegre. Essa é a melhor maneira de resolver os" +
                        " problemas da vida.");
                sInstance.addCitation("Charles Dickens", "Nunca devemos envergonharmo-nos das nossas próprias " +
                        "lágrimas.");
                sInstance.addCitation("Albert Einstein", "Algo só é impossível até que alguém duvide e resolva provar" +
                        " ao contrário.");
                sInstance.addCitation("Leonardo Da Vinci", "O tempo dura bastante para aqueles que sabem aproveitá-lo" +
                        ".");
                sInstance.addCitation("Erich Fromm", "O amor é um ato de fé. Quem tiver pouca fé também terá pouco " +
                        "amor.");
                sInstance.addCitation("Caio Fernando Abreu", "Dá vontade de amar. De amar de um jeito ‘certo’, que a " +
                        "gente não tem a menor ideia de qual poderia ser, se é que existe um.");
                sInstance.addCitation("Frank Clark", "Se você encontrar um caminho sem obstáculos, ele provavelmente " +
                        "não leva a lugar nenhum.");
                sInstance.addCitation("Mahatma Gandhi", "Não existe um caminho para a felicidade. A felicidade é o " +
                        "caminho.");
                sInstance.addCitation("Fernando Pessoa", "Tenho em mim todos os sonhos do mundo.");
                sInstance.addCitation("Caio Fernando Abreu", "Não compreendo como querer o outro possa tornar-se mais" +
                        " forte do que querer a si próprio.");
                sInstance.addCitation("Walt Disney", "Decidi não esperar as oportunidades e sim, buscá-las. Decidi " +
                        "ver cada dia como uma nova oportunidade de ser feliz.");
                sInstance.addCitation("Taniguchi", "A felicidade repartida com o próximo dura para sempre.");
                sInstance.addCitation("Johnny Depp", "Você nunca sabe a força que tem. Até que a sua única " +
                        "alternativa é ser forte.");
                sInstance.addCitation("Demi Lovato", "O espelho pode mentir, não mostra como você é por dentro.");
                sInstance.addCitation("Audrey Hepburn", "Pessoas, muito mais que coisas, devem ser restauradas, " +
                        "revividas, resgatadas e redimidas: jamais jogue alguém fora.");
                sInstance.addCitation("Marilyn Monroe", "Não me alimento de ‘quases’, não me contento com a metade! " +
                        "Nunca serei sua meio amiga, ou seu meio amor… É tudo ou nada.");
                sInstance.addCitation("Marilyn Monroe", "Todo mundo é uma estrela e tem o direito de brilhar.");
                sInstance.addCitation("Marilyn Monroe", "Não sei quem inventou o salto alto, mas todas as mulheres " +
                        "devem muito a esta pessoa.");
                sInstance.addCitation("Marilyn Monroe", "Debaixo da maquiagem e por trás do meu sorriso, eu sou " +
                        "apenas uma menina que deseja o mundo.");
                sInstance.addCitation("Marilyn Monroe", "Se eu tivesse cumprido todas as regras, eu nunca teria " +
                        "chegado em nenhum lugar.");
                sInstance.addCitation("Marilyn Monroe", "Mulheres comportadas raramente fazem história.");
                sInstance.addCitation("Henry Ford", "Há mais pessoas que desistem do que pessoas que fracassam.");
                sInstance.addCitation("Jean Cocteau", "Não sabendo que era impossível, ele foi lá e fez.");
                sInstance.addCitation("Alexander Graham Bell", "Não ande apenas pelo caminho traçado, pois ele conduz" +
                        " somente até onde os outros já foram.");
                sInstance.addCitation("Mário Quintana", "Quem não compreende um olhar, tampouco há de compreender uma" +
                        " longa explicação.");
                sInstance.addCitation("Voltaire", "Todas as riquezas do mundo não valem um bom amigo.");
                sInstance.addCitation("Caio Fernando Abreu", "Para continuar vivendo, preciso da parte de mim que não" +
                        " está em mim, mas guardada em você que eu não conheço.");
                sInstance.addCitation("Caio Fernando Abreu", "Quando se quer explicar o inexplicável sempre se fica " +
                        "um pouco piegas.");
            }
        }

        return sInstance;
    }

    public void addCitation(String author, String citation) {
        this.mCitations.add(new Citation(author, citation));
    }

    public Citation getCitation() {
        Citation citation = null;

        if(!mCitations.isEmpty()) {
            Random rnd = new Random();
            int index;

            do {
                index = rnd.nextInt(this.mCitations.size());
            } while (this.lastIndex == index && mCitations.size() > 1);

            citation = this.mCitations.get(index);
            this.lastIndex = index;
        }

        return citation;
    }

    public List<Citation> getAllCitations() {
        return this.mCitations;
    }
}
