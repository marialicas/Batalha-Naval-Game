public class Tabuleiro {
  private int tamLargura;
  private int tamAltura;
  private int[][] tabuleiro;

  Tabuleiro() {
    this.tamLargura = 5;
    this.tamAltura = 5;
    this.tabuleiro = new int[tamLargura][tamAltura];
  }

  public int[][] getTabuleiro() {
    return tabuleiro;
  }

  public void ver() {
    for (int coluna = 0; coluna < tamLargura; coluna++) {
      for (int linha = 0; linha < tamAltura; linha++) {
        System.out.printf("%d ", tabuleiro[linha][coluna]);
      }
      System.out.println();
    }
  }

  public void inserir(int cordenadaX, int cordenadaY, int tamanho, boolean ehHorizontal) {
    if (ehHorizontal == true) {
      inserirHorizontal(cordenadaX, cordenadaY, tamanho);
    } else {
      inserirVerticalmente(cordenadaX, cordenadaY, tamanho);
    }
  }

  public void inserirHorizontal(int cordenadaX, int cordenadaY, int tamanho) {
    for (int i = 0; i < tamanho; i++) {
      tabuleiro[(cordenadaX - 1) + i][cordenadaY - 1] = 1;
    }
  }

  public void inserirVerticalmente(int cordenadaX, int cordenadaY, int tamanho) {
    for (int i = 0; i < tamanho; i++) {
      tabuleiro[cordenadaX - 1][(cordenadaY - 1) + i] = 1;
    }
  }

  public void acertou(int cordenadaX, int cordenadaY){
    if(tabuleiro[cordenadaX][cordenadaY] == 1){
      System.out.println("ACERTOUU!!");
    }
  }

  public void limpar(){
    for (int coluna = 0; coluna < tamLargura; coluna++) {
      for (int linha = 0; linha < tamAltura; linha++) {
        tabuleiro[linha][coluna] = 0;
      }
      System.out.println();
    }
  }

  public void verComIndice() {
    for (int coluna = 0; coluna < 15; coluna++) {
      System.out.printf("%d ", coluna);
      if (coluna == 0) {
        for (int linha = 0; linha < 15; linha++) {
          System.out.printf("%d ", linha + 1);
        }
      } else {
        for (int linha = 0; linha < 15; linha++) {
          System.out.printf("%d", tabuleiro[linha][coluna]);
        }
      }
      System.out.println();
    }
  }

}
