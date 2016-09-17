/**
 * Билет
 */
class Ticket {
    // Цена
    int price;
    // Количество
    int amount;

    // Сумма всего
    int sum() {
        return price * amount;
    }
}
