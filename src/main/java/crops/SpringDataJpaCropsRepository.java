package crops;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaCropsRepository extends JpaRepository<CropsData, Long>, CropsRepository {
    @Override
    Optional<CropsData> findById(Long aLong);

    @Override
    CropsData save(CropsData cropsData);
}
