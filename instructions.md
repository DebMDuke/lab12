***Earthquake Tracker***

**Goals**

The purpose of this assignment is to learn to
 - Access and manipulate remote data through BRIDGES.
 - Manipulate a GraphAdjList object.
 - Display a location on a map.

**Programming part**

**Task**

Grab recent earthquake data and build a graph representing the locations of the 100 strongest earthquakes.

**Basic**
1. Open your scaffolded code.
2. Plug in your credentials.
3. Get the most recent 10,000 earthquakes. Only retain the 100 highest magnitude earthquakes.

**Place Earthquakes on the map**
1. Create a graph where each earthquake is a vertex. Add no edges for now.
2. Pin earthquakes at their longitude and latitude. Tweak the appearance of vertices if you want (e.g., use a different symbols for earthquake in Hawaii or Alaska).
3. Compile, run, and visualize.

**Build a graph based on distances**
1. For each pair of earthquakes:
 - Compute the distance using calcDistance.  
 - If the earthquakes are closer than 500km, add an edge between them.
2. Compile, run, and visualize.

**Show just the graph**
1. Deactivate the map overlay (already done in the scaffolding).
2. Unpin the vertices by setting their location to infinity.
3. Compile, run, and visualize.
