package jsj.MapMarker.Map;

import jsj.MapMarker.crops.CropsData;

public interface MapMarkerSystem {
    CropsData load(String latitude, String longitude, String cropsName);
    void marking(String color, String cropsName, String markerSize, String latitude, String longitude);
}
