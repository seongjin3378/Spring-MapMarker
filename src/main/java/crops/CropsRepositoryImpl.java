package crops;

import java.util.Optional;

public class CropsRepositoryImpl implements CropsRepository{

    @Override
    public CropsData save(CropsData cropsData) {

        return cropsData;
    }

    @Override
    public Optional<CropsData> findById(Long cropsId) {
        return Optional.empty();
    }
}
