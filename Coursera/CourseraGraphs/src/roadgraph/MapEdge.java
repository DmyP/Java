package roadgraph;

import geography.GeographicPoint;

/** The MapEdge class is used to represent a set of edges originating from a node.
 * start    - GeographicPoint, coordinates of start
 * end      - GeographicPoint, coordinates of end
 * roadName - String, name of the road
 * roadType - String, type of the road
 * distance - double, length of the road
 */
public class MapEdge {
    private GeographicPoint start;
    private GeographicPoint end;
    private String roadName;
    private String roadType;
    private double distance;

    /**
     * Constructor with params
     */
    public MapEdge(GeographicPoint start, GeographicPoint end, String roadName, String roadType,
                   double distance) {
        this.start = start;
        this.end = end;
        this.roadName = roadName;
        this.roadType = roadType;
        this.distance = distance;
    }

    /**
     * Constructor without params
     */
    public MapEdge() {
    }

    /**
     * Getters and setters
     */
    public GeographicPoint getStart() {
        return start;
    }

    public void setStart(GeographicPoint start) {
        this.start = start;
    }

    public GeographicPoint getEnd() {
        return end;
    }

    public void setEnd(GeographicPoint end) {
        this.end = end;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public String getRoadType() {
        return roadType;
    }

    public void setRoadType(String roadType) {
        this.roadType = roadType;
    }

}
