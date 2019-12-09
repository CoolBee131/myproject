package pres.ljd.Service;

import pres.ljd.domain.MonthRent;

import java.util.Date;
import java.util.List;

public interface MonthRentService {

    List<MonthRent> findAll() ;

    List<MonthRent> findByMonth(Date month);

    List<MonthRent> findByRid(Integer rid);

    MonthRent findOne(Integer rid, Date month) ;

}
