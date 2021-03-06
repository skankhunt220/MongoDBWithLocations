package com.lootfood.db.entity;

import java.util.Date;
import java.util.TimeZone;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.PostConstruct;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "service")
public class Service {
    @Id
    private String id;
    private String name;
    @CreatedDate
    private Date createdDate;
    @LastModifiedDate
    private Date updateDate;
}
