package edu.uw.covidsafe.json;

import com.google.gson.JsonObject;

import org.json.JSONException;
import org.json.JSONObject;

public class Region {
    double lattitude_prefix;
    double longitude_prefix;
    int precision;

    public static Region parse(JSONObject obj) throws JSONException {
        Region region = new Region();
        if (obj.has("lattitude_prefix")) {
            region.lattitude_prefix = obj.getDouble("lattitude_prefix");
        }
        if (obj.has("longitude_prefix")) {
            region.longitude_prefix = obj.getDouble("longitude_prefix");
        }
        if (obj.has("precision")) {
            region.precision = obj.getInt("precision");
        }
        return region;
    }

    public static JSONObject toJson(double lat, double longi, double precision) throws JSONException {
        JSONObject region = new JSONObject();
        region.put("lattitude_prefix", lat);
        region.put("longitude_prefix", longi);
        region.put("precision", precision);
        return region;
    }
}