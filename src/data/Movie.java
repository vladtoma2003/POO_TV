package data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@JsonIgnoreProperties({"totalRatin"})
@Getter
@Setter
public class Movie {
    private String name;
    private Integer year;
    private Integer duration;
    private ArrayList<String> genres;
    private ArrayList<String> actors;
    private ArrayList<String> countriesBanned;
    private int numLikes;
    private int numRatings;
    private double rating;
    private int totalRatin;

    /**
     * a method that compares two Movie type objects
     *
     * @param o
     * @return
     */
    public int compareTo(final Movie o) {
        if (this.compareDuration(o) == 0) {
            return this.compareRating(o);
        }
        return this.compareRating(o);
    }

    /**
     * compares the rating of two Movie objects
     *
     * @param o
     * @return
     */
    public int compareRating(final Movie o) {
        if (rating > o.getRating()) {
            return 1;
        } else if (o.getRating() > rating) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * Compares the duration of two Movie objects
     *
     * @param o
     * @return
     */
    public int compareDuration(final Movie o) {
        if (duration > o.getDuration()) {
            return 1;
        } else if (o.getDuration() > duration) {
            return -1;
        } else {
            return 0;
        }
    }
}
