package ljd.dao;

import ljd.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoTest {

    @Autowired
    private IUserDao userDao ;

    @Test
    public void TestFindByUsermame(){
        User user = new User();
        user = userDao.FindByUsermame("张三");
        System.out.println(user);
    }

}
