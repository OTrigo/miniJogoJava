public class Monstro extends Personagem {
  private int bonusAttack;

  public Monstro(int vida, int mana, int atkBase, int defBase, int bonusAttack){
    super(vida, mana, atkBase, defBase);
    this.bonusAttack = bonusAttack;
  }

  public void setWeapon(String name, int Dmg){
    int newAtk = getAtkBase() + Dmg;
    setAtkBase(newAtk);
  }

  public int getFinalAtk(){
    return getAtkBase() + bonusAttack;
  }

  public void attack(){
    System.out.println("O monstro atacou e causou:"+ getAtkBase()+ "+"+ bonusAttack + " = " + getFinalAtk());
  }
}
