public class Main {
    public static void main(String[] args) {
       Market [] markets = new Market[4];
       markets[0] = new Market("Wall Street", "Xaron" = new Product("Car",2000.634, "Sport"));
       markets[1] = new Market("Warner Brosers", "Videos" = new Product("Cell",20.001, "Films" ));
       markets[2] = new Market("Extra Side", "Prime" = new Product("prime", 9.5, "energy"));
       markets[3] = new Market("Splash", "Strong " = new Product("ball", 5.5, "Sport"));
       for(Market p:markets) {
           if (p.getPrice() >50) {
               System.out.println(p);
           }
       }



            }
        }
