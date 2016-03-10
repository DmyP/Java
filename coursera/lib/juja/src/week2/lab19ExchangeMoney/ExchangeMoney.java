package week2.lab19ExchangeMoney;
/*
Номинал мелких монет - 1,2,5,10,25,50.
1 копейку можно разменять 1 разным способом - {1}
2 - двумя разными способами {1 + 1; 2}
5 - 4 {1 + 1 + 1 + 1 + 1; 1 + 1 + 1 + 2; 1 + 2 + 2; 5}
........
Сколькими разными способами можно разменятьгривну (100 монет) ?

Реализовать алгоритм подсчета колличества разных разменов для входящего параметра.
 */
public class ExchangeMoney {

//    final static int[] coins = {1,2,5,10,25,50};

    public static void main(String[] args) {
        System.out.println(exchangeAmountOfCoinsBrutForce(100));
    }

    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        return exchangeAmountOfCoinsBrutForce(amountForExchange, 5);
    }
    private static int exchangeAmountOfCoinsBrutForce(int amountForExchange, int ind) {
        int[] coins = {1,2,5,10,25,50};
        if (amountForExchange < 0 || ind < 0) return 0;
        if (amountForExchange == 0 || ind == 0) return 1;
        return exchangeAmountOfCoinsBrutForce(amountForExchange, ind - 1) +
                exchangeAmountOfCoinsBrutForce(amountForExchange - coins[ind], ind);
    }
}

