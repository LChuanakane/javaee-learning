package com.javaee.ex02.mapper;

import com.javaee.ex02.po.Publisher;
import org.apache.ibatis.annotations.Param;

public interface PublisherMapper {
    Publisher findPublisherByPubId(int pubId);//接口返回值不匹配，核查类型以及字段
    void insertPublisher(Publisher publisher);
}
