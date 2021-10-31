package com.asl.itinventory.entity;
@Data
@Entity
@Table(name = "printer", schema = "inventory")
public class PrinterEntity {
  @Id
    @GeneratedValue(generator = "printer_seq")
    @SequenceGenerator(name = "printer_seq",schema = "inventory", sequenceName = "printer_seq", initialValue = 1, allocationSize = 1)
    private Long printerId;
    private String userName;
    private String sfid;
    private Long printerSno;
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
