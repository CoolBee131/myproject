package pres.ljd.Service;

import pres.ljd.domain.MonthRent;

import java.util.Date;
import java.util.List;

public interface MonthRentService {

    void addMonthRent(MonthRent monthRent);

    List<MonthRent> findAll() ;

    List<MonthRent> findByMonth(String month);

    List<MonthRent> findByRid(Integer rid);

    MonthRent findOne(Integer rid, String month) ;

}
