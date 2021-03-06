package guimodule;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.GeoJSONReader;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LifeExpectancy extends PApplet {

    UnfoldingMap map;
    Map<String, Float> lifeExpByCountry;
    String fileName = "LifeExpectancyWorldBank.csv";
    List<Feature> countries;
    List<Marker> countryMarkers;

    public void setup() {
        size(800, 600, OPENGL);
        map = new UnfoldingMap(this, 50, 50, 700, 500, new Google.GoogleMapProvider());
        MapUtils.createDefaultEventDispatcher(this, map);

        // Load lifeExpectancy data
        lifeExpByCountry = loadLifeExpectancyFromCSV(fileName);

        // Load country polygons and adds them as markers
        countries = GeoJSONReader.loadData(this, "countries.geo.json");
        countryMarkers = MapUtils.createSimpleMarkers(countries);

        map.addMarkers(countryMarkers);
        shadeCountries();

    }

    public void draw() {

    }

    private Map<String, Float> loadLifeExpectancyFromCSV(String fileName)
    {
        System.out.println("loadLifeExpectancyFromCSV");
        Map<String, Float> lifeExpMap
                = new HashMap<String, Float>();
        String[] rows = loadStrings(fileName);
        for (String row : rows) {
            String[] columns = row.split(",");
            if(columns.length == 6 && !columns[5].equals("")){
                float value = Float.parseFloat(columns[5]);
                lifeExpMap.put(columns[4], value);
            }

            
        }

        return lifeExpMap;
    }

    //Helper method to color each country based on life expectancy
    private void shadeCountries() {
        System.out.println("shadeCountries");
        for (Marker marker : countryMarkers) {
            String countryId = marker.getId();    // Find data for country of the current marker
            if (lifeExpByCountry.containsKey(countryId)) {
                float lifeExp = lifeExpByCountry.get(countryId);
                // Encode value as brightness (values range: 40-90)
                int colorLevel = (int) map(lifeExp, 40, 90, 10, 255);
                marker.setColor(color(255-colorLevel, 100, colorLevel));
            }
            else {
                marker.setColor(color(150,150,150));
            }
        }

    }

}
