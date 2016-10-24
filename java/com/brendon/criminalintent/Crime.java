package com.brendon.criminalintent;


import java.util.Date;
import java.util.UUID;

/*
This will generate a new Crime, unique ID of a random number and the date it was created.
 */

public class Crime {

    private UUID mID;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String mSuspect;


    public Crime() {

        this(UUID.randomUUID());

    }

    public Crime(UUID id) {

        mID = id;
        mDate = new Date();

    }

    public UUID getID() {
        return mID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    public String getPhotoFilename() {

        return "IMG_" + getID().toString() + ".jpg";

    }
}


