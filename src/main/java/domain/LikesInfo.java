package domain;

public class LikesInfo {
    private int count;
    private int canLikesInfo;
    private boolean userLikesInfo;
    private boolean canPublish;


    public boolean isCanPublish() {
        return canPublish;
    }

    public boolean isUserLikesInfo() {
        return userLikesInfo;
    }

    public int getCanLikesInfo() {
        return canLikesInfo;
    }

    public int getCount() {
        return count;
    }

    public void setCanLikesInfo(int canLikesInfo) {
        this.canLikesInfo = canLikesInfo;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setUserLikesInfo(boolean userLikesInfo) {
        this.userLikesInfo = userLikesInfo;
    }
}
