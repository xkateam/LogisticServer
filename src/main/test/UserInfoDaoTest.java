import com.hp.pojo.UserInfo;
import com.hp.service.impl.UserInfoServiceImpl;
import org.apache.ibatis.io.Resources;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserInfoDaoTest {
    @Test
    public void selectById(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/beans.xml");
        UserInfoServiceImpl userInfoService =(UserInfoServiceImpl) ctx.getBean("userInfoServiceImpl");
        UserInfo userInfo = userInfoService.selectById("1");
        System.out.println("username:"+userInfo.getUserName());
        System.out.println("userPwd:"+userInfo.getUserPwd());
    }
}
