package uk.ac.cam.groupproj.racethewilds;

// import Parcelable?

public class SatNavUpdate implements Serialisable, Parcelable {

	// Encapsulates the SatNav update in an inter-process-communicable object.
	
	private int distance;
	private int movePoints;

}