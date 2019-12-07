package com.ljd.controller;

import com.ljd.domain.Room;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

@Controller
@RequestMapping("/Room")
public class RoomController {

    @RequestMapping("/startRoom")
    public String startRoom(){
        System.out.println("成功");
        return "success" ;

    }

    @RequestMapping("/testAjax")
    public @ResponseBody Room testAjax(@RequestBody Room room) {
        System.out.println("执行了");
        System.out.println(room);
        room.setRname("22");
        room.setTenant("2222");
        room.setPhonenum(111252);
        return room ;

    }

    @RequestMapping("/testUpload")
    
    public String testUpload(HttpServletRequest request, MultipartFile upload) throws Exception{
        System.out.println("上传了");
        String path = request.getSession().getServletContext().getRealPath("/uploads");
        File file = new File(path) ;
        if (!file.exists()){
            file.mkdirs()
        }
        String filename = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        filename = uuid + "_" + filename ;
        upload.transferTo(new File(path,filename));
        return "success" ;
    }

}
