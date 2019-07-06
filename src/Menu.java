public class Menu {
    public static void main(String[] args) {
        Drink drink1 = new Drink();

        drink1.name = "Sernik";
        drink1.price = 15.5;
        drink1.isAlco = true;
        //komponenty
        drink1.component1 = new Component();
        drink1.component2 = new Component();
        drink1.component3 = new Component();

        drink1.component1.componentName = "Wodka";
        drink1.component1.part = 20;
        drink1.component2.componentName = "Sok";
        drink1.component2.part = 20;
        drink1.component3.componentName = "Cytryna";
        drink1.component3.part = 20;
//wyswietlanie drink 1
        System.out.println("Drink: " + drink1.name);
        System.out.println("Cena: " + drink1.price);
        System.out.println("Czy jest alkohol: " + (drink1.isAlco?"tak":"nie"));
        System.out.println("Skład:");
        System.out.println("Składnik drinka " + drink1.name + ": ");
        System.out.println("Składnik 1: " + drink1.component1.componentName + " - " + drink1.component1.part);
        System.out.println("Składnik 2: " + drink1.component2.componentName + " - " + drink1.component2.part);
        System.out.println("Składnik 3: " + drink1.component3.componentName + " - " + drink1.component3.part);
        System.out.println("Suma: " + (drink1.component1.part + drink1.component2.part + drink1.component3.part +"\n"));
//drink 2
        Drink drink2 = drink1;

        drink2.name = "Kawa";
        drink2.price = 5.5;
        drink2.isAlco = false;

        drink2.component1.componentName = "Woda";
        drink2.component1.part = 30;
        drink2.component2.componentName = "Kawa";
        drink2.component2.part = 10;
        drink2.component3.componentName = "Cukier";
        drink2.component3.part = 15;
//wyswietlanie drink 2
        System.out.println("Drink: " + drink2.name);
        System.out.println("Cena: " + drink2.price);
        System.out.println("Czy jest alkohol: " + (drink2.isAlco?"tak":"nie"));
        System.out.println("Skład:");
        System.out.println("Składnik drinka " + drink2.name + ": ");
        System.out.println("Składnik 1: " + drink2.component1.componentName + " - " + drink2.component1.part);
        System.out.println("Składnik 2: " + drink2.component2.componentName + " - " + drink2.component2.part);
        System.out.println("Składnik 3: " + drink2.component3.componentName + " - " + drink2.component3.part);
        System.out.println("Suma: " + (drink2.component1.part + drink2.component2.part + drink2.component3.part));



    }

}
