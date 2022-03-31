package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        CurrencyType typeCurrent = CurrencyType.getTypeOfCurrency(this);
        return currencyType.getRate() / typeCurrent.getRate();
    }
}