package ru.spsuace.homework6.account;

/**
 * Потокобезопасный класс, который позволяет переводить средства со счета на счет.
 * Класс может использоваться из многих потоков одновременно.
 * 4 балла за решение.
 */
public class AccountManager {


    /**
     * Метод переводит деньги с одного счета, на другой.
     * Если на исходном счету нет нужного количества денег, то метод возвращает false.
     * Класс Account непотокобезопасный и менять его нельзя
     *
     * Подсказка: метод должен использовать synchronized блоки.
     */
    public boolean transfer(Account from, Account to, long sum) {
        return false;
    }
}
