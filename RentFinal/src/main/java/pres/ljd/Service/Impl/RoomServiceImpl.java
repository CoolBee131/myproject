package pres.ljd.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pres.ljd.Dao.RoomDao;
import pres.ljd.Service.RoomService;
import pres.ljd.domain.Room;

import java.util.List;

@Service("roomService")
public class RoomServiceImpl implements RoomService {

    private final RoomDao roomDao;

    @Autowired
    public RoomServiceImpl(RoomDao roomDao) {
        this.roomDao = roomDao;
    }

    @Override
    public List<Room> findAll() {
        System.out.println("业务层：查找所有房间信息");
        List<Room> rooms = roomDao.findAll();
        return rooms;
    }

    @Override
    public Room findByRname(String rname) {
        System.out.println("业务层：用房间名字查找");
        Room room = roomDao.findByRname(rname);
        return room;
    }

}

