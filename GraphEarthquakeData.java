package cmsc256;

import bridges.base.*;
import bridges.connect.Bridges;
import bridges.data_src_dependent.EarthquakeUSGS;

import java.util.Comparator;
import java.util.List;

public class GraphEarthquakeData {

  public static double calcDistance(double latitude1, double longitude1, double latitude2, double longitude2) {
		final int radius = 6371; // Radius of the earth in km

		// Haversine formula to calculate a value between 0 and 1 between 2 points on a sphere,
		//  1 being the opposite side of the sphere
		double laDistance = Math.toRadians(latitude2 - latitude1);
		double loDistance = Math.toRadians(longitude2 - longitude1);

		double a = Math.sin(laDistance / 2) * Math.sin(laDistance / 2)
				+ Math.cos(Math.toRadians(latitude1)) * Math.cos(Math.toRadians(latitude2))
				* Math.sin(loDistance / 2) * Math.sin(loDistance / 2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

		double distance = radius * c;    //convert to km
		return distance;
	}


  public static void main(String[] args) throws Exception {
    Bridges bridges = new Bridges(11, "BRIDGES_USER_ID", "BRIDGES_API_KEY");

    /* TODO:
    * Initialize a Graph of your choice
    * Grab Earthquake data and store it in a List
    * Retain only 100 earthquakes of highest magnitude
    */
    GraphAdjListSimple<String> graph = new GraphAdjListSimple<>();

    /* TODO:
    * Add the Earthquakes to the graph
    * Set each earthquake's location based on its latitude and longitude
    * ex: graph.getVisualizer(key).setLocation(earthquake.getLongit(), earthquake.getLatit());
    * Tweak the colors or other visual elements if you wish
    */


    bridges.setCoordSystemType("equirectangular");
    bridges.setDataStructure(graph);
    bridges.setMapOverlay(true);
    bridges.setTitle("Earthquake Map");
    bridges.visualize();


    /* TODO:
    * Compare the distances between all vertexes in the graph, drawing an edge
    * if they are within 500km. A method is provided to give a rough
    * estimate between 2 lat,long points.
    *
    * example usage: calcDistance(eq1.getLatit(), eq1.getLongit(),
    *                eq2.getLatit(), eq2.getLongit());
    * which returns a double representing the distance of two points in km
    */


    bridges.visualize();

    /* TODO:
    * Reset the locations of the vertices by setting their location to
    * Double.POSITIVE_INFINITY
    *
    * ex: graph.getVisualizer(key).setLocation(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY)
    */

    bridges.setMapOverlay(false);
    bridges.visualize();
  }
}
