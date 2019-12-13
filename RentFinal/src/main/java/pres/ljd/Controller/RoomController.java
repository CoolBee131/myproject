package pres.ljd.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import pres.ljd.Service.MonthRentService;
import pres.ljd.Service.RoomService;
import pres.ljd.domain.MonthRent;
import pres.ljd.domain.Room;

import java.util.Date;
import java.util.List;

@Controller("roomController")
@RequestMapping("/room")
public class RoomController {

    private final RoomService roomService ;

    private final MonthRentService monthRentService;

    @Autowired
    public RoomController(RoomService roomService, MonthRentService monthRentService) {
        this.roomService = roomService;
        this.monthRentService = monthRentService;
    }

    /**
     * 实现查找所有房间信息
     * @return 跳转到"roomMessage"并返回list
     */
    @RequestMapping("/findAllRoom")
    public ModelAndView findAllRoom() {
        System.out.println("表现层：查找所有房间信息");
        List<Room> rooms = roomService.findAll() ;
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("roomMessage");
        modelAndView.addObject("rooms",rooms);
        return modelAndView;
    }



    @RequestMapping("/addRoom")
    public String addRoom(@RequestBody Room room){
        if(!room.getRname().isEmpty()){
            roomService.addRoom(room);
            return "success";
        }else{
            return "error";
        }
    }

    @RequestMapping("/addRent")
    public String addRent(@RequestBody MonthRent monthRent){
        System.out.println(monthRent);
        monthRentService.addMonthRent(monthRent);
        return "success";
    }

}

