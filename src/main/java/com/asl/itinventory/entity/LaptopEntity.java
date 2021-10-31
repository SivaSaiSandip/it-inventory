package com.asl.itinventory.entity;
@Data
@Entity
@Table(name = "laptop", schema = "inventory")
public class LaptopEntity {
  @Id
    @GeneratedValue(generator = "laptop_seq")
    @SequenceGenerator(name = "laptop_seq",schema = "inventory", sequenceName = "laptop_seq", initialValue = 1, allocationSize = 1)
    private Long laptopId;
    private String userName;
    private String sfid;
    private Long laptopSno;
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
