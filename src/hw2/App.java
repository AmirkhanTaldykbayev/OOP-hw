package hw2;

import hw2.Classes.*;
import hw2.Interfaces.iActorBehaviuor;

import java.util.ArrayList;
import java.util.List;

import static hw2.Classes.PromotionalClient.idPromo;
import static hw2.Classes.PromotionalClient.participantsCount;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Market magnit = new Market();
//        iActorBehaviuor client1 = new OrdinaryClient("Boris");
//        iActorBehaviuor client2 = new SpecialClient("prezident",1001);
//        iActorBehaviuor p = new PensionerClient("Sergey Nikolay",1111);
//        iActorBehaviuor tax = new TaxService();

//        magnit.acceptToMarket(client1);
//        magnit.acceptToMarket(client2);
//        magnit.acceptToMarket(p);
//        magnit.acceptToMarket(tax);


        iActorBehaviuor promoClient = new PromotionalClient("1", "Weekend 50% off", 1);
        iActorBehaviuor promoClient2 = new PromotionalClient("2", "Weekend 50% off", 2);
        iActorBehaviuor pc3 = new PromotionalClient("3", "Weekend 50% off", 3);
        iActorBehaviuor promoClient4 = new PromotionalClient("4", "Weekend 50% off", 4);
        iActorBehaviuor promoClient5 = new PromotionalClient("5", "Weekend 50% off", 5);
        iActorBehaviuor pc6 = new PromotionalClient("6", "Weekend 50% off", 6);

        magnit.acceptToPromo(promoClient);
        magnit.acceptToPromo(promoClient2);
        magnit.acceptToPromo(pc3);
        magnit.acceptToPromo(promoClient4);
        magnit.acceptToPromo(promoClient5);
        magnit.acceptToPromo(pc6);

        magnit.update();
    }
}
