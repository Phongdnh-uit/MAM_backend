package com.se114p12.backend.neo4j.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@Getter
@Setter
@RelationshipProperties
public class BoughtWithRelationship {

  @Id @GeneratedValue private String id;

  private Long count;

  @TargetNode private ProductNode product;
}
