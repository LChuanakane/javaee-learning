package java.com.javaee.ex02;

import com.javaee.ex02.po.Publisher;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.Reader;
@FixMethodOrder(MethodSorters.JVM)
public class PublisherMapperTest {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void createSqlSessionFactory(){
        try {
            Reader reader = Resources.getResourceAsReader("config/mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   @Test
    public void findPublisherByPubIdTest() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Publisher publisher = sqlSession.selectOne(
                "com.javaee.ex02.mapper.PublisherMapper.findPublisherByPubId", 1);
        System.out.println(publisher);
        sqlSession.close();
    }
}
