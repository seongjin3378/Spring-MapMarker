package crops;

import java.util.Optional;

public interface CropsSystem {
    CropsData save(CropsData cropsData);

    Optional<CropsData> findCropsData(Long cropsId);

}

