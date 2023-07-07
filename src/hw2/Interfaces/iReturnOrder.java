package hw2.Interfaces;

import hw2.Classes.Actor;

/**Интерфейс, отвечающий за возврат товара*/
public interface iReturnOrder {
    /**
     * Метод, проверяющий возможность возврата заказа
     *
     * @param makeReturnOrder Проверка возможности возврата заказа
     */
    void setMakeReturnOrder(boolean makeReturnOrder);

    /**
     * Метод, проверяющий возможность вернуть деньги за заказ
     *
     * @param makeRefund Проверка возможности вернуть оплату заказа
     */
    void setMakeRefund(boolean makeRefund);

    /**
     * Метод, проверяющий может ли заказ быть возвращен
     *
     * @return true, если заказ может быть возвращен
     */
    boolean isMakeReturnOrder();

    /**
     * Метод, проверяющий оплату заказа
     *
     * @return true, если заказ был оплачен
     */
    boolean isMakeRefund();

    /**Метод обращения к посетителю
     */
    Actor getActor();
}
