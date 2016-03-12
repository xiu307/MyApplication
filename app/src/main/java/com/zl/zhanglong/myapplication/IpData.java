package com.zl.zhanglong.myapplication;

/**
 * Created by Hal on 15/4/26.
 */
public class IpData {
	public int code;
	public Data data;

	public IpData() {
	}
	public IpData(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "IpData [ data=" + data.toString() + "]";
	}

	class Data {
		public String country;
		public String country_id;
		public String area;
		public String area_id;
		public String region;
		public String region_id;
		public String city;
		public String city_id;
		public String county;
		public String county_id;
		public String isp;
		public String isp_id;
		public String ip;

		@Override
		public String toString() {
			return "Data [country=" + country + ", country_id=" + country_id
					+ ", area=" + area + ", area_id=" + area_id + ", region="
					+ region + ", region_id=" + region_id + ", city=" + city
					+ ", city_id=" + city_id + ", county=" + county
					+ ", county_id=" + county_id + ", isp=" + isp + ", isp_id="
					+ isp_id + ", ip=" + ip + "]";
		}

	}

}
