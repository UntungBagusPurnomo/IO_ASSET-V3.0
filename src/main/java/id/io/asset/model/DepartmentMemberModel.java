/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.io.asset.model;

/**
 *
 * @author permadi
 */
public class DepartmentMemberModel {
    
    private String memberid;
    private String membercode;
    private String membername;
    private String email;
    private String imageaddress;
    private String description;
    private String levelid;
    private String departmentid;
    private boolean isadmin;
    private boolean isactive;

    public DepartmentMemberModel() {
    }

    public DepartmentMemberModel(String memberid, String membercode, String membername, String email, String imageaddress, String description, String levelid, String departmentid, boolean isadmin, boolean isactive) {
        this.memberid = memberid;
        this.membercode = membercode;
        this.membername = membername;
        this.email = email;
        this.imageaddress = imageaddress;
        this.description = description;
        this.levelid = levelid;
        this.departmentid = departmentid;
        this.isadmin = isadmin;
        this.isactive = isactive;
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getMembercode() {
        return membercode;
    }

    public void setMembercode(String membercode) {
        this.membercode = membercode;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageaddress() {
        return imageaddress;
    }

    public void setImageaddress(String imageaddress) {
        this.imageaddress = imageaddress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLevelid() {
        return levelid;
    }

    public void setLevelid(String levelid) {
        this.levelid = levelid;
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }

    public boolean isIsadmin() {
        return isadmin;
    }

    public void setIsadmin(boolean isadmin) {
        this.isadmin = isadmin;
    }

    public boolean isIsactive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }
    
    
    
}
