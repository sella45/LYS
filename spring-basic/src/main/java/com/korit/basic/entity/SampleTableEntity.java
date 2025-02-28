package com.korit.basic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

// Entity: RDBS의 테이블과 매핑되는 ORM(JPA)의 클래스 
// - 웹 애플리케이션 서버에서 데이터베이스 서버와 데이터 전송 및 관리를 위한 객체 

// @Entity: 
// - 해당 클래스를 Entity 클래스로 지정하는 어노테이션
// - JPA에서 데이터 관리를 위해 사용되는 주된 객체 
// - name 속성: Entity를 사용할 때 이름을 지정할 수 있음 

@Entity(name="sample_table_1")
// @Table: 
// - 해당 Entity 클래스를 RDBS의 테이블과 매핑하는 어노테이션 
// - 만약 java의 클래스명과 RDBS의 테이블명이 동일하다면 유추하여 매핑
// - name 속성 : 클래스명과 테이블명이 서로 다를 때 직접 테이블명을 직접 명시하는 속성 
@Table(name="sample_table_1")
public class SampleTableEntity {
    
    private String pkColumn;

    private Integer sampleColumn_1;

    private Boolean sampleColumn2;
}
