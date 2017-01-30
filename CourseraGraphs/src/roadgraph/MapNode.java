package roadgraph;

import geography.GeographicPoint;

import java.util.HashSet;
import java.util.Set;

/**
 * @author UCSD MOOC development team
 *
 * Class representing a vertex (or node) in our MapGraph
 *
 */
// WEEK3
// implements Comparable
class MapNode implements Comparable
{
    // WEEK2
    /** The list of edges out of this node */
    private HashSet<MapEdge> edges;
    /** the latitude and longitude of this node */
    private GeographicPoint location;

    // WEEK3
    /** actual distance */
    private double actualDistance;
    /** predicted distance */
    private double distance;

    MapNode(GeographicPoint loc) {
        location = loc;
        edges = new HashSet<MapEdge>();
        distance = Double.POSITIVE_INFINITY;
        actualDistance = Double.POSITIVE_INFINITY;
    }

    void addEdge(MapEdge edge) {
        edges.add(edge);
    }

    /** Return the neighbors of this MapNode */
    Set<MapNode> getNeighbors() {
        Set<MapNode> neighbors = new HashSet<MapNode>();
        for (MapEdge edge : edges) {
            neighbors.add(edge.getOtherNode(this));
        }
        return neighbors;
    }

    //returns an edge from this node to destination node
    MapEdge getEdgeTo(MapNode destination) {
        for (MapEdge edge: edges) {
            if (edge.getOtherNode(this).equals(destination))
                return edge;
        }
        return null;
    }
    /** get the location of a node */
    GeographicPoint getLocation() {
        return location;
    }

    /** return the edges out of this node */
    Set<MapEdge> getEdges() {
        return edges;
    }

    /** Returns whether two nodes are equal.
     * Nodes are considered equal if their locations are the same,
     * even if their street list is different.
     */
    public boolean equals(Object o) {
        if (!(o instanceof MapNode) || (o == null)) {
            return false;
        }
        MapNode node = (MapNode)o;
        return node.location.equals(this.location);
    }

    /** Because we compare nodes using their location, we also
     * may use their location for HashCode.
     * @return The HashCode for this node, which is the HashCode for the
     * underlying point
     */
    public int HashCode() {
        return location.hashCode();
    }

    /** ToString to print out a MapNode method
     *  @return the string representation of a MapNode
     */
    public String toString()
    {
        String toReturn = "[NODE at location (" + location + ")";
        toReturn += " intersects streets: ";
        for (MapEdge e: edges) {
            toReturn += e.getRoadName() + ", ";
        }
        toReturn += "]";
        return toReturn;
    }

    // For debugging, output roadNames as a String.
    public String roadNamesAsString()
    {
        String toReturn = "(";
        for (MapEdge e: edges) {
            toReturn += e.getRoadName() + ", ";
        }
        toReturn += ")";
        return toReturn;
    }
    //  WEEK 3

    // Predicted node distance Getter
    public double getDistance() {
        return this.distance;
    }

    // Predicted node distance Setter
    public void setDistance(double distance) {
        this.distance = distance;
    }

    // Actual node distance Getter
    public double getActualDistance() {
        return this.actualDistance;
    }

    // Actual node distance Setter
    public void setActualDistance(double actualDistance) {
        this.actualDistance = actualDistance;
    }

    // Implement Comparable
    public int compareTo(Object o) {
        MapNode m = (MapNode)o;
        return ((Double)this.getDistance()).compareTo(m.getDistance());
    }

    // Calculating straight distance function
    public double straightDistanceTo(MapNode destination)
    {
        double currentLatitude = this.location.getX();
        double currentLongitude = this.location.getY();
        double destinationLatitude = destination.location.getX();
        double destinationLongitude = destination.location.getY();

        double x = Math.sin(Math.toRadians(destinationLatitude - currentLatitude)/2) *
                Math.sin(Math.toRadians(destinationLatitude - currentLatitude)/2) +
                Math.cos(Math.toRadians(currentLatitude)) *
                Math.cos(Math.toRadians(destinationLatitude)) *
                Math.sin(Math.toRadians(destinationLongitude - currentLongitude)/2) *
                Math.sin(Math.toRadians(destinationLongitude - currentLongitude)/2);
        ////6371000 is earth radius in meters
        return (float) 6371000 * (2 * Math.atan2(Math.sqrt(x), Math.sqrt(1 - x)));
    }
}