package jsj.MapMarker.crops;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Component
public class CropsSystemImpl implements CropsSystem{
    private final SpringRepository springRepository;

    public CropsSystemImpl(SpringRepository springRepository) {
        this.springRepository = springRepository;
    }


    @Override
    public ArrayList<String> findAllByDate() {

        List<CropsData> data = springRepository.findAll();
        Iterator<CropsData> it = data.iterator();
        ArrayList<String> date = new ArrayList<>();
        while(it.hasNext())
        {
            CropsData cropsData = it.next();
            System.out.println(cropsData.getDate());
            date.add(cropsData.getDate());
        }
        return date;
    }

}
