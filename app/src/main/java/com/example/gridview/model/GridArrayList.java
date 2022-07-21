package com.example.gridview.model;

public class GridArrayList {

    private int grid_img;
    private String img_title;
    private String description;

    public GridArrayList(int grid_img, String img_title , String description) {
        this.grid_img = grid_img;
        this.img_title = img_title;
        this.description = description;
    }

    public int getGrid_img() {
        return grid_img;
    }

    public String getImg_title() {
        return img_title;
    }

    public String getDescription() {
        return description;
    }

    public void setGrid_img(int grid_img) {
        this.grid_img = grid_img;
    }

    public void setImg_title(String img_title) {
        this.img_title = img_title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "GridArrayList{" +
                "grid_img=" + grid_img +
                ", img_title='" + img_title + '\'' +
                '}';
    }
}
