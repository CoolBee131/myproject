package pres.ljd.Test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pres.ljd.Controller.HomeController;
import pres.ljd.Controller.RoomController;
import pres.ljd.Dao.RoomDao;
import pres.ljd.Service.MonthRentService;
import pres.ljd.Service.RoomService;
import pres.ljd.domain.MonthRent;
import pres.ljd.domain.Room;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:/applicationContext.xml")
public class Testone {

    @Autowired
    private RoomService roomService = null;

    @Autowired
    private RoomDao roomDao=null;

    @Autowired
    private MonthRentService monthRentService=null;

    @Test
    public void testFor(){
        for (int x = 0;x <= 3;x++){
            System.out.println(x);
        }
    }

    @Test
    public void testAddRoom(){
        Room room = new Room();
        room.setRname("103");
        roomService.addRoom(room);
    }

    @Test
    public void testFindAll(){
        List<Room> rooms = roomService.findAll();
        for (Room room:rooms){
            System.out.println(room);
        }
    }

    @Test
    public void tesAddMonthRent(){
        MonthRent monthRent = new MonthRent();
        monthRent.setRid(1);
        monthRent.setMonth("2019-07");
        monthRent.setEpn(1122);
        monthRent.setRent(200.3);
        monthRent.setWpn(3366);
        monthRentService.addMonthRent(monthRent);
    }

    @Test
    public void testFindByRname(){
        String rname = "103";
        Room room = roomService.findByRname(rname);
        System.out.println(room);
    }

    @Test
    public void testFindOne(){
        String rname = "101";
        String month = "2019-06";
        Room room = roomService.findByRname(rname);
        MonthRent monthRent = monthRentService.findOne(room.getId(), month);
        System.out.println(monthRent);
    }
}
