package memoria;

public class RendimentoJogador {

    public String vencedorJogo(int pontosJogador, int pontosComputador) {

        if (pontosJogador == pontosComputador) {
            return "Empate!!!";

        } else if (pontosJogador > pontosComputador) {
            return "Parábens, você venceu o Jogo!!!";

        } else if (pontosJogador < pontosComputador) {
            return "Você perdeu o Jogo, Tente novamente!!!";
        }
        return null;
    }
}
