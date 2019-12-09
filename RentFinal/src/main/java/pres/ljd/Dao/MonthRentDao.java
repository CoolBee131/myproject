package pres.ljd.Dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import pres.ljd.domain.MonthRent;

import java.util.Date;
import java.util.List;

@Repository
public interface MonthRentDao {

    @Select("select from monthrent")
    List<MonthRent> findAll();

    @Select("select from monthrent where month=#{month}")
    List<MonthRent> findByMonth(Date month);

    @Select("select from monthrent where rid=#{rid}")
    List<MonthRent> findByRid(Integer rid);

    @Select("select from monthrent where month=#{month} and rid=#{rid}")
    List<MonthRent> findOne(Integer rid, Date montrh);

}
