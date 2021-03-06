package peopleinteractive.placesnow;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wbtho on 7/21/2016.
 */
public class EncloseLocation {

    public String name;
    public String description;
    List<Comment> comments;

    public String LL;

    public EncloseLocation() {}

    public EncloseLocation(String name){
        //this.LL = latlon.toString();
        this.name = name;
        this.description = "test";
        this.comments = new ArrayList<Comment>();
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public List<Comment> getComments() {
        return comments;
    }



    public void setDescription(EncloseLocation loc, String newDescription) {
        loc.description = newDescription;
    }

    public void addComment(EncloseLocation loc, Comment comment) {
        loc.comments.add(comment);
    }


}