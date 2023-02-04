package staticfactorymethod;

public class Banknote {
   private String currency; //"PLN"
   private int amount; //10

   private Banknote(String currency, int amount) {
      this.currency = currency;
      this.amount = amount;
   }

   public static Banknote of(String currency, int amount){
      return new Banknote(currency, amount);

   }

}
