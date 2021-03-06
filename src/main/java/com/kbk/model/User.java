package com.kbk.model;

public class User {
    private int id;

    private String image;

    private String username;

    private String password;

    private Long joinTime;

    public User(Integer id, String image, String username, String password, Long joinTime) {
        this.id = id;
        this.image = image;
        this.username = username;
        this.password = password;
        this.joinTime = joinTime;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Long joinTime) {
        this.joinTime = joinTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", username='" + username + '\'' +
                ", password=" + password +
                ", joinTime=" + joinTime +
                '}';
    }
}