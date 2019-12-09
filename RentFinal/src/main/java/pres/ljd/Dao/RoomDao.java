package pres.ljd.Dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import pres.ljd.domain.Room;

import java.util.List;
@Repository
public interface RoomDao {

    @Select("select from room")
    List<Room> findAll();

    @Select("select from room where rname=#{rname}")
    Room findByRname(String rname);

}
