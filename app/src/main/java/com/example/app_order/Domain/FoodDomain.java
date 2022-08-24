package com.example.app_order.Domain;

public class FoodDomain {
    private String title;
    private String pic;
    private String descripption;
    private Double fee;
    private int star;
    private int time;
    private int calories;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDescripption() {
        return descripption;
    }

    public void setDescripption(String descripption) {
        this.descripption = descripption;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public FoodDomain(String title, String pic, String descripption, Double fee, int star, int time, int calories) {
        this.title = title;
        this.pic = pic;
        this.descripption = descripption;
        this.fee = fee;
        this.star = star;
        this.time = time;
        this.calories = calories;

    }
}
