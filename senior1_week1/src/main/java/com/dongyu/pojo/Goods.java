/**
 * 
 */
package com.dongyu.pojo;

/**
 * @作者  董宇
 *
 * @时间 :2019年10月9日
 */
public class Goods {
	private  Integer  gid;
	private  String   gname;
	private  double  gprice;
	private  String  gdate;
	private  Integer  bid;
	private  Integer  gdid;
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public double getGprice() {
		return gprice;
	}
	public void setGprice(double gprice) {
		this.gprice = gprice;
	}
	public String getGdate() {
		return gdate;
	}
	public void setGdate(String gdate) {
		this.gdate = gdate;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Integer getGdid() {
		return gdid;
	}
	public void setGdid(Integer gdid) {
		this.gdid = gdid;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", gprice=" + gprice + ", gdate=" + gdate + ", bid=" + bid
				+ ", gdid=" + gdid + "]";
	}
	public Goods(Integer gid, String gname, double gprice, String gdate, Integer bid, Integer gdid) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gprice = gprice;
		this.gdate = gdate;
		this.bid = bid;
		this.gdid = gdid;
	}
	public Goods() {
		super();
	}
	
	
	
	
	

}
