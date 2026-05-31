package com.javaee.ex08.service;

import com.javaee.ex08.po.Publisher;

import java.util.List;

public interface PublisherService {
    List<Publisher> findPublishers();
    List<Publisher> findByName(String name);
    List<Publisher> findByContacter(String contacter);
}
