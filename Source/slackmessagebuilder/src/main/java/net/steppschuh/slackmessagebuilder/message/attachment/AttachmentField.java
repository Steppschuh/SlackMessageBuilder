package net.steppschuh.slackmessagebuilder.message.attachment;

import com.google.gson.annotations.SerializedName;

public class AttachmentField {

    private String title;
    private String value;

    @SerializedName("short")
    private boolean shortValue;

    public AttachmentField() {
    }

    public AttachmentField(String value, String title) {
        this.value = value;
        this.title = title;
        shortValue = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isShort() {
        return shortValue;
    }

    public void setShort(boolean shortValue) {
        this.shortValue = shortValue;
    }

}
