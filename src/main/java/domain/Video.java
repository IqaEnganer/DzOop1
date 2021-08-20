package domain;

public class Video {
    private int id;
    private int ownerId;
    private String videoURL;
    private int quantityShowVideo;

    public int getId() {
        return id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public int getQuantityShowVideo() {
        return quantityShowVideo;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }

    public void setQuantityShowVideo(int quantityShowVideo) {
        this.quantityShowVideo = quantityShowVideo;
    }
}
