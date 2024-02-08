package com.engeto;

public class Room {
    private Integer numberOFTheRoom;
   private  Integer beds;
    private Boolean balcony;
    private Boolean sea;
    private Integer pricePerNight;

    public Room(Integer number, Integer beds, Boolean balcony, Boolean sea, Integer pricePerNight) {
        this.numberOFTheRoom = number;
        this.beds = beds;
        this.balcony = balcony;
        this.sea = sea;
        this.pricePerNight = pricePerNight;
    }



    ///region getter and setter

    public Integer getNumberOFTheRoom() {
        return numberOFTheRoom;
    }

    public void setNumberOFTheRoom(Integer numberOFTheRoom) {
        this.numberOFTheRoom = numberOFTheRoom;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public Boolean getBalcony() {
        return balcony;
    }

    public void setBalcony(Boolean balcony) {
        this.balcony = balcony;
    }

    public Boolean getSea() {
        return sea;
    }

    public void setSea(Boolean sea) {
        this.sea = sea;
    }

    public Integer getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(Integer pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    ///endregion getter and setter

}
