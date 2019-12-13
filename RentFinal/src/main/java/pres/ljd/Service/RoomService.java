package pres.ljd.Service;

import pres.ljd.domain.Room;

import java.util.List;

public interface RoomService {

    List<Room> findAll() ;

    Room findByRname(String rname);

    void addRoom(Room room);
}
