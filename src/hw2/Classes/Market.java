package hw2.Classes;

import java.util.List;
import java.util.ArrayList;

import hw2.Interfaces.iActorBehaviuor;

import hw2.Interfaces.iMarketBehaviour;
import hw2.Interfaces.iQueueBehaviour;

public class Market implements iMarketBehaviour, iQueueBehaviour {

    private List<iActorBehaviuor> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehaviuor>();

    }

    int participants = PromotionalClient.participantsCount; // Счетчик кол-ва посетителей по акции
    int maxCl = PromotionalClient.maxClients;// Максимальное количетво участников акции, согласно установленному
                                             // регламенту в PromotionalClient

    /**
     * Метод, добавляющий посетителей в магазин
     * @param actor посетитель магазина*/
    @Override
    public void acceptToMarket(iActorBehaviuor actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    /**
     * Метод, обрабатывающий действия с участниками акции
     * Если число участников достигнет лимита, посетитель убирается из очереди как акционный участник
     * @param actor посетитель магазина, участник акции
     */
    public void acceptToPromo(iActorBehaviuor actor) {
        if (actor instanceof PromotionalClient) {
            if (participants < maxCl) {
                System.out.println(actor.getActor().getName() + " участник акции пришел в магазин ");
                takeInQueue(actor);
                participants++;
            } else {
                System.out.println(actor.getActor().getName() + " не успел на акцию и стал обычным посетителем");
                takeInQueue(actor);
            }
        }
    }

    @Override
    public void takeInQueue(iActorBehaviuor actor) {
        if (actor instanceof PromotionalClient) {

        }
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for (iActorBehaviuor actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }

    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviuor actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }

        }
        releaseFromMarket(releaseActors);
    }


    @Override
    public void takeOrder() {
        for (iActorBehaviuor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

            }
        }

    }


}
