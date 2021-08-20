package domain;

public class CommentInfo {
    private int id;  // Идентификатор пользователя
    private int ownerId; // Имя пользователя
    private int count; // Количество комментариев


    private boolean canDeleteComment; // Инфо о возможности удаления текущим пользователем
    private boolean groupsCanPost; // Могут ли сообщества комментировать
    private boolean canPost;
    private boolean canOpen; // Открытие комментарий
    private boolean canClose; // Закрытие комментарий

    // Гетеры данных
    public int getId() {
        return id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public int getCount() {
        return count;
    }


    // Гетеры возможностей
    public boolean isCanDeleteComment() {
        return canDeleteComment;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }


    public boolean isGroupsCanPost() {
        return groupsCanPost;
    }

// Сетеры данных

    public void setCount(int count) {
        this.count = count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    // Сеттеры возможностей
    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public void setCanDeleteComment(boolean canDeleteComment) {
        this.canDeleteComment = canDeleteComment;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

}

