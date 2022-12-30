package jsj.MapMarker.crops;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SpringRepository extends JpaRepository<CropsData, Long>{

    @Override
    List<CropsData> findAll();

    @Override
    CropsData save(CropsData cropsData);
}
