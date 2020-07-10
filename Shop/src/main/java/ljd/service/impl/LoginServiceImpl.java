package ljd.service.impl;

import com.sun.org.apache.xpath.internal.SourceTree;
import ljd.dao.IUserDao;
import ljd.domain.User;
import ljd.service.ILoginService;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements ILoginService {

    @Autowired
    private  IUserDao userDao ;

    @Override
    public Boolean Login(String Username,String Password) {
        User user = userDao.FindByUsermame(Username);
        if ( user!=null ){
            if (user.getPassword().equals(Password)){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
        /*System.out.println("成功");
        return true;*/
    }
}
