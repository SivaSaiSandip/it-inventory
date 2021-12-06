package com.asl.itinventory.model;

import lombok.Data;

import java.util.Date;

@Data
public class TransferModel {
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
