package com.alura.screenMatch.models;

import com.fasterxml.jackson.annotation.JsonAlias;

public record SeriesData(
        @JsonAlias("Title") String title,
        @JsonAlias("totalSeasons") Integer totalSeasons,
        @JsonAlias("imbdRating") String avaliation) {

}
