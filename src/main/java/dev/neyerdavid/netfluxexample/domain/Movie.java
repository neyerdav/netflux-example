package dev.neyerdavid.netfluxexample.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NonNull;

@Document
@Data
public class Movie {

    public Movie(String id, @NonNull String title) {
        this.id = id;
        this.title = title;
    }

    private String id;
    @NonNull
    private String title;

}
