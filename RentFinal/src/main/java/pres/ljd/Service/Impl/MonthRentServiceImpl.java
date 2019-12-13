package pres.ljd.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pres.ljd.Dao.MonthRentDao;
import pres.ljd.Service.MonthRentService;
import pres.ljd.domain.MonthRent;

import java.util.Date;
import java.util.List;

@Service("monthRentService")
public class MonthRentServiceImpl implements MonthRentService {

    private final MonthRentDao monthRentDao;

    @Autowired
    public MonthRentServiceImpl(MonthRentDao monthRentDao) {
        this.monthRentDao = monthRentDao;
    }

    @Override
    public void addMonthRent(MonthRent monthRent) {
        monthRentDao.addMonthRent(monthRent);
    }

    @Override
    public List<MonthRent> findAll() {
        List<MonthRent> monthRents = monthRentDao.findAll();
        return monthRents;
    }

    @Override
    public List<MonthRent> findByMonth(String month) {
        List<MonthRent> monthRents = monthRentDao.findByMonth(month);
        return monthRents;
    }

    @Override
    public List<MonthRent> findByRid(Integer rid) {
        List<MonthRent> monthRents = monthRentDao.findByRid(rid);
        return monthRents;
    }

    @Override
    public MonthRent findOne(Integer rid, String month) {
        MonthRent monthRent = monthRentDao.findOne(rid, month);
        return monthRent;
    }
}
