package jsj.MapMarker.crops;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Optional;

public interface CropsSystem {


    ArrayList<String> findAllByDate();
    ArrayList<CropsData> SelectDateAndFindData(String date);
}

