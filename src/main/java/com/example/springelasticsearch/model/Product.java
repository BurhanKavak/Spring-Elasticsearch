package com.example.springelasticsearch.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "product")
@Data
public class Product {

    @Id
    private Long id;

    @Field(name = "name",type = FieldType.Text)
    private String name;

    @Field(name = "description",type = FieldType.Text)
    private String description;

    @Field(name = "price",type = FieldType.Integer)
    private int price;
}
