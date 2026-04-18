package com.javaee.ex02;

import com.javaee.ex02.mapper.PublisherMapper;
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
    @Test
    public void insertPublisherTest(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Publisher publisher = new Publisher();
        publisher.setPubName("电子工业出版社");
        publisher.setContactor("黄榜益");
        publisher.setMobile("13544784579");
        sqlSession.insert(
                "com.javaee.ex02.mapper.PublisherMapper.insertPublisher", publisher);
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void queryPublisher(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int pubId = 1;
        PublisherMapper mapper = sqlSession.getMapper(PublisherMapper.class);
        Publisher publisherByPubId = mapper.findPublisherByPubId(pubId);
        if(publisherByPubId == null){
            throw new RuntimeException("该id对应记录不存在");
        }

        System.out.println(publisherByPubId);

        sqlSession.commit();
        sqlSession.close();
    }

}



