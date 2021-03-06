package com.hongtu.slice.db.model.generated;

public class Chapter {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_catalog.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_catalog.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_catalog.pid
     *
     * @mbggenerated
     */
    private Integer pid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_catalog.synopsis
     *
     * @mbggenerated
     */
    private String synopsis;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_catalog.visible
     *
     * @mbggenerated
     */
    private Byte visible;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_catalog.sortid
     *
     * @mbggenerated
     */
    private Integer sortid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_catalog.id
     *
     * @return the value of tb_catalog.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_catalog.id
     *
     * @param id the value for tb_catalog.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_catalog.name
     *
     * @return the value of tb_catalog.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_catalog.name
     *
     * @param name the value for tb_catalog.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_catalog.pid
     *
     * @return the value of tb_catalog.pid
     *
     * @mbggenerated
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_catalog.pid
     *
     * @param pid the value for tb_catalog.pid
     *
     * @mbggenerated
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_catalog.synopsis
     *
     * @return the value of tb_catalog.synopsis
     *
     * @mbggenerated
     */
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_catalog.synopsis
     *
     * @param synopsis the value for tb_catalog.synopsis
     *
     * @mbggenerated
     */
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis == null ? null : synopsis.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_catalog.visible
     *
     * @return the value of tb_catalog.visible
     *
     * @mbggenerated
     */
    public Byte getVisible() {
        return visible;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_catalog.visible
     *
     * @param visible the value for tb_catalog.visible
     *
     * @mbggenerated
     */
    public void setVisible(Byte visible) {
        this.visible = visible;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_catalog.sortid
     *
     * @return the value of tb_catalog.sortid
     *
     * @mbggenerated
     */
    public Integer getSortid() {
        return sortid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_catalog.sortid
     *
     * @param sortid the value for tb_catalog.sortid
     *
     * @mbggenerated
     */
    public void setSortid(Integer sortid) {
        this.sortid = sortid;
    }
}