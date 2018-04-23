package com.example.android.guardiannewsapp;

/**
 * Created by NiklasBöckmann on 23.04.2018.
 */

public class Article {

    private String mUrl;
    private String mDate;
    private String mTitle;
    private String mAuthor;
    private String mSectionName;

    public Article(String title, String date, String author, String url, String sectionName) {
        mTitle = title;
        mDate = date;
        mAuthor = author;
        mUrl = url;
        mSectionName = sectionName;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDate() {
        return mDate;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getSectionName() {
        return mSectionName;
    }
}
