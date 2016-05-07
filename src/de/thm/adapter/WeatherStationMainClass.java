package de.thm.adapter;

import java.util.ArrayList;

/**
 * Created by Nils on 06.05.2016.
 */
public class WeatherStationMainClass {
    private ArrayList<MetricWeatherStation>         lMetricWeatherStations;
    private ArrayList<AngloAmericanWeatherStation>  lAngloAmericanWeatherStations;
    private ArrayList<WeatherStation>               lAllWeatherStations;

    public static void main(String[] args) {
        WeatherStationMainClass wsmcThis = new WeatherStationMainClass();

        //wsmcThis.runSampleOld();
        wsmcThis.runSampleNew();

    }

    public WeatherStationMainClass(){
        lMetricWeatherStations          = new ArrayList<MetricWeatherStation>();
        lAngloAmericanWeatherStations   = new ArrayList<AngloAmericanWeatherStation>();
        lAllWeatherStations             = new ArrayList<WeatherStation>();
    }

    public void generateTestData(){
        MetricWeatherStation mwsBerlin              = new MetricWeatherStation(24.5,3.745,10,1,20,"Berlin");
        MetricWeatherStation mwsHamburg             = new MetricWeatherStation(23.8,5.243,5,1.2,20,"Hamburg");
        AngloAmericanWeatherStation aawsNew_York    = new AngloAmericanWeatherStation(68.3,20.398,20,20.2,10,"New York");
        WeatherStationAdapter wsaNew_York           = new WeatherStationAdapter(aawsNew_York);
        AngloAmericanWeatherStation aawsLos_Angeles = new AngloAmericanWeatherStation(96.6,0.231,0.3,19.3,30,"Los Angeles");
        WeatherStationAdapter wsaLos_Angeles        = new WeatherStationAdapter(aawsLos_Angeles);

        lMetricWeatherStations.add(mwsBerlin);
        lMetricWeatherStations.add(mwsHamburg);
        lAngloAmericanWeatherStations.add(aawsNew_York);
        lAngloAmericanWeatherStations.add(aawsLos_Angeles);

        lAllWeatherStations.add(mwsBerlin);
        lAllWeatherStations.add(mwsHamburg);
        lAllWeatherStations.add(wsaNew_York);
        lAllWeatherStations.add(wsaLos_Angeles);
    }

    public void runSampleOld(){

        generateTestData();

        for (MetricWeatherStation mwsTemp: lMetricWeatherStations) {
            System.out.println(mwsTemp.toString());
        }

        for (AngloAmericanWeatherStation aawsTemp: lAngloAmericanWeatherStations) {
            aawsTemp.startMeasure();
            System.out.println(aawsTemp.toString());
        }
    }

    public void runSampleNew(){

        generateTestData();

        for (WeatherStation mwsTemp: lAllWeatherStations) {
            System.out.println(mwsTemp.toString());
        }
    }

    public ArrayList<MetricWeatherStation> getlMetricWeatherStations() {
        return lMetricWeatherStations;
    }

    public void setlMetricWeatherStations(ArrayList<MetricWeatherStation> lMetricWeatherStations) {
        this.lMetricWeatherStations = lMetricWeatherStations;
    }

    public ArrayList<AngloAmericanWeatherStation> getlAngloAmericanWeatherStations() {
        return lAngloAmericanWeatherStations;
    }

    public void setlAngloAmericanWeatherStations(ArrayList<AngloAmericanWeatherStation> lAngloAmericanWeatherStations) {
        this.lAngloAmericanWeatherStations = lAngloAmericanWeatherStations;
    }

    public ArrayList<WeatherStation> getlAllWeatherStations() {
        return lAllWeatherStations;
    }

    public void setlAllWeatherStations(ArrayList<WeatherStation> lAllWeatherStations) {
        this.lAllWeatherStations = lAllWeatherStations;
    }
}
