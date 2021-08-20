package domain;

public class PlaceHolder {
    private String ownerId;
    private String notDonat;
    private String photoUrl;

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getNotDonat() {
        return notDonat;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setNotDonat(String notDonat) {
        this.notDonat = notDonat;
    }
}
