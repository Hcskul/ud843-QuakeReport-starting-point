package com.example.android.quakereport;

public class EarthQuake {

    /**
     * String resource ID for the magnitude of the EQ
     */
    private double mMag;

    /**
     * String resource ID for the location of the EQ
     */
    private String mLocation;

    /**
     * String resource ID for the date of the EQ
     */
    private long mTimeInMilliseconds;

    /**
     * String resource ID for the url of the EQ
     */
    private String mUrl;


    /**
     * Create a new Word object.
     *
     * @param mag                is the float for the magnitude of the EQ
     * @param location           is the string for the location of the EQ
     * @param timeInMilliseconds timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     */
    public EarthQuake(double mag, String location, long timeInMilliseconds, String url) {
        mMag = mag;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }


    /**
     * Get the string for the magnitude of the EQ
     */
    public double getMag() {
        return mMag;
    }

    /**
     * Get the string for the location of the EQ
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the string for the magnitude of the EQ
     */
    public long getDate() {
        return mTimeInMilliseconds;
    }

    /**
     * Get the string for the url of the EQ
     */
    public String getUrl() {
        return mUrl;
    }
}
