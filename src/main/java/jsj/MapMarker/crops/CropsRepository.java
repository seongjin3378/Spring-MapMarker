package jsj.MapMarker.crops;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.Optional;
public interface CropsRepository {
    CropsData save(CropsData cropsData);


    Optional<CropsData> findById(Long cropsId);
}
