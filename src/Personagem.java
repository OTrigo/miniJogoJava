public class Personagem implements PersonagemInterface{
  private int vida;
  private int mana;
  private int atkBase;
  private int defBase;

  public Personagem(int vida, int mana, int atkBase, int defBase){
    this.vida = vida;
    this.mana = mana;
    this.atkBase = atkBase;
    this.defBase = defBase;
  }

  public void attack(Personagem alvo, int danoFinal){
    alvo.vida -= danoFinal;
    System.out.println("Vida do oponente:"+ alvo.vida + "Dano: " + danoFinal);
    if(alvo.vida < 0){
      System.out.println("A vida do oponente chegou a 0, portanto, ele acabou morrendo.");
    }
  }

  public int getAtkBase(){
    return atkBase;
  }

  public void setAtkBase(int atkBase){
    this.atkBase = atkBase; 
  }

}