package com.airchina.datacenter.spnr.sdk.dao.entity;

/**
 * Database Table Remarks:
 *   存储联系人信息
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table Spnr_contact
 */
public class Spnr_contactPo {
    /**
     * Database Column Remarks:
     *   SPNR ID，唯一标识
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.super_pnr_id
     *
     * @mbg.generated
     */
    private String superPnrId;

    /**
     * Database Column Remarks:
     *   此Customer节点增加、修改时的Au
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.audit_id
     *
     * @mbg.generated
     */
    private Integer auditId;

    /**
     * Database Column Remarks:
     *   Customer节点在该SPNR内的唯一
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.customer_id
     *
     * @mbg.generated
     */
    private String customerId;

    /**
     * Database Column Remarks:
     *   仅用于数据库记录的特定用途
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.seq_no
     *
     * @mbg.generated
     */
    private Long seqNo;

    /**
     * Database Column Remarks:
     *   该Customer节点是否生效。true
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.historic
     *
     * @mbg.generated
     */
    private String historic;

    /**
     * Database Column Remarks:
     *   旅客类型，1代表注册用户，2代表游客
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.account_type
     *
     * @mbg.generated
     */
    private Integer accountType;

    /**
     * Database Column Remarks:
     *   联系人在SPNR内的序号，SPNR内唯一
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.oj_super_pnr_rph
     *
     * @mbg.generated
     */
    private Integer ojSuperPnrRph;

    /**
     * Database Column Remarks:
     *   联系人类型，默认为ADT（成人）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.passenger_type_code
     *
     * @mbg.generated
     */
    private String passengerTypeCode;

    /**
     * Database Column Remarks:
     *   联系人姓名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   联系人电话 存储联系电话，由@Phon
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.telephone
     *
     * @mbg.generated
     */
    private String telephone;

    /**
     * Database Column Remarks:
     *   联系人邮箱
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     * Database Column Remarks:
     *   联系人地址是否格式化
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.address_formatted_ind
     *
     * @mbg.generated
     */
    private String addressFormattedInd;

    /**
     * Database Column Remarks:
     *   nan
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.address_lineindex
     *
     * @mbg.generated
     */
    private Integer addressLineindex;

    /**
     * Database Column Remarks:
     *   联系人所在城市名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.city_name
     *
     * @mbg.generated
     */
    private String cityName;

    /**
     * Database Column Remarks:
     *   联系人所在地邮编
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.postal_code
     *
     * @mbg.generated
     */
    private String postalCode;

    /**
     * Database Column Remarks:
     *   联系人所在地国家码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.country_name
     *
     * @mbg.generated
     */
    private String countryName;

    /**
     * Database Column Remarks:
     *   当前账号拥有者的姓名 Surname：中
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.contactname
     *
     * @mbg.generated
     */
    private String contactname;

    /**
     * Database Column Remarks:
     *   当前账号拥有者的称谓 (例如, Mr.,
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.contact_prefix
     *
     * @mbg.generated
     */
    private String contactPrefix;

    /**
     * Database Column Remarks:
     *    存储当前账号拥有者的联系电话，由@Ph
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.contact_tel
     *
     * @mbg.generated
     */
    private String contactTel;

    /**
     * Database Column Remarks:
     *   当前账号拥有者的联系邮箱
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.contact_email
     *
     * @mbg.generated
     */
    private String contactEmail;

    /**
     * Database Column Remarks:
     *   当前账号拥有者的证件号码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.contact_doc_id
     *
     * @mbg.generated
     */
    private String contactDocId;

    /**
     * Database Column Remarks:
     *   当前账号拥有者的证件类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.contact_doc_type
     *
     * @mbg.generated
     */
    private String contactDocType;

    /**
     * Database Column Remarks:
     *   当前账号拥有者的证件签发国
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.contact_doc_nationality
     *
     * @mbg.generated
     */
    private String contactDocNationality;

    /**
     * Database Column Remarks:
     *   当前账号拥有者的证件过期日期
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.contact_doc_expire_date
     *
     * @mbg.generated
     */
    private String contactDocExpireDate;

    /**
     * Database Column Remarks:
     *   该SPNR所属账号ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.unique_id
     *
     * @mbg.generated
     */
    private String uniqueId;

    /**
     * Database Column Remarks:
     *   账号来源
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Spnr_contact.unique_id_context
     *
     * @mbg.generated
     */
    private String uniqueIdContext;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.super_pnr_id
     *
     * @return the value of Spnr_contact.super_pnr_id
     *
     * @mbg.generated
     */
    public String getSuperPnrId() {
        return superPnrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.super_pnr_id
     *
     * @param superPnrId the value for Spnr_contact.super_pnr_id
     *
     * @mbg.generated
     */
    public void setSuperPnrId(String superPnrId) {
        this.superPnrId = superPnrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.audit_id
     *
     * @return the value of Spnr_contact.audit_id
     *
     * @mbg.generated
     */
    public Integer getAuditId() {
        return auditId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.audit_id
     *
     * @param auditId the value for Spnr_contact.audit_id
     *
     * @mbg.generated
     */
    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.customer_id
     *
     * @return the value of Spnr_contact.customer_id
     *
     * @mbg.generated
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.customer_id
     *
     * @param customerId the value for Spnr_contact.customer_id
     *
     * @mbg.generated
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.seq_no
     *
     * @return the value of Spnr_contact.seq_no
     *
     * @mbg.generated
     */
    public Long getSeqNo() {
        return seqNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.seq_no
     *
     * @param seqNo the value for Spnr_contact.seq_no
     *
     * @mbg.generated
     */
    public void setSeqNo(Long seqNo) {
        this.seqNo = seqNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.historic
     *
     * @return the value of Spnr_contact.historic
     *
     * @mbg.generated
     */
    public String getHistoric() {
        return historic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.historic
     *
     * @param historic the value for Spnr_contact.historic
     *
     * @mbg.generated
     */
    public void setHistoric(String historic) {
        this.historic = historic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.account_type
     *
     * @return the value of Spnr_contact.account_type
     *
     * @mbg.generated
     */
    public Integer getAccountType() {
        return accountType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.account_type
     *
     * @param accountType the value for Spnr_contact.account_type
     *
     * @mbg.generated
     */
    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.oj_super_pnr_rph
     *
     * @return the value of Spnr_contact.oj_super_pnr_rph
     *
     * @mbg.generated
     */
    public Integer getOjSuperPnrRph() {
        return ojSuperPnrRph;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.oj_super_pnr_rph
     *
     * @param ojSuperPnrRph the value for Spnr_contact.oj_super_pnr_rph
     *
     * @mbg.generated
     */
    public void setOjSuperPnrRph(Integer ojSuperPnrRph) {
        this.ojSuperPnrRph = ojSuperPnrRph;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.passenger_type_code
     *
     * @return the value of Spnr_contact.passenger_type_code
     *
     * @mbg.generated
     */
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.passenger_type_code
     *
     * @param passengerTypeCode the value for Spnr_contact.passenger_type_code
     *
     * @mbg.generated
     */
    public void setPassengerTypeCode(String passengerTypeCode) {
        this.passengerTypeCode = passengerTypeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.name
     *
     * @return the value of Spnr_contact.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.name
     *
     * @param name the value for Spnr_contact.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.telephone
     *
     * @return the value of Spnr_contact.telephone
     *
     * @mbg.generated
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.telephone
     *
     * @param telephone the value for Spnr_contact.telephone
     *
     * @mbg.generated
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.email
     *
     * @return the value of Spnr_contact.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.email
     *
     * @param email the value for Spnr_contact.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.address_formatted_ind
     *
     * @return the value of Spnr_contact.address_formatted_ind
     *
     * @mbg.generated
     */
    public String getAddressFormattedInd() {
        return addressFormattedInd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.address_formatted_ind
     *
     * @param addressFormattedInd the value for Spnr_contact.address_formatted_ind
     *
     * @mbg.generated
     */
    public void setAddressFormattedInd(String addressFormattedInd) {
        this.addressFormattedInd = addressFormattedInd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.address_lineindex
     *
     * @return the value of Spnr_contact.address_lineindex
     *
     * @mbg.generated
     */
    public Integer getAddressLineindex() {
        return addressLineindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.address_lineindex
     *
     * @param addressLineindex the value for Spnr_contact.address_lineindex
     *
     * @mbg.generated
     */
    public void setAddressLineindex(Integer addressLineindex) {
        this.addressLineindex = addressLineindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.city_name
     *
     * @return the value of Spnr_contact.city_name
     *
     * @mbg.generated
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.city_name
     *
     * @param cityName the value for Spnr_contact.city_name
     *
     * @mbg.generated
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.postal_code
     *
     * @return the value of Spnr_contact.postal_code
     *
     * @mbg.generated
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.postal_code
     *
     * @param postalCode the value for Spnr_contact.postal_code
     *
     * @mbg.generated
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.country_name
     *
     * @return the value of Spnr_contact.country_name
     *
     * @mbg.generated
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.country_name
     *
     * @param countryName the value for Spnr_contact.country_name
     *
     * @mbg.generated
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.contactname
     *
     * @return the value of Spnr_contact.contactname
     *
     * @mbg.generated
     */
    public String getContactname() {
        return contactname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.contactname
     *
     * @param contactname the value for Spnr_contact.contactname
     *
     * @mbg.generated
     */
    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.contact_prefix
     *
     * @return the value of Spnr_contact.contact_prefix
     *
     * @mbg.generated
     */
    public String getContactPrefix() {
        return contactPrefix;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.contact_prefix
     *
     * @param contactPrefix the value for Spnr_contact.contact_prefix
     *
     * @mbg.generated
     */
    public void setContactPrefix(String contactPrefix) {
        this.contactPrefix = contactPrefix;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.contact_tel
     *
     * @return the value of Spnr_contact.contact_tel
     *
     * @mbg.generated
     */
    public String getContactTel() {
        return contactTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.contact_tel
     *
     * @param contactTel the value for Spnr_contact.contact_tel
     *
     * @mbg.generated
     */
    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.contact_email
     *
     * @return the value of Spnr_contact.contact_email
     *
     * @mbg.generated
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.contact_email
     *
     * @param contactEmail the value for Spnr_contact.contact_email
     *
     * @mbg.generated
     */
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.contact_doc_id
     *
     * @return the value of Spnr_contact.contact_doc_id
     *
     * @mbg.generated
     */
    public String getContactDocId() {
        return contactDocId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.contact_doc_id
     *
     * @param contactDocId the value for Spnr_contact.contact_doc_id
     *
     * @mbg.generated
     */
    public void setContactDocId(String contactDocId) {
        this.contactDocId = contactDocId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.contact_doc_type
     *
     * @return the value of Spnr_contact.contact_doc_type
     *
     * @mbg.generated
     */
    public String getContactDocType() {
        return contactDocType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.contact_doc_type
     *
     * @param contactDocType the value for Spnr_contact.contact_doc_type
     *
     * @mbg.generated
     */
    public void setContactDocType(String contactDocType) {
        this.contactDocType = contactDocType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.contact_doc_nationality
     *
     * @return the value of Spnr_contact.contact_doc_nationality
     *
     * @mbg.generated
     */
    public String getContactDocNationality() {
        return contactDocNationality;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.contact_doc_nationality
     *
     * @param contactDocNationality the value for Spnr_contact.contact_doc_nationality
     *
     * @mbg.generated
     */
    public void setContactDocNationality(String contactDocNationality) {
        this.contactDocNationality = contactDocNationality;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.contact_doc_expire_date
     *
     * @return the value of Spnr_contact.contact_doc_expire_date
     *
     * @mbg.generated
     */
    public String getContactDocExpireDate() {
        return contactDocExpireDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.contact_doc_expire_date
     *
     * @param contactDocExpireDate the value for Spnr_contact.contact_doc_expire_date
     *
     * @mbg.generated
     */
    public void setContactDocExpireDate(String contactDocExpireDate) {
        this.contactDocExpireDate = contactDocExpireDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.unique_id
     *
     * @return the value of Spnr_contact.unique_id
     *
     * @mbg.generated
     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.unique_id
     *
     * @param uniqueId the value for Spnr_contact.unique_id
     *
     * @mbg.generated
     */
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Spnr_contact.unique_id_context
     *
     * @return the value of Spnr_contact.unique_id_context
     *
     * @mbg.generated
     */
    public String getUniqueIdContext() {
        return uniqueIdContext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Spnr_contact.unique_id_context
     *
     * @param uniqueIdContext the value for Spnr_contact.unique_id_context
     *
     * @mbg.generated
     */
    public void setUniqueIdContext(String uniqueIdContext) {
        this.uniqueIdContext = uniqueIdContext;
    }
}