package module6;

import java.util.List;

import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.marker.SimpleLinesMarker;
import processing.core.PConstants;
import processing.core.PGraphics;

/** 
 * A class to represent AirportMarkers on a world map.
 *   
 * @author Adam Setters and the UC San Diego Intermediate Software Development
 * MOOC team
 *
 */
public class AirportMarker extends CommonMarker {
	public static List<SimpleLinesMarker> routes;
	
	public AirportMarker(Feature city) {
		super(((PointFeature)city).getLocation(), city.getProperties());
	
	}
	
	@Override
	public void drawMarker(PGraphics pg, float x, float y) {
		pg.fill(11);
		pg.ellipse(x, y, 5, 5);
	}

	@Override
	public void showTitle(PGraphics pg, float x, float y) {
		pg.pushStyle();

		String name = getCode() + " " + getName();
		String pop = getCity() + " " + getCountry();

		pg.fill(255, 255, 200);
		pg.textSize(12);
		pg.rectMode(PConstants.CORNER);
		pg.rect(x, y-5-39, Math.max(pg.textWidth(name), pg.textWidth(pop)) + 6, 39);
		pg.fill(0, 0, 0);
		pg.textAlign(PConstants.LEFT, PConstants.TOP);
		pg.text(name, x+3, y-5-33);
		pg.text(pop, x+3, y - 5 -18);

		pg.popStyle();
		
	}

	private String getCity()
	{
		return getStringProperty("city");
	}

	private String getCountry()
	{
		return getStringProperty("country");
	}

	private String getCode()
	{
		return getStringProperty("code");
	}

	private String getName()
	{
		return getStringProperty("name");
	}
	
}
