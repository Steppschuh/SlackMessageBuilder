package net.steppschuh.slackmessagebuilder.message.attachment;

import java.util.ArrayList;
import java.util.List;

public class AttachmentBuilder {

    private String title;
    private String titleLink;
    private String text;
    private String pretext;
    private String color;
    private String fallback;

    private String authorName;
    private String authorLink;
    private String authorIcon;

    private String imageUrl;
    private String thumbUrl;

    private String footer;
    private String footerIcon;

    private List<AttachmentField> fields;

    public AttachmentBuilder() {
    }

    public Attachment build() {
        return new Attachment(this);
    }

    public String getTitle() {
        return title;
    }

    public AttachmentBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTitleLink() {
        return titleLink;
    }

    public AttachmentBuilder setTitleLink(String titleLink) {
        this.titleLink = titleLink;
        return this;
    }

    public String getText() {
        return text;
    }

    public AttachmentBuilder setText(String text) {
        this.text = text;
        return this;
    }

    public String getPretext() {
        return pretext;
    }

    public AttachmentBuilder setPretext(String pretext) {
        this.pretext = pretext;
        return this;
    }

    public String getColor() {
        return color;
    }

    public AttachmentBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public String getFallback() {
        return fallback;
    }

    public AttachmentBuilder setFallback(String fallback) {
        this.fallback = fallback;
        return this;
    }

    public String getAuthorName() {
        return authorName;
    }

    public AttachmentBuilder setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    public String getAuthorLink() {
        return authorLink;
    }

    public AttachmentBuilder setAuthorLink(String authorLink) {
        this.authorLink = authorLink;
        return this;
    }

    public String getAuthorIcon() {
        return authorIcon;
    }

    public AttachmentBuilder setAuthorIcon(String authorIcon) {
        this.authorIcon = authorIcon;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public AttachmentBuilder setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public AttachmentBuilder setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
        return this;
    }

    public String getFooter() {
        return footer;
    }

    public AttachmentBuilder setFooter(String footer) {
        this.footer = footer;
        return this;
    }

    public String getFooterIcon() {
        return footerIcon;
    }

    public AttachmentBuilder setFooterIcon(String footerIcon) {
        this.footerIcon = footerIcon;
        return this;
    }

    public List<AttachmentField> getFields() {
        return fields;
    }

    public AttachmentBuilder setFields(List<AttachmentField> fields) {
        this.fields = fields;
        return this;
    }

    public AttachmentBuilder addField(AttachmentField field) {
        if (fields == null) {
            fields = new ArrayList<>();
        }
        fields.add(field);
        return this;
    }

}
