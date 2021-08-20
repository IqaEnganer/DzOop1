package domain;

public class Geo {
    private String type; // Тип места
    private String coordinatesInfo;
    private Place place;

    public void setType(String type) {
        this.type = type;
    }

    public Place getPlace() {
        return place;
    }

    public String getCoordinatesInfo() {
        return coordinatesInfo;
    }

    public String getType() {
        return type;
    }

    public void setCoordinatesInfo(String coordinatesInfo) {
        this.coordinatesInfo = coordinatesInfo;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

}
