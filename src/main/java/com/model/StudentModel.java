package com.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;


public class StudentModel {
	    public String country;
	    public ArrayList<String> web_pages;
	    public String alpha_two_code;
	    public ArrayList<String> domains;
	    @JsonProperty("state-province")
	    public String stateprovince;
	    public String name;
	    
	    
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public ArrayList<String> getWeb_pages() {
			return web_pages;
		}
		public void setWeb_pages(ArrayList<String> web_pages) {
			this.web_pages = web_pages;
		}
		public String getAlpha_two_code() {
			return alpha_two_code;
		}
		public void setAlpha_two_code(String alpha_two_code) {
			this.alpha_two_code = alpha_two_code;
		}
		public ArrayList<String> getDomains() {
			return domains;
		}
		public void setDomains(ArrayList<String> domains) {
			this.domains = domains;
		}
		public String getStateprovince() {
			return stateprovince;
		}
		public void setStateprovince(String stateprovince) {
			this.stateprovince = stateprovince;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "StudentModel [country=" + country + ", web_pages=" + web_pages + ", alpha_two_code="
					+ alpha_two_code + ", domains=" + domains + ", stateprovince=" + stateprovince + ", name=" + name
					+ "]";
		}
	}

