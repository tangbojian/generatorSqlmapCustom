package com.taotao.mybatis.model1;

public class Country {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String countryName;

    /**
     * 
     */
    private String countryCode;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return country_name 
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 
     * @param countryName 
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName == null ? null : countryName.trim();
    }

    /**
     * 
     * @return country_code 
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 
     * @param countryCode 
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }
}