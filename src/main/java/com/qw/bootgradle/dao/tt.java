package com.qw.bootgradle.dao;

public class tt {
    private String id;
    private String tt;
    private String ww;

    @Override
    public String toString() {
        return "tt{" +
                "id=" + id +
                ", tt='" + tt + '\'' +
                ", ww='" + ww + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTt() {
        return tt;
    }

    public void setTt(String tt) {
        this.tt = tt;
    }

    public String getWw() {
        return ww;
    }

    public void setWw(String ww) {
        this.ww = ww;
    }
}
