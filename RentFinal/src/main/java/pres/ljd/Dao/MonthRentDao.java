package pres.ljd.Dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import pres.ljd.domain.MonthRent;

import java.util.Date;
import java.util.List;

@Repository
public interface MonthRentDao {

    @Insert("insert into monthrent values(#{rid},#{month},#{rent},#{wpn},#{epn},#{date})")
    void addMonthRent(MonthRent monthRent);

    @Select("select * from monthrent")
    List<MonthRent> findAll();

    @Select("select * from monthrent where month=#{month}")
    List<MonthRent> findByMonth(String month);

    @Select("select * from monthrent where rid=#{rid}")
    List<MonthRent> findByRid(Integer rid);

    @Select("select * from monthrent where rid=#{rid} and month=#{month}")
    MonthRent findOne(@Param("rid") Integer rid,@Param("month") String month);

}
