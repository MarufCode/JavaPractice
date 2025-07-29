package src.exceptions.Custom_Exception;

public class Bank {

    private String currency;

    private Integer amount;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }


    Bank(String currency, Integer amount){
        this.currency = currency;
        this.amount = amount;
    }


    public Integer add(Bank bankName) throws customexception {
        if (!(bankName.currency.equalsIgnoreCase("INR"))){
            throw new customexception("USD to INR not Allowed or Cannot add amounts of different currencies");
        }
        Integer sum = this.amount + bankName.amount;
        return sum;
    }

}
