package com.javaee.ex02.mapper;

import com.javaee.ex02.po.Publisher;

public interface PublisherMapper {
    Publisher findPublisherByPubId(int pubId);
}
