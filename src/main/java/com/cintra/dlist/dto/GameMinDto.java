package com.cintra.dlist.dto;

import com.cintra.dlist.model.Game;

public class GameMinDto {

    private long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String longDescription;

    public GameMinDto() {
    }

    public GameMinDto(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        longDescription = entity.getLongDescription();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getLongDescription() {
        return longDescription;
    }
}
