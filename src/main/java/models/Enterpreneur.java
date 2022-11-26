package models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Enterpreneur")
public class Enterpreneur {

    int id;
    String enterpreneur;
    String pitchTitle;
    String pitchIdea;
    int AskAmount;
    int equity;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Investor[] getOffers() {
        return offers;
    }

    public void setOffers( Investor[] offers) {
        this.offers = offers;
    }

    Investor[] offers;



    public Enterpreneur(int id,String enterpreneur, String pitchTitle, String pitchIdea, int askAmount, int equity, Investor[] offers) {
        this.id=id;
        this.enterpreneur = enterpreneur;
        this.pitchTitle = pitchTitle;
        this.pitchIdea = pitchIdea;
        this.AskAmount = askAmount;
        this.equity = equity;
        this.offers=offers;
    }

    public String getEnterpreneur() {
        return enterpreneur;
    }

    public void setEnterpreneur(String enterpreneur) {
        this.enterpreneur = enterpreneur;
    }

    public int getAskAmount() {
        return AskAmount;
    }

    public int getEquity() {
        return equity;
    }

    public void setEquity(int equity) {
        this.equity = equity;
    }

    public void setAskAmount(int askAmount) {
        AskAmount = askAmount;
    }

    public String getPitchTitle() {
        return pitchTitle;
    }

    public String getPitchIdea() {
        return pitchIdea;
    }

    public void setPitchIdea(String pitchIdea) {
        this.pitchIdea = pitchIdea;
    }

    public void setPitchTitle(String pitchTitle) {
        this.pitchTitle = pitchTitle;
    }
}
