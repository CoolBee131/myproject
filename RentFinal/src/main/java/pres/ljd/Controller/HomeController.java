package pres.ljd.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import pres.ljd.Service.MonthRentService;
import pres.ljd.Service.RoomService;
import pres.ljd.domain.MonthRent;
import pres.ljd.domain.Room;

import java.util.List;

@Controller("homeController")
@RequestMapping("/home")
public class HomeController {

    private final RoomService roomService ;

    private final MonthRentService monthRentService;

    @Autowired
    public HomeController(RoomService roomService, MonthRentService monthRentService) {
        this.roomService = roomService;
        this.monthRentService = monthRentService;
    }


    @RequestMapping("/select")
    public String select(){
        return "select";
    }

    @RequestMapping("/roomMessage")
    public String roomMessage(){
        return "roomMessage";
    }

    @RequestMapping("/addRoom")
    public String addRoom(){
        return "addRoom";
    }

    @RequestMapping("/addRent")
    public ModelAndView addRent(){
        List<Room> rooms = roomService.findAll() ;
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addRent");
        modelAndView.addObject("rooms",rooms);
        return modelAndView;
    }

    @RequestMapping("/addRent1")
    public String addRent(MonthRent monthRent){
        System.out.println(monthRent);
        monthRentService.addMonthRent(monthRent);
        return "success";
    }

    @RequestMapping("/addRoom1")
    public String addRoom(Room room){
        if(!room.getRname().isEmpty()){
            roomService.addRoom(room);
            return "success";
        }else{
            return "error";
        }
    }

    /**
     * 根据信息查询月租
     * @param rname 接收房间名字
     * @param month 接收查询月份
     * @return 返回查询到的月租
     */
    @RequestMapping("/find")
    public List<MonthRent> find(String rname, String month){
        System.out.println(rname);
        System.out.println(month);
        if("".equals(rname)){
            if ("".equals(month)){
                System.out.println("1");
                return null;
            }else{
                System.out.println("2");
                List<MonthRent> monthRents = monthRentService.findByMonth(month);
                System.out.println(monthRents);
                return monthRents;
            }
        }else {
            if ("".equals(month)) {
                System.out.println("3");
                Room room = roomService.findByRname(rname);
                List<MonthRent> monthRents = monthRentService.findByRid(room.getId());
                System.out.println(monthRents);
                return monthRents;
            } else {
                System.out.println("4");
                Room room = roomService.findByRname(rname);
                MonthRent monthRent = monthRentService.findOne(room.getId(), month);
                System.out.println(monthRent);
                List<MonthRent> monthRents =null;
                monthRents.add(0,monthRent);
                return monthRents;
            }
        }
    }
}
