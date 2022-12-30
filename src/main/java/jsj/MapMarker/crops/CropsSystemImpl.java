package jsj.MapMarker.crops;

import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

@Component
public class CropsSystemImpl implements CropsSystem{
    private  SpringRepository springRepository;
    public CropsSystemImpl(SpringRepository springRepository) {
        this.springRepository = springRepository;
    }

    @Override
    public ArrayList<String> findAllByDate() {
        List<CropsData> data = springRepository.findAll();
        ArrayList<String> date = new ArrayList<>();
        Iterator<CropsData> it = data.iterator();
        while(it.hasNext())
        {
            CropsData cropsData = it.next();
            System.out.println(cropsData.getDate());
            date.add(cropsData.getDate());
        }
        Set<String> set = new HashSet<>(date);
        ArrayList<String> result = new ArrayList<>(set);
        return result;
    }

    @Override
    public ArrayList<CropsData> SelectDateAndFindData(String date){
        List<CropsData> data = springRepository.findAll();
        Iterator<CropsData> it = data.iterator();
        ArrayList<CropsData> selectData = new ArrayList<>();
        while(it.hasNext())
        {
            CropsData cropsData = it.next();
            if(cropsData.getDate().equals(date)) {
                selectData.add(cropsData);
            }
        }
        return selectData;
    }

}
