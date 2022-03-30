package com.company;

public abstract class Farm {
    private String adress;
    private String OwnerName;

    public Farm(String adress, String ownerName) {
        this.adress = adress;
        OwnerName = ownerName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }
}