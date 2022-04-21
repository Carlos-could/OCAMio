public class Deer {

  public Deer() {
      System.out.print("Deer"); }               // 2do imprime Deer

  public Deer(int age) {
      System.out.print("DeerAge"); }

  private boolean hasHorns() {
      return false; }                           // 4to imprime false

  public static void main(String[] args) {
      Deer deer = new Reindeer(5);          // 1ro crea instancia y  2do llama al super.ctor()
      System.out.println(","+deer.hasHorns());  // 4to, deer es de tipo Deer y no de tipo Reindeer
  }
}

class Reindeer extends Deer {
  public Reindeer(int age) {
      System.out.print("Reindeer"); }       // 3ro imprime Reindeer

  public boolean hasHorns() {
      return true; }
}