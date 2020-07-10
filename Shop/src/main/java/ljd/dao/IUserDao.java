package ljd.dao;

import ljd.domain.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;



@Repository
public interface IUserDao {

    @Select("select * from Shop where Username=#{Username}")
    @Results(id = "usermap",value = {
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "Username", property = "Username"),
            @Result(column = "Password", property = "Password"),
            @Result(column = "EMail", property = "EMail")
    })
    User FindByUsermame(String Username);

    @Select("select * from Shop where EMail=#{EMail}")
    @ResultMap(value={"usermap"})
    User FinfByEMail(String EMail);
}
