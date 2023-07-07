package hw2.Classes;

import hw2.App;

import java.util.*;

public class PromotionalClient extends Actor {

    private String promoName; // Название акции
    public static int idPromo;  // id посетителся магазина
    public static int maxClients = 4; // Максимальное количество участников акции
    public static int participantsCount = 0; // Счетчик посетителей, участвующих в акции

    /**
     *Конструктор
     * @param name Имя посетителя
     */
    public PromotionalClient(String name) {
        super(name);
    }

    /**
     * Конструктор, определяющий имя посетителя, его id и название акции
     * @param name Имя посетителя
     * @param promoName Название акции
     * @param idPromo id посетителя*/
    public PromotionalClient(String name, String promoName, int idPromo) {
        super(name);
        this.promoName = promoName;
        this.idPromo = idPromo;
    }

    /**
     * Конструктор, определяющий имя посетителя, его id и название акции
     * @param name Имя посетителя
     * @param promoName Название акции
     */
    public PromotionalClient(String name, String promoName) {
        super(name);
        this.promoName = promoName;
        this.idPromo = idPromo;
    }

    /**
     * Метод, возвращающий имя посетителся магазина*/
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Метод, проверящий был ли сделан заказ
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Метод, проверящий делается ли заказ
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Метод, позволяющий забрать заказ если он готов
     * @param makeOrder проверка на готовность продукции
     */
    @Override
    public void setTakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }
    /**
     * Метод, обрабатывающий заказ
     * @param takeOrder проверка на то, был ли сделан заказ
     */
    @Override
    public void setMakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }
    /**Метод обращения к посетителю
     */
    @Override
    public Actor getActor() {
        return this;
    }
}
