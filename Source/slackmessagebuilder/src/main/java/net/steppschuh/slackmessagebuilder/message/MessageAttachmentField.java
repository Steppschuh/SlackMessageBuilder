package net.steppschuh.slackmessagebuilder.message;

import com.google.gson.annotations.SerializedName;

public class MessageAttachmentField {

    private String title;
    private String value;

    @SerializedName("short")
    private boolean shortValue;

    public MessageAttachmentField() {
    }

    public MessageAttachmentField(String value, String title) {
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
