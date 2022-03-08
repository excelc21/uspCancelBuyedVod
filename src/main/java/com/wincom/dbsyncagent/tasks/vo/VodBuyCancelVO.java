package com.wincom.dbsyncagent.tasks.vo;

public class VodBuyCancelVO {

	String pvs_sbc_cont_no = ""; 
	String pvs_mac_addr = "";
	String buy_date = "";
	String cnts_cd = "";
	String error_msg = "";
	
	public String getPvs_sbc_cont_no() {
		return pvs_sbc_cont_no;
	}
	public void setPvs_sbc_cont_no(String pvs_sbc_cont_no) {
		this.pvs_sbc_cont_no = pvs_sbc_cont_no;
	}
	public String getPvs_mac_addr() {
		return pvs_mac_addr;
	}
	public void setPvs_mac_addr(String pvs_mac_addr) {
		this.pvs_mac_addr = pvs_mac_addr;
	}
	public String getBuy_date() {
		return buy_date;
	}
	public void setBuy_date(String buy_date) {
		this.buy_date = buy_date;
	}
	public String getCnts_cd() {
		return cnts_cd;
	}
	public void setCnts_cd(String cnts_cd) {
		this.cnts_cd = cnts_cd;
	}
	public String getError_msg() {
		return error_msg;
	}
	public void setError_msg(String error_msg) {
		this.error_msg = error_msg;
	}
	
	
}
