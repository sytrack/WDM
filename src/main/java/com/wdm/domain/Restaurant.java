package com.wdm.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Restaurant {

	@Id
	private Long rseq;
	private String name;
	private char kind;
	private String menu;
	private String address_name;
	private String address_detail;
	private String dong;
	private String content;
	private int likescnt;
	@Temporal(TemporalType.DATE)
	private Date regdate = new Date();
	private String image1;
	private String image2;
	private String image3;
	private String id;
}