package net.steppschuh.slackmessagebuilder.message;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class MessageAttachment implements Serializable {

    public static final String COLOR_GOOD = "good";
    public static final String COLOR_WARNING = "warning";
    public static final String COLOR_DANGER = "danger";

    private String title;
    @SerializedName("title_link")
    private String titleLink;
    private String text;
    private String pretext;
    private String color;
    private String fallback;

    @SerializedName("author_name")
    private String authorName;
    @SerializedName("author_link")
    private String authorLink;
    @SerializedName("author_icon")
    private String authorIcon;

    @SerializedName("image_url")
    private String imageUrl;
    @SerializedName("thumb_url")
    private String thumbUrl;

    private String footer;
    @SerializedName("footer_icon")
    private String footerIcon;

    private List<MessageAttachmentField> fields;

    public MessageAttachment() {
    }

    public MessageAttachment(MessageAttachmentBuilder messageAttachmentBuilder) {
        this.title = messageAttachmentBuilder.getTitle();
        this.titleLink = messageAttachmentBuilder.getTitleLink();
        this.text = messageAttachmentBuilder.getText();
        this.pretext = messageAttachmentBuilder.getPretext();
        this.color = messageAttachmentBuilder.getColor();
        this.fallback = messageAttachmentBuilder.getFallback();
        this.authorName = messageAttachmentBuilder.getAuthorName();
        this.authorLink = messageAttachmentBuilder.getAuthorLink();
        this.authorIcon = messageAttachmentBuilder.getAuthorIcon();
        this.imageUrl = messageAttachmentBuilder.getImageUrl();
        this.thumbUrl = messageAttachmentBuilder.getThumbUrl();
        this.footer = messageAttachmentBuilder.getFooter();
        this.footerIcon = messageAttachmentBuilder.getFooterIcon();
        this.fields = messageAttachmentBuilder.getFields();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPretext() {
        return pretext;
    }

    public void setPretext(String pretext) {
        this.pretext = pretext;
    }

    public String getTitleLink() {
        return titleLink;
    }

    public void setTitleLink(String titleLink) {
        this.titleLink = titleLink;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFallback() {
        return fallback;
    }

    public void setFallback(String fallback) {
        this.fallback = fallback;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorLink() {
        return authorLink;
    }

    public void setAuthorLink(String authorLink) {
        this.authorLink = authorLink;
    }

    public String getAuthorIcon() {
        return authorIcon;
    }

    public void setAuthorIcon(String authorIcon) {
        this.authorIcon = authorIcon;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getFooterIcon() {
        return footerIcon;
    }

    public void setFooterIcon(String footerIcon) {
        this.footerIcon = footerIcon;
    }

    public List<MessageAttachmentField> getFields() {
        return fields;
    }

    public void setFields(List<MessageAttachmentField> fields) {
        this.fields = fields;
    }

}
