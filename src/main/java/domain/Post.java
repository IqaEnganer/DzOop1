package domain;

public class Post {
    private int id;
    private int ownerId;
    private boolean onlyFriend;
    private boolean canEdit;
    private String userName;
    private String avatarUrl;
    private String datePublication;
    private String text;
    private String authorName;
    private LikesInfo likesInfo;
    private FavouriteInfo favouriteInfo;
    private Geo geoLocation;
    private RepostsInfo repostsInfo;
    private Video video;
    private ViewsInfo viewsInfo;
    private Donut donut;
    private CommentInfo commentInfo;
    private Complain complain;
    private Photo photo;


    public int getId() {
        return id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public Complain getComplain() {
        return complain;
    }

    public Donut getDonut() {
        return donut;
    }

    public Photo getPhoto() {
        return photo;
    }

    public CommentInfo getCommentInfo() {
        return commentInfo;
    }

    public FavouriteInfo getFavouriteInfo() {
        return favouriteInfo;
    }

    public Geo getGeoLocation() {
        return geoLocation;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getDatePublication() {
        return datePublication;
    }

    public String getText() {
        return text;
    }

    public String getUserName() {
        return userName;
    }

    public Video getVideo() {
        return video;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setDonut(Donut donut) {
        this.donut = donut;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public void setCommentInfo(CommentInfo commentInfo) {
        this.commentInfo = commentInfo;
    }

    public void setComplain(Complain complain) {
        this.complain = complain;
    }

    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }

    public void setFavouriteInfo(FavouriteInfo favouriteInfo) {
        this.favouriteInfo = favouriteInfo;
    }

    public void setGeoLocation(Geo geoLocation) {
        this.geoLocation = geoLocation;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public void setOnlyFriend(boolean onlyFriend) {
        this.onlyFriend = onlyFriend;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public boolean isOnlyFriend() {
        return onlyFriend;
    }

}
