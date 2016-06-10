package net.steppschuh.slackmessagebuilder.message.attachment;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Attachment implements Serializable {

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

    private List<AttachmentField> fields;

    public Attachment() {
    }

    public Attachment(AttachmentBuilder attachmentBuilder) {
        this.title = attachmentBuilder.getTitle();
        this.titleLink = attachmentBuilder.getTitleLink();
        this.text = attachmentBuilder.getText();
        this.pretext = attachmentBuilder.getPretext();
        this.color = attachmentBuilder.getColor();
        this.fallback = attachmentBuilder.getFallback();
        this.authorName = attachmentBuilder.getAuthorName();
        this.authorLink = attachmentBuilder.getAuthorLink();
        this.authorIcon = attachmentBuilder.getAuthorIcon();
        this.imageUrl = attachmentBuilder.getImageUrl();
        this.thumbUrl = attachmentBuilder.getThumbUrl();
        this.footer = attachmentBuilder.getFooter();
        this.footerIcon = attachmentBuilder.getFooterIcon();
        this.fields = attachmentBuilder.getFields();
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

    public List<AttachmentField> getFields() {
        return fields;
    }

    public void setFields(List<AttachmentField> fields) {
        this.fields = fields;
    }

}
