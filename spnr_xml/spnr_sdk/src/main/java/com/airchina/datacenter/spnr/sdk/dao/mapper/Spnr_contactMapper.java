package com.airchina.datacenter.spnr.sdk.dao.mapper;

import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_contactPo;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface Spnr_contactMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Spnr_contact
     *
     * @mbg.generated
     */
    @Insert({
        "insert into Spnr_contact (super_pnr_id, audit_id, ",
        "customer_id, seq_no, ",
        "historic, account_type, ",
        "oj_super_pnr_rph, passenger_type_code, ",
        "`name`, telephone, ",
        "email, address_formatted_ind, ",
        "address_lineindex, city_name, ",
        "postal_code, country_name, ",
        "contactname, contact_prefix, ",
        "contact_tel, contact_email, ",
        "contact_doc_id, contact_doc_type, ",
        "contact_doc_nationality, contact_doc_expire_date, ",
        "unique_id, unique_id_context)",
        "values (#{superPnrId,jdbcType=VARCHAR}, #{auditId,jdbcType=INTEGER}, ",
        "#{customerId,jdbcType=VARCHAR}, #{seqNo,jdbcType=BIGINT}, ",
        "#{historic,jdbcType=VARCHAR}, #{accountType,jdbcType=INTEGER}, ",
        "#{ojSuperPnrRph,jdbcType=INTEGER}, #{passengerTypeCode,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{telephone,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{addressFormattedInd,jdbcType=VARCHAR}, ",
        "#{addressLineindex,jdbcType=INTEGER}, #{cityName,jdbcType=VARCHAR}, ",
        "#{postalCode,jdbcType=VARCHAR}, #{countryName,jdbcType=VARCHAR}, ",
        "#{contactname,jdbcType=VARCHAR}, #{contactPrefix,jdbcType=VARCHAR}, ",
        "#{contactTel,jdbcType=VARCHAR}, #{contactEmail,jdbcType=VARCHAR}, ",
        "#{contactDocId,jdbcType=VARCHAR}, #{contactDocType,jdbcType=VARCHAR}, ",
        "#{contactDocNationality,jdbcType=VARCHAR}, #{contactDocExpireDate,jdbcType=VARCHAR}, ",
        "#{uniqueId,jdbcType=VARCHAR}, #{uniqueIdContext,jdbcType=VARCHAR})"
    })
    int insert(Spnr_contactPo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Spnr_contact
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "super_pnr_id, audit_id, customer_id, seq_no, historic, account_type, oj_super_pnr_rph, ",
        "passenger_type_code, `name`, telephone, email, address_formatted_ind, address_lineindex, ",
        "city_name, postal_code, country_name, contactname, contact_prefix, contact_tel, ",
        "contact_email, contact_doc_id, contact_doc_type, contact_doc_nationality, contact_doc_expire_date, ",
        "unique_id, unique_id_context",
        "from Spnr_contact"
    })
    @Results({
        @Result(column="super_pnr_id", property="superPnrId", jdbcType=JdbcType.VARCHAR),
        @Result(column="audit_id", property="auditId", jdbcType=JdbcType.INTEGER),
        @Result(column="customer_id", property="customerId", jdbcType=JdbcType.VARCHAR),
        @Result(column="seq_no", property="seqNo", jdbcType=JdbcType.BIGINT),
        @Result(column="historic", property="historic", jdbcType=JdbcType.VARCHAR),
        @Result(column="account_type", property="accountType", jdbcType=JdbcType.INTEGER),
        @Result(column="oj_super_pnr_rph", property="ojSuperPnrRph", jdbcType=JdbcType.INTEGER),
        @Result(column="passenger_type_code", property="passengerTypeCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="telephone", property="telephone", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="address_formatted_ind", property="addressFormattedInd", jdbcType=JdbcType.VARCHAR),
        @Result(column="address_lineindex", property="addressLineindex", jdbcType=JdbcType.INTEGER),
        @Result(column="city_name", property="cityName", jdbcType=JdbcType.VARCHAR),
        @Result(column="postal_code", property="postalCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="country_name", property="countryName", jdbcType=JdbcType.VARCHAR),
        @Result(column="contactname", property="contactname", jdbcType=JdbcType.VARCHAR),
        @Result(column="contact_prefix", property="contactPrefix", jdbcType=JdbcType.VARCHAR),
        @Result(column="contact_tel", property="contactTel", jdbcType=JdbcType.VARCHAR),
        @Result(column="contact_email", property="contactEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="contact_doc_id", property="contactDocId", jdbcType=JdbcType.VARCHAR),
        @Result(column="contact_doc_type", property="contactDocType", jdbcType=JdbcType.VARCHAR),
        @Result(column="contact_doc_nationality", property="contactDocNationality", jdbcType=JdbcType.VARCHAR),
        @Result(column="contact_doc_expire_date", property="contactDocExpireDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="unique_id", property="uniqueId", jdbcType=JdbcType.VARCHAR),
        @Result(column="unique_id_context", property="uniqueIdContext", jdbcType=JdbcType.VARCHAR)
    })
    List<Spnr_contactPo> selectAll();
}