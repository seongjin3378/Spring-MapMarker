package jsj.MapMarker.crops;

import java.util.Optional;

public interface CropsSystem {

    Optional<CropsData> findAllByDate(String cropsDate);

}

