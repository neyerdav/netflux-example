package dev.neyerdavid.netfluxexample.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NonNull;

@Document
@Data
public class Movie {

    public Movie(@NonNull String title) {
        this.title = title;
    }

    private String id;
    @NonNull
    private String title;

    public String toString() {
        return "Name: " + title + " ID: " + id;
    }

}
