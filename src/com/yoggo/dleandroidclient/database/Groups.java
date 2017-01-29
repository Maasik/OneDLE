package com.yoggo.dleandroidclient.database;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table GROUPS.
 */
public class Groups {

    private Long id;
    private String GroupName;
    private Boolean AllowAddNews;
    private Boolean AllowAddCommentary;
    private Boolean AllowEditCommentary;
    private Boolean AllowDeleteCommentary;
    private Boolean AllowEditAllCommentary;
    private Boolean AllowDeleteAllCommentary;
    private Boolean AdminCategories;
    private String CatAllowAddNews;

    public Groups() {
    }

    public Groups(Long id) {
        this.id = id;
    }

    public Groups(Long id, String GroupName, Boolean AllowAddNews, Boolean AllowAddCommentary, Boolean AllowEditCommentary, Boolean AllowDeleteCommentary, Boolean AllowEditAllCommentary, Boolean AllowDeleteAllCommentary, Boolean AdminCategories, String CatAllowAddNews) {
        this.id = id;
        this.GroupName = GroupName;
        this.AllowAddNews = AllowAddNews;
        this.AllowAddCommentary = AllowAddCommentary;
        this.AllowEditCommentary = AllowEditCommentary;
        this.AllowDeleteCommentary = AllowDeleteCommentary;
        this.AllowEditAllCommentary = AllowEditAllCommentary;
        this.AllowDeleteAllCommentary = AllowDeleteAllCommentary;
        this.AdminCategories = AdminCategories;
        this.CatAllowAddNews = CatAllowAddNews;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    public Boolean getAllowAddNews() {
        return AllowAddNews;
    }

    public void setAllowAddNews(Boolean AllowAddNews) {
        this.AllowAddNews = AllowAddNews;
    }

    public Boolean getAllowAddCommentary() {
        return AllowAddCommentary;
    }

    public void setAllowAddCommentary(Boolean AllowAddCommentary) {
        this.AllowAddCommentary = AllowAddCommentary;
    }

    public Boolean getAllowEditCommentary() {
        return AllowEditCommentary;
    }

    public void setAllowEditCommentary(Boolean AllowEditCommentary) {
        this.AllowEditCommentary = AllowEditCommentary;
    }

    public Boolean getAllowDeleteCommentary() {
        return AllowDeleteCommentary;
    }

    public void setAllowDeleteCommentary(Boolean AllowDeleteCommentary) {
        this.AllowDeleteCommentary = AllowDeleteCommentary;
    }

    public Boolean getAllowEditAllCommentary() {
        return AllowEditAllCommentary;
    }

    public void setAllowEditAllCommentary(Boolean AllowEditAllCommentary) {
        this.AllowEditAllCommentary = AllowEditAllCommentary;
    }

    public Boolean getAllowDeleteAllCommentary() {
        return AllowDeleteAllCommentary;
    }

    public void setAllowDeleteAllCommentary(Boolean AllowDeleteAllCommentary) {
        this.AllowDeleteAllCommentary = AllowDeleteAllCommentary;
    }

    public Boolean getAdminCategories() {
        return AdminCategories;
    }

    public void setAdminCategories(Boolean AdminCategories) {
        this.AdminCategories = AdminCategories;
    }

    public String getCatAllowAddNews() {
        return CatAllowAddNews;
    }

    public void setCatAllowAddNews(String CatAllowAddNews) {
        this.CatAllowAddNews = CatAllowAddNews;
    }

}