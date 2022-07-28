import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.test.boot.MainApplication;
import com.test.boot.entity.Info;
import com.test.boot.mapper.InfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



import java.util.List;

@SpringBootTest(classes = MainApplication.class)
public class MybatisTest1 {
    @Autowired
    private InfoMapper infoMapper ;
    @Test
     void test1() {
         LambdaQueryWrapper<Info> qw=new LambdaQueryWrapper<Info>();
         qw.eq(Info::getWorker,"张晶");
         List<Info> infos = infoMapper.selectList(qw);
         for (Info info : infos) {
             System.out.println(info);
         }
     }
}
