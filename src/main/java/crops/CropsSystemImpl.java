package crops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CropsSystemImpl implements CropsSystem{
    private final CropsRepository cropsRepository;

    @Autowired
    public CropsSystemImpl(CropsRepository cropsRepository) {
        this.cropsRepository = cropsRepository;
    }

    @Override
    public CropsData save(CropsData cropsData) {
        cropsRepository.save(cropsData);
        return cropsData;
    }

    @Override
    public Optional<CropsData> findCropsData(Long cropsId) {
        return cropsRepository.findById(cropsId);
    }

}
