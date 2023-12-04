public class App {
  public static void main(String[] args) throws Exception {
      Monstro monstro = new Monstro(500, 10, 10, 10, 10);
      Humano humano = new Humano(90, 10, 10, 10);
      Humano heroi = new Humano(200, 100, 100, 300);

      monstro.setWeapon("Arma do vazio", 100);
      monstro.attack(humano, monstro.getFinalAtk());
      
      humano.setWeapon("Espada Sangrenta de Calazar", 10);
      
      heroi.setWeapon("Arma do herói", 300);
      heroi.attack(monstro, heroi.getAtkBase());
  }
}
