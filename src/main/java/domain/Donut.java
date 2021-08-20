package domain;

public class Donut {
    private boolean donut;
    private int paidDuration;
    private PlaceHolder placeHolder;
    private boolean canPublishFreeCopy;
    private String editMode;

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public boolean isDonut() {
        return donut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public PlaceHolder getPlaceHolder() {
        return placeHolder;
    }

    public void setDonut(boolean donut) {
        this.donut = donut;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public void setPlaceHolder(PlaceHolder placeHolder) {
        this.placeHolder = placeHolder;
    }
}
