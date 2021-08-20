package domain;

public class Place {
    private int id;
    private String title;
    private int latitube;
    private int longitube;
    private int created;
    private String icon;
    private int checkins;
    private int updated;
    private int type;
    private int country;
    private int city;
    private String address;

    public int getCheckins() {
        return checkins;
    }

    public int getCity() {
        return city;
    }

    public int getCountry() {
        return country;
    }

    public int getCreated() {
        return created;
    }

    public int getId() {
        return id;
    }

    public int getLatitube() {
        return latitube;
    }

    public int getLongitube() {
        return longitube;
    }

    public int getType() {
        return type;
    }

    public int getUpdated() {
        return updated;
    }

    public String getAddress() {
        return address;
    }

    public String getIcon() {
        return icon;
    }

    public String getTitle() {
        return title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCheckins(int checkins) {
        this.checkins = checkins;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setLatitube(int latitube) {
        this.latitube = latitube;
    }

    public void setLongitube(int longitube) {
        this.longitube = longitube;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setUpdated(int updated) {
        this.updated = updated;
    }

}

