package uk.ac.cam.groupproj.racethewild;

import java.io.Serializable;

import android.os.Parcel;
import android.os.Parcelable;

// import Parcelable?

public class SatNavUpdate implements Serializable, Parcelable {

	// Encapsulates the SatNav update in an inter-process-communicable object.

	/**
	 * 
	 */
	private static final long serialVersionUID = -4065210670654242390L;
	private int distance;
	private int movePoints;
	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void writeToParcel(Parcel arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

}
