public class Navios {
  private String nome;
  private int tamanho;
  private int[] formato;
  private int disponivel;
  private boolean ehHorizontal;


  Navios(String nome, int tamanho, int disponivel){
    this.nome = nome;
    this.tamanho = tamanho;
    this.disponivel = disponivel;
    this.ehHorizontal = true;
    this.formato = new int[tamanho];
  }


}