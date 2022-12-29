package jsj.MapMarker.crops;

import java.util.List;
import java.util.Optional;

public class CropsSystemImpl implements CropsSystem{
    private final SpringRepository springRepository;

    public CropsSystemImpl(SpringRepository springRepository) {
        this.springRepository = springRepository;
    }


    @Override
    public Optional<CropsData> findAllByDate(String cropsDate) {

        List<CropsData> data = springRepository.findAll();
        
        return cropsRepository.findById(cropsId);
    }

}
