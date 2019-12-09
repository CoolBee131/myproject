package pres.ljd.Service.Impl;

import org.springframework.stereotype.Service;
import pres.ljd.Service.MonthRentService;
import pres.ljd.domain.MonthRent;

import java.util.Date;
import java.util.List;

@Service("monthRentService")
public class MonthRentServiceImpl implements MonthRentService {

    @Override
    public List<MonthRent> findAll() {
        return null;
    }

    @Override
    public List<MonthRent> findByMonth(Date month) {
        return null;
    }

    @Override
    public List<MonthRent> findByRid(Integer rid) {
        return null;
    }

    @Override
    public MonthRent findOne(Integer rid, Date month) {
        return null;
    }
}
