package com.hongtu.slice.db.model.generated;

public class Subject {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_subject.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_subject.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_subject.address
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_subject.synopsis
     *
     * @mbggenerated
     */
    private String synopsis;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_subject.visible
     *
     * @mbggenerated
     */
    private Byte visible;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_subject.sortid
     *
     * @mbggenerated
     */
    private Integer sortid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_subject.pid
     *
     * @mbggenerated
     */
    private Integer pid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_subject.id
     *
     * @return the value of tb_subject.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_subject.id
     *
     * @param id the value for tb_subject.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_subject.name
     *
     * @return the value of tb_subject.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_subject.name
     *
     * @param name the value for tb_subject.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_subject.address
     *
     * @return the value of tb_subject.address
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_subject.address
     *
     * @param address the value for tb_subject.address
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_subject.synopsis
     *
     * @return the value of tb_subject.synopsis
     *
     * @mbggenerated
     */
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_subject.synopsis
     *
     * @param synopsis the value for tb_subject.synopsis
     *
     * @mbggenerated
     */
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis == null ? null : synopsis.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_subject.visible
     *
     * @return the value of tb_subject.visible
     *
     * @mbggenerated
     */
    public Byte getVisible() {
        return visible;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_subject.visible
     *
     * @param visible the value for tb_subject.visible
     *
     * @mbggenerated
     */
    public void setVisible(Byte visible) {
        this.visible = visible;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_subject.sortid
     *
     * @return the value of tb_subject.sortid
     *
     * @mbggenerated
     */
    public Integer getSortid() {
        return sortid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_subject.sortid
     *
     * @param sortid the value for tb_subject.sortid
     *
     * @mbggenerated
     */
    public void setSortid(Integer sortid) {
        this.sortid = sortid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_subject.pid
     *
     * @return the value of tb_subject.pid
     *
     * @mbggenerated
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_subject.pid
     *
     * @param pid the value for tb_subject.pid
     *
     * @mbggenerated
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}