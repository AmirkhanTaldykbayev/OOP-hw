package hw2.Interfaces;

import java.util.List;

import hw2.Classes.Actor;

public interface iMarketBehaviour {
    void acceptToMarket(iActorBehaviuor actor);
    void releaseFromMarket(List<Actor> actor);
    void update();
}
