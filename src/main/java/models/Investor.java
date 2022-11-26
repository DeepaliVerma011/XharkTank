package models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Investor")
public class Investor {
    int id;
    String investor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int amount;
    int equity;
    String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getAmount() {
        return amount;
    }

    public int getEquity() {
        return equity;
    }

    public void setEquity(int equity) {
        this.equity = equity;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getInvestor() {
        return investor;
    }

    public void setInvestor(String investor) {
        this.investor = investor;
    }

    public Investor(int id,String investor, int amount, int equity, String comment) {
        this.id=id;
        this.investor = investor;
        this.amount=amount;
        this.equity=equity;
        this.comment=comment;
    }
}
