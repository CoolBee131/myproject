package pres.ljd.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pres.ljd.Service.MonthRentService;
import pres.ljd.Service.RoomService;
import pres.ljd.domain.MonthRent;
import pres.ljd.domain.Room;

import java.util.Date;
import java.util.List;

@Controller("roomController")
@RequestMapping("/Room")
public class RoomController {

    private final RoomService roomService ;

    private final MonthRentService monthRentService;

    @Autowired
    public RoomController(RoomService roomService, MonthRentService monthRentService) {
        this.roomService = roomService;
        this.monthRentService = monthRentService;
    }

    @RequestMapping("/findAll")
    public String findAll() {
        System.out.println("表现层：查找所有房间信息");
        roomService.findAll() ;
        return null;
    }

    @RequestMapping("find")
    public String find(String rname, Date month, Model model){
        if(rname == null&month!=null){
            List<MonthRent> monthRents = monthRentService.findByMonth(month);
            int size = monthRents.size();
            for (MonthRent monthRent:monthRents){
                for (int x = 1;x <= size;x++)
                model.addAttribute("x",monthRent);
            }
            model.addAttribute("size",size);
            return "selectresult";
        }else if (month == null&&rname!=null){
            Room room = roomService.findByRname(rname);
            List<MonthRent> monthRents = monthRentService.findByRid(room.getId());
            int size = monthRents.size();
            for (MonthRent monthRent:monthRents){
                for (int x = 1;x <= size;x++)
                    model.addAttribute("x",monthRent);
            }
            model.addAttribute("size",size);
            return "selectresult";
        }else if (month == null&&rname==null){
            return "error";
        }else {
            Room room = roomService.findByRname(rname);
            MonthRent monthRent = monthRentService.findOne(room.getId(),month);
            model.addAttribute(monthRent) ;
            return "selectresult";
        }

    }

}

