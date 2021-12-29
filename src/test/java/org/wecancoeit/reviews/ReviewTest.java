package org.wecancoeit.reviews;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ReviewTest {
    private Review underTest;

    private final long ID = 1010;
    private final String TITLE = "title";
    private final String IMAGE_URL = "imageUrl";
    private final String CATEGORY = "reviewCategory";
    private final String CONTENT = "content";
    private final String DESCRIPTION = "description";
    private final String ARTIST = "artist";

    @BeforeEach
    public void setup() {
        underTest = new Review(ID, TITLE, IMAGE_URL, CATEGORY, CONTENT, DESCRIPTION, ARTIST);
    }

    @Test
    public void shouldConstructIdTitleImageURLCategoryContentDescriptionArtist() {
        assertNotNull(underTest);
    }

    @Test
    public void shouldReturnId() {
        long check = underTest.getId();
        assertEquals(ID, check);
    }

    @Test
    public void shouldReturnTitle() {
        String check = underTest.getTitle();
        assertEquals(TITLE, check);
    }

    @Test
    public void shouldReturnImageURL() {
        String check = underTest.getImageUrl();
        assertEquals(IMAGE_URL, check);
    }

    @Test
    public void shouldReturnContent() {
        String check = underTest.getContent();
        assertEquals(CONTENT, check);
    }
    @Test
    public void shouldReturnDescription() {
        String check = underTest.getDescription();
        assertEquals(DESCRIPTION, check);
    }
}
