package com.asl.itinventory.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "transfer", schema = "inventory")
public class TransferEntity {
    @Id
    @GeneratedValue(generator = "transfer_seq")
    @SequenceGenerator(name = "transfer_seq",schema = "inventory", sequenceName = "transfer_seq", initialValue = 1, allocationSize = 1)
    private Long transferId;
    private String category;
    private String userName;
    private String sfid;
    private Long sno;
    private String model;
    private String designation;
    private String mobile;
    private String officeMobile;
    private String division;
    private Date purchasedOn;
    private Date warrantyUpto;
    private String itemCode;
    private String price;
    private String remark;
}
