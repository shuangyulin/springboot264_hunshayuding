package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 摄影师预约
 *
 * @author 
 * @email
 */
@TableName("sheyingshi_order")
public class SheyingshiOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public SheyingshiOrderEntity() {

	}

	public SheyingshiOrderEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 预约流水号
     */
    @TableField(value = "sheyingshi_order_uuid_number")

    private String sheyingshiOrderUuidNumber;


    /**
     * 摄影师
     */
    @TableField(value = "sheyingshi_id")

    private Integer sheyingshiId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 拍摄地
     */
    @TableField(value = "paishedi_types")

    private Integer paishediTypes;


    /**
     * 定金
     */
    @TableField(value = "sheyingshi_order_true_price")

    private Double sheyingshiOrderTruePrice;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 预约拍摄日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "paishe_time")

    private Date paisheTime;


    /**
     * 预约拍摄时间段
     */
    @TableField(value = "shijianduan_types")

    private Integer shijianduanTypes;


    /**
     * 预约状态
     */
    @TableField(value = "sheyingshi_order_types")

    private Integer sheyingshiOrderTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：预约流水号
	 */
    public String getSheyingshiOrderUuidNumber() {
        return sheyingshiOrderUuidNumber;
    }
    /**
	 * 获取：预约流水号
	 */

    public void setSheyingshiOrderUuidNumber(String sheyingshiOrderUuidNumber) {
        this.sheyingshiOrderUuidNumber = sheyingshiOrderUuidNumber;
    }
    /**
	 * 设置：摄影师
	 */
    public Integer getSheyingshiId() {
        return sheyingshiId;
    }
    /**
	 * 获取：摄影师
	 */

    public void setSheyingshiId(Integer sheyingshiId) {
        this.sheyingshiId = sheyingshiId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：拍摄地
	 */
    public Integer getPaishediTypes() {
        return paishediTypes;
    }
    /**
	 * 获取：拍摄地
	 */

    public void setPaishediTypes(Integer paishediTypes) {
        this.paishediTypes = paishediTypes;
    }
    /**
	 * 设置：定金
	 */
    public Double getSheyingshiOrderTruePrice() {
        return sheyingshiOrderTruePrice;
    }
    /**
	 * 获取：定金
	 */

    public void setSheyingshiOrderTruePrice(Double sheyingshiOrderTruePrice) {
        this.sheyingshiOrderTruePrice = sheyingshiOrderTruePrice;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：预约拍摄日期
	 */
    public Date getPaisheTime() {
        return paisheTime;
    }
    /**
	 * 获取：预约拍摄日期
	 */

    public void setPaisheTime(Date paisheTime) {
        this.paisheTime = paisheTime;
    }
    /**
	 * 设置：预约拍摄时间段
	 */
    public Integer getShijianduanTypes() {
        return shijianduanTypes;
    }
    /**
	 * 获取：预约拍摄时间段
	 */

    public void setShijianduanTypes(Integer shijianduanTypes) {
        this.shijianduanTypes = shijianduanTypes;
    }
    /**
	 * 设置：预约状态
	 */
    public Integer getSheyingshiOrderTypes() {
        return sheyingshiOrderTypes;
    }
    /**
	 * 获取：预约状态
	 */

    public void setSheyingshiOrderTypes(Integer sheyingshiOrderTypes) {
        this.sheyingshiOrderTypes = sheyingshiOrderTypes;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SheyingshiOrder{" +
            "id=" + id +
            ", sheyingshiOrderUuidNumber=" + sheyingshiOrderUuidNumber +
            ", sheyingshiId=" + sheyingshiId +
            ", yonghuId=" + yonghuId +
            ", paishediTypes=" + paishediTypes +
            ", sheyingshiOrderTruePrice=" + sheyingshiOrderTruePrice +
            ", insertTime=" + insertTime +
            ", paisheTime=" + paisheTime +
            ", shijianduanTypes=" + shijianduanTypes +
            ", sheyingshiOrderTypes=" + sheyingshiOrderTypes +
            ", createTime=" + createTime +
        "}";
    }
}
