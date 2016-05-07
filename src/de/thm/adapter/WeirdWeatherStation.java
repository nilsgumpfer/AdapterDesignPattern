package de.thm.adapter;

import javax.xml.stream.Location;

/**
 * Created by Nils on 06.05.2016.
 */
public interface WeirdWeatherStation {

    /**
     * Measure has to be initiated before data is ready to read
     * * */
    public void startMeasure();

    /**
     * @return Returns the measured temperature in &deg;F
     * * */
    public double getTemperature();

    /**
     * @return Returns the measured amount of rainfall in gallons per square-yard
     */
    public double getRainfallAmount();

    /**
     * @return Returns the measured velocity of wind in miles per hour
     */
    public double getWindVelocity();

    /**
     * @return Returns the measured pessure of air in pound-force per square-inch
     */
    public double getAirPressure();

    /**
     * @return Returns the geographical height above normal-null ocean level in feet
     */
    public double getHeightAboveNN();

    /**
     * @return Returns the geographical location as string
     */
    public String getLocation();

    @Override
    public String toString();

}
