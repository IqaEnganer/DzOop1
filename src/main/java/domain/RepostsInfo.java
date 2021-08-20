package domain;

public class RepostsInfo {
    public int count;
    public int userRepost;
    public boolean infoForCanRepost;

    public void setCount(int count) {
        this.count = count;
    }

    public void setUserRepost(int userRepost) {
        this.userRepost = userRepost;
    }

    public int getCount() {
        return count;
    }

    public int getUserRepost() {
        return userRepost;
    }

    public void setInfoForCanRepost(boolean infoForCanRepost) {
        this.infoForCanRepost = infoForCanRepost;
    }

    public boolean isInfoForCanRepost() {
        return infoForCanRepost;
    }
}
