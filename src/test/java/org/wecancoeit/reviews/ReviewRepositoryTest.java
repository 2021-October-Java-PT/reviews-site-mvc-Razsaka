package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepositoryTest {
    @Test
    public void shouldFindReviewOne(){
        ReviewRepository underTest= new ReviewRepository();
        Review foundReview=underTest.findOne(1L);
        assertEquals(foundReview.getId(), 1);
    }

    @Test
    public void shouldFindAllReviews(){
        ReviewRepository underTest= new ReviewRepository();
        Collection<Review> foundReview=underTest.findAll();
        assertThat(foundReview).hasSize(5);
    }
}
