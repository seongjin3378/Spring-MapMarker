package crops;

import org.springframework.stereotype.Component;

import java.util.Optional;

public interface CropsRepository {
    CropsData save(CropsData cropsData);

    Optional<CropsData> findById(Long cropsId);
}
