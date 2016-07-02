package roadgraph;

import geography.GeographicPoint;

import java.util.LinkedList;
import java.util.List;

/** The MapNode class is used to get Nodes properties together.
 * geographicPoint  - GeographicPoint, node location
 * edges            - list of node's neighbours
 */
public class MapNode {
    private GeographicPoint geographicPoint;
    private List<MapEdge> edges;

    /**
     * Constructor with params
     */
    public MapNode(GeographicPoint location, LinkedList<MapEdge> neighbours) {
        this.geographicPoint = location;
        this.edges = neighbours;
    }

    /**
     * Constructor with less params
     */
    public MapNode(GeographicPoint geographicPoint) {
        this.geographicPoint = geographicPoint;
        this.edges = new LinkedList<MapEdge>();
    }

    /**
     * Getters and setters
     */
    public GeographicPoint getLocation() {
        return geographicPoint;
    }

    public void setLocation(GeographicPoint location) {
        this.geographicPoint = location;
    }

    public List<MapEdge> getEdges() {
        return edges;
    }

    public void setEdge(MapEdge edge) {
        this.edges.add(edge);
    }

    public void setEdges(List<MapEdge> edges) {
        this.edges = edges;
    }

    public void addEdge(MapEdge edge) {
        edges.add(edge);
    }

    public int getSize() {
        return edges.size();
    }

}
