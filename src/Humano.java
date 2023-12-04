public class Humano extends Personagem {

  public Humano(int vida, int mana, int atkBase, int defBase){
    super(vida, mana, atkBase, defBase);
  }

  public void setWeapon(String name, int Dmg){
    int newAtk = getAtkBase() + Dmg;
    setAtkBase(newAtk);
  }

  public void attack(){
    System.out.println("O humano atacou e causou:"+ getAtkBase());
  }
}
