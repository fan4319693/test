package com.airchina.datacenter.spnr.sdk.dao.mapper;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_PaymentDetailsPo;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface Spnr_PaymentDetailsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Spnr_PaymentDetails
     *
     * @mbg.generated
     */
    @Insert({
        "insert into Spnr_PaymentDetails (super_pnr_id, balance_amt, ",
        "balance_currency, payments_amt, ",
        "payments_currency, actual_amt, ",
        "last_modified)",
        "values (#{superPnrId,jdbcType=VARCHAR}, #{balanceAmt,jdbcType=DOUBLE}, ",
        "#{balanceCurrency,jdbcType=VARCHAR}, #{paymentsAmt,jdbcType=DOUBLE}, ",
        "#{paymentsCurrency,jdbcType=VARCHAR}, #{actualAmt,jdbcType=DOUBLE}, ",
        "#{lastModified,jdbcType=VARCHAR})"
    })
    int insert(Spnr_PaymentDetailsPo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Spnr_PaymentDetails
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "super_pnr_id, balance_amt, balance_currency, payments_amt, payments_currency, ",
        "actual_amt, last_modified",
        "from Spnr_PaymentDetails"
    })
    @Results({
        @Result(column="super_pnr_id", property="superPnrId", jdbcType=JdbcType.VARCHAR),
        @Result(column="balance_amt", property="balanceAmt", jdbcType=JdbcType.DOUBLE),
        @Result(column="balance_currency", property="balanceCurrency", jdbcType=JdbcType.VARCHAR),
        @Result(column="payments_amt", property="paymentsAmt", jdbcType=JdbcType.DOUBLE),
        @Result(column="payments_currency", property="paymentsCurrency", jdbcType=JdbcType.VARCHAR),
        @Result(column="actual_amt", property="actualAmt", jdbcType=JdbcType.DOUBLE),
        @Result(column="last_modified", property="lastModified", jdbcType=JdbcType.VARCHAR)
    })
    List<Spnr_PaymentDetailsPo> selectAll();
}