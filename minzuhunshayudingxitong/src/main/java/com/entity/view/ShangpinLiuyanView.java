package com.entity.view;

import com.entity.ShangpinLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 作品留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shangpin_liuyan")
public class ShangpinLiuyanView extends ShangpinLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 shangpin
			/**
			* 作品 的 摄影师
			*/
			private Integer shangpinSheyingshiId;
			/**
			* 作品名称
			*/
			private String shangpinName;
			/**
			* 作品编号
			*/
			private String shangpinUuidNumber;
			/**
			* 作品照片
			*/
			private String shangpinPhoto;
			/**
			* 拍摄时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date paisheTime;
			/**
			* 拍摄地
			*/
			private Integer paishediTypes;
				/**
				* 拍摄地的值
				*/
				private String paishediValue;
			/**
			* 作品类型
			*/
			private Integer shangpinTypes;
				/**
				* 作品类型的值
				*/
				private String shangpinValue;
			/**
			* 点击次数
			*/
			private Integer shangpinClicknum;
			/**
			* 作品介绍
			*/
			private String shangpinContent;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer shangpinDelete;

		//级联表 yonghu
			/**
			* 用户唯一编号
			*/
			private String yonghuUuidNumber;
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

	public ShangpinLiuyanView() {

	}

	public ShangpinLiuyanView(ShangpinLiuyanEntity shangpinLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, shangpinLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}













				//级联表的get和set shangpin

					/**
					* 获取：作品 的 摄影师
					*/
					public Integer getShangpinSheyingshiId() {
						return shangpinSheyingshiId;
					}
					/**
					* 设置：作品 的 摄影师
					*/
					public void setShangpinSheyingshiId(Integer shangpinSheyingshiId) {
						this.shangpinSheyingshiId = shangpinSheyingshiId;
					}


					/**
					* 获取： 作品名称
					*/
					public String getShangpinName() {
						return shangpinName;
					}
					/**
					* 设置： 作品名称
					*/
					public void setShangpinName(String shangpinName) {
						this.shangpinName = shangpinName;
					}

					/**
					* 获取： 作品编号
					*/
					public String getShangpinUuidNumber() {
						return shangpinUuidNumber;
					}
					/**
					* 设置： 作品编号
					*/
					public void setShangpinUuidNumber(String shangpinUuidNumber) {
						this.shangpinUuidNumber = shangpinUuidNumber;
					}

					/**
					* 获取： 作品照片
					*/
					public String getShangpinPhoto() {
						return shangpinPhoto;
					}
					/**
					* 设置： 作品照片
					*/
					public void setShangpinPhoto(String shangpinPhoto) {
						this.shangpinPhoto = shangpinPhoto;
					}

					/**
					* 获取： 拍摄时间
					*/
					public Date getPaisheTime() {
						return paisheTime;
					}
					/**
					* 设置： 拍摄时间
					*/
					public void setPaisheTime(Date paisheTime) {
						this.paisheTime = paisheTime;
					}

					/**
					* 获取： 拍摄地
					*/
					public Integer getPaishediTypes() {
						return paishediTypes;
					}
					/**
					* 设置： 拍摄地
					*/
					public void setPaishediTypes(Integer paishediTypes) {
						this.paishediTypes = paishediTypes;
					}


						/**
						* 获取： 拍摄地的值
						*/
						public String getPaishediValue() {
							return paishediValue;
						}
						/**
						* 设置： 拍摄地的值
						*/
						public void setPaishediValue(String paishediValue) {
							this.paishediValue = paishediValue;
						}

					/**
					* 获取： 作品类型
					*/
					public Integer getShangpinTypes() {
						return shangpinTypes;
					}
					/**
					* 设置： 作品类型
					*/
					public void setShangpinTypes(Integer shangpinTypes) {
						this.shangpinTypes = shangpinTypes;
					}


						/**
						* 获取： 作品类型的值
						*/
						public String getShangpinValue() {
							return shangpinValue;
						}
						/**
						* 设置： 作品类型的值
						*/
						public void setShangpinValue(String shangpinValue) {
							this.shangpinValue = shangpinValue;
						}

					/**
					* 获取： 点击次数
					*/
					public Integer getShangpinClicknum() {
						return shangpinClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setShangpinClicknum(Integer shangpinClicknum) {
						this.shangpinClicknum = shangpinClicknum;
					}

					/**
					* 获取： 作品介绍
					*/
					public String getShangpinContent() {
						return shangpinContent;
					}
					/**
					* 设置： 作品介绍
					*/
					public void setShangpinContent(String shangpinContent) {
						this.shangpinContent = shangpinContent;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getShangpinDelete() {
						return shangpinDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setShangpinDelete(Integer shangpinDelete) {
						this.shangpinDelete = shangpinDelete;
					}






















				//级联表的get和set yonghu

					/**
					* 获取： 用户唯一编号
					*/
					public String getYonghuUuidNumber() {
						return yonghuUuidNumber;
					}
					/**
					* 设置： 用户唯一编号
					*/
					public void setYonghuUuidNumber(String yonghuUuidNumber) {
						this.yonghuUuidNumber = yonghuUuidNumber;
					}

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}






}
