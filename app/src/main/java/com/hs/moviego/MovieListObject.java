package com.hs.moviego;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by zouhansheng on 2018/2/21.
 */

public class MovieListObject {
    @SerializedName("key")
    @Expose
    private Key key;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("atMoviesMvId")
    @Expose
    private String atMoviesMvId;
    @SerializedName("mvName")
    @Expose
    private String mvName;
    @SerializedName("enName")
    @Expose
    private String enName;
    @SerializedName("playingDate")
    @Expose
    private String playingDate;
    @SerializedName("imgLink")
    @Expose
    private String imgLink;
    @SerializedName("updateDate")
    @Expose
    private String updateDate;
    @SerializedName("mv_IMDbMoblieUrl")
    @Expose
    private String mvIMDbMoblieUrl;
    @SerializedName("IMDbRating")
    @Expose
    private Double iMDbRating;
    @SerializedName("tomatoesRating")
    @Expose
    private Double tomatoesRating;

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAtMoviesMvId() {
        return atMoviesMvId;
    }

    public void setAtMoviesMvId(String atMoviesMvId) {
        this.atMoviesMvId = atMoviesMvId;
    }

    public String getMvName() {
        return mvName;
    }

    public void setMvName(String mvName) {
        this.mvName = mvName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getPlayingDate() {
        return playingDate;
    }

    public void setPlayingDate(String playingDate) {
        this.playingDate = playingDate;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getMvIMDbMoblieUrl() {
        return mvIMDbMoblieUrl;
    }

    public void setMvIMDbMoblieUrl(String mvIMDbMoblieUrl) {
        this.mvIMDbMoblieUrl = mvIMDbMoblieUrl;
    }

    public Double getIMDbRating() {
        return iMDbRating;
    }

    public void setIMDbRating(Double iMDbRating) {
        this.iMDbRating = iMDbRating;
    }

    public Double getTomatoesRating() {
        return tomatoesRating;
    }

    public void setTomatoesRating(Double tomatoesRating) {
        this.tomatoesRating = tomatoesRating;
    }

    public class Key {

        @SerializedName("kind")
        @Expose
        private String kind;
        @SerializedName("id")
        @Expose
        private String id;

        public String getKind() {
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }
}
