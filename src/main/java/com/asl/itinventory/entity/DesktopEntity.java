package com.asl.itinventory.entity;
@Data
@Entity
@Table(name = "desktop", schema = "inventory")
public class DesktopEntity {
    @Id
    @GeneratedValue(generator = "desktop_seq")
    @SequenceGenerator(name = "desktop_seq",schema = "inventory", sequenceName = "desktop_seq", initialValue = 1, allocationSize = 1)
    private Long desktopId;
    private String userName;
    private String sfid;
    private Long desktopSno;
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
