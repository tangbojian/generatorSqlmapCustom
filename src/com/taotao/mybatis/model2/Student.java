package com.taotao.mybatis.model2;

public class Student {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Integer age;

    /**
     * 
     */
    private Integer teacherId;

    /**
     * 
     */
    private Integer schoolId;

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
     * @return name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 
     * @return age 
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 
     * @param age 
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 
     * @return teacher_id 
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * 
     * @param teacherId 
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * 
     * @return school_id 
     */
    public Integer getSchoolId() {
        return schoolId;
    }

    /**
     * 
     * @param schoolId 
     */
    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }
}