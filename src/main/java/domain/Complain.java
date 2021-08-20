package domain;

public class Complain {
    private int id;
    private int ownerID;
    private String listName;
    private boolean spam;
    private boolean insult;
    private boolean adultMaterial;
    private boolean saleWeapons;
    private boolean violence;

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAdultMaterial() {
        return adultMaterial;
    }

    public boolean isInsult() {
        return insult;
    }

    public boolean isSaleWeapons() {
        return saleWeapons;
    }

    public boolean isSpam() {
        return spam;
    }

    public boolean isViolence() {
        return violence;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setAdultMaterial(boolean adultMaterial) {
        this.adultMaterial = adultMaterial;
    }

    public String getListName() {
        return listName;
    }

    public int getId() {
        return id;
    }

    public void setInsult(boolean insult) {
        this.insult = insult;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public void setSaleWeapons(boolean saleWeapons) {
        this.saleWeapons = saleWeapons;
    }

    public void setSpam(boolean spam) {
        this.spam = spam;
    }

    public void setViolence(boolean violence) {
        this.violence = violence;
    }

}
