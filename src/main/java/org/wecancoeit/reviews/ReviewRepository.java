package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {
    Map<Long, Review> reviewList = new HashMap<>();

    private Review reviewOne = new Review(1L, "Love Supreme","/images/Love Supreme.jpg","Jazz","Acknowledgement,Resolution,Pursuance","Spiritual Jazz, thought-provoking, Wordless recitation,transformational", "John Coltrane");
    private Review reviewTwo = new Review(2L, "Singin' the Blues", "/images/Singin' the Blues.jpg","Blues","Please Love Me, You Upset Me Baby,Bad Luck, Three O'clock Blues,You know I Love You","Gospel-infused,Country blues vocal style with frenetic guitar method","B.B King");
    private Review reviewThree = new Review(3L, "Songs", "/images/Songs By Luther Vandross.jpg","R&B", "Love the One You're With,Killing Me Softly,Endless Love,Evergreen,Always and Forever,Going in Circles","Entertaining, Masterpiece", "Luther Vandross");
    private Review reviewFour = new Review(4L, "Thriller", "/images/Thriller.jpg","Pop", "Wanna Be Startin' Somethin',Baby Be Mine,Thriller,Beat It,Billie Jean, The Lady in My Life","Dramatic and Energetic,Music and lyrics evoke horror films with sound effects such as thunder, footsteps and wind", "Michael Jackson");
    private Review reviewFive = new Review(5L, "What's Going On", "/images/What's Going On.jpg","Soul", "What's Happening Brother,God is Love,Wholly Holy,Mercy Mercy Me,Right On,Save the Children","Sentimental, political,protest, concept album", "Marvin Gaye");

    public ReviewRepository() {
        reviewList.put(reviewOne.getId(),reviewOne);
        reviewList.put(reviewTwo.getId(), reviewTwo);
        reviewList.put(reviewThree.getId(), reviewThree);
        reviewList.put(reviewFour.getId(), reviewFour);
        reviewList.put(reviewFive.getId(), reviewFive);
    }

    public Review findOne(long id) {
        return reviewList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewList.values();
    }
}
