package tabuleiro;

public class Posicao {
    private enum StatusPosicao {
        AGUA("   "),
        NAVIO(" N "),
        TIRO_CERTEIRO(" * "),
        TIRO_AGUA(" - "),
        TIRO_CERTEIRO_COM_NAVIO(" X "),
        TIRO_AGUA_COM_NAVIO(" n ");

        final String simboloPosicao;

        StatusPosicao(String simboloPosicao) {
            this.simboloPosicao = simboloPosicao;
        }

        public String getSimboloPosicao() {
            return simboloPosicao;
        }
    }

    private boolean isAgua, isNavio, isTiroCerteiro, isTiroAgua, isTiroCerteiroComNavio, isTiroAguaComNavio;
    private final int x, y;

    public Posicao(int x, int y) {
        this.x = x;
        this.y = y;
        this.isAgua = false;
        this.isNavio = false;
        this.isTiroCerteiro = false;
        this.isTiroAgua = false;
        this.isTiroCerteiroComNavio = false;
        this.isTiroAguaComNavio = false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void setAgua() {
        this.isAgua = true;
    }

    public void setNavio() {
        this.isNavio = true;
    }

    public void setTiroCerteiro() {
        this.isTiroCerteiro = true;
    }

    public void setTiroAgua() {
        this.isTiroAgua = true;
    }

    public void setTiroCerteiroComNavio() {
        this.isTiroCerteiroComNavio = true;
    }

    public void setTiroAguaComNavio() {
        this.isTiroAguaComNavio = true;
    }

    public boolean isAgua() {
        return isAgua;
    }

    public boolean isNavio() {
        return isNavio;
    }

    public boolean isTiroCerteiro() {
        return isTiroCerteiro;
    }

    public boolean isTiroAgua() {
        return isTiroAgua;
    }

    public boolean isTiroCerteiroComNavio() {
        return isTiroCerteiroComNavio;
    }

    public boolean isTiroAguaComNavio() {
        return isTiroAguaComNavio;
    }

    @Override
    public String toString() {
        if (isAgua() && isTiroAgua()) return StatusPosicao.TIRO_AGUA.getSimboloPosicao();
        else if (isAgua() && isTiroCerteiro()) return StatusPosicao.TIRO_CERTEIRO.getSimboloPosicao();
        else if (isAgua()) return StatusPosicao.AGUA.getSimboloPosicao();
        else if (isNavio() && isTiroCerteiroComNavio()) return StatusPosicao.TIRO_CERTEIRO_COM_NAVIO.getSimboloPosicao();
        else if (isNavio() && isTiroAguaComNavio()) return StatusPosicao.TIRO_AGUA_COM_NAVIO.getSimboloPosicao();
        else if (isNavio()) return StatusPosicao.NAVIO.getSimboloPosicao();
        else return StatusPosicao.AGUA.getSimboloPosicao();
    }
}
