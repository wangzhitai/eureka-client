package com.study.dataobject;

import java.util.Date;

public class AccountOuterDO {
    private String id;

    private String uniqueid;

    private String name;

    private Byte licensetype;

    private String licensenumber;

    private Byte status;

    private Byte type;

    private String mobile;

    private String organizeid;

    private String email;

    private String personid;

    private Date createtime;

    private Date modifytime;

    private String orghash;

    private Byte privacy;

    private String language;

    private String esignaccountid;

    private String oauthaccountid;

    private String esignorgid;

    private String esignrealnameflowid;

    private String loginmobile;

    private String loginemail;

    private String cardno;

    private Byte isguided;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUniqueid() {
        return uniqueid;
    }

    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid == null ? null : uniqueid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getLicensetype() {
        return licensetype;
    }

    public void setLicensetype(Byte licensetype) {
        this.licensetype = licensetype;
    }

    public String getLicensenumber() {
        return licensenumber;
    }

    public void setLicensenumber(String licensenumber) {
        this.licensenumber = licensenumber == null ? null : licensenumber.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getOrganizeid() {
        return organizeid;
    }

    public void setOrganizeid(String organizeid) {
        this.organizeid = organizeid == null ? null : organizeid.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid == null ? null : personid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public String getOrghash() {
        return orghash;
    }

    public void setOrghash(String orghash) {
        this.orghash = orghash == null ? null : orghash.trim();
    }

    public Byte getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Byte privacy) {
        this.privacy = privacy;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getEsignaccountid() {
        return esignaccountid;
    }

    public void setEsignaccountid(String esignaccountid) {
        this.esignaccountid = esignaccountid == null ? null : esignaccountid.trim();
    }

    public String getOauthaccountid() {
        return oauthaccountid;
    }

    public void setOauthaccountid(String oauthaccountid) {
        this.oauthaccountid = oauthaccountid == null ? null : oauthaccountid.trim();
    }

    public String getEsignorgid() {
        return esignorgid;
    }

    public void setEsignorgid(String esignorgid) {
        this.esignorgid = esignorgid == null ? null : esignorgid.trim();
    }

    public String getEsignrealnameflowid() {
        return esignrealnameflowid;
    }

    public void setEsignrealnameflowid(String esignrealnameflowid) {
        this.esignrealnameflowid = esignrealnameflowid == null ? null : esignrealnameflowid.trim();
    }

    public String getLoginmobile() {
        return loginmobile;
    }

    public void setLoginmobile(String loginmobile) {
        this.loginmobile = loginmobile == null ? null : loginmobile.trim();
    }

    public String getLoginemail() {
        return loginemail;
    }

    public void setLoginemail(String loginemail) {
        this.loginemail = loginemail == null ? null : loginemail.trim();
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    public Byte getIsguided() {
        return isguided;
    }

    public void setIsguided(Byte isguided) {
        this.isguided = isguided;
    }
}