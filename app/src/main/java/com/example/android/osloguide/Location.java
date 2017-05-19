package com.example.android.osloguide;

/**
 * Created by iva on 5/16/17.
 */

public class Location {

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Title of the location
     */
    private String mTitle;

    /**
     * Address of the location
     */
    private String mAddress;

    /**
     * Opening hours of the location
     */
    private String mOpeningHours;

    /**
     * Price of the location
     */
    private String mPriceEntrance;

    private String mSummary;

    /**
     * Photo of the location
     */
    private int mPhotoResourceId = NO_IMAGE_PROVIDED;


    /**
     * Create a new Location object.
     *
     * @param title           is the name of the location
     * @param address         is the address or the short description onf the location
     * @param openingHours    is the working hours of the location
     * @param summary         is the short description of the location
     * @param photoResourceId is the image that illustrates the location
     */
    public Location(String title, String address, String openingHours, String priceEntrance,
                    String summary, int photoResourceId) {
        mTitle = title;
        mAddress = address;
        mOpeningHours = openingHours;
        mPriceEntrance = priceEntrance;
        mSummary = summary;
        mPhotoResourceId = photoResourceId;
    }

    /**
     * Get the title of the location
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Get the address of the location
     */
    public String getAddress() {
        return mAddress;
    }

    /**
     * Get the opening hours of the location
     */
    public String getOpeningHours() {
        return mOpeningHours;
    }

    /**
     * Get the price of the location
     */
    public String getPrice() {
        return mPriceEntrance;
    }

    /**
     * Get the summary of the location
     */
    public String getSummary() {
        return mSummary;
    }

    /**
     * Get the photo of the location
     */
    public int getPhotoResourceId() {
        return mPhotoResourceId;
    }

    // Not sure if this is necessary here
    public boolean hasPhoto() {
        return mPhotoResourceId != NO_IMAGE_PROVIDED;
    }
}

