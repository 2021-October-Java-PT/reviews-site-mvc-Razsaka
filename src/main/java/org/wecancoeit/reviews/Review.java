package org.wecancoeit.reviews;

public class Review {
    private long id;
    private String title;
    private String imageUrl;
    private String reviewCategory;
    private String content;
    private String description;
    private String artist;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getReviewCategory() {
        return reviewCategory;
    }

    public String getContent() {
        return content;
    }

    public String getDescription() {
        return description;
    }

    public String getArtist() {
        return artist;
    }

    public Review(long id, String title, String imageUrl, String reviewCategory, String content, String description,String artist) {
        this.id = id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.reviewCategory = reviewCategory;
        this.content = content;
        this.description = description;
        this.artist = artist;
    }
}