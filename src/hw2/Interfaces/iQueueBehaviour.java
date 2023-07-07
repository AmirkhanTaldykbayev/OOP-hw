package hw2.Interfaces;

import hw2.Classes.Actor;

public interface iQueueBehaviour {
    void takeInQueue(iActorBehaviuor actor);
    void releaseFromQueue();
    void takeOrder();
    void giveOrder();
}
