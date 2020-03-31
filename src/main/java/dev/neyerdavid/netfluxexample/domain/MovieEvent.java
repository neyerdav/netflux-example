package dev.neyerdavid.netfluxexample.domain;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MovieEvent {

    public MovieEvent(String movieId, Date date) {
        this.movieId = movieId;
        this.date = date;
    }

    private String movieId;
        private Date date;

}
