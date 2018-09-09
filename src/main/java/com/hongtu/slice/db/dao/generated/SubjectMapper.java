package com.hongtu.slice.db.dao.generated;

import com.hongtu.slice.db.model.generated.Subject;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SubjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_subject
     *
     * @mbggenerated
     */
    @Delete({
        "delete from tb_subject",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_subject
     *
     * @mbggenerated
     */
    @Insert({
        "insert into tb_subject (name, address, ",
        "synopsis, visible, ",
        "sortid, pid)",
        "values (#{name,jdbcType=VARCHAR}, #{address,jdbcType=VARCHAR}, ",
        "#{synopsis,jdbcType=VARCHAR}, #{visible,jdbcType=TINYINT}, ",
        "#{sortid,jdbcType=INTEGER}, #{pid,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Subject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_subject
     *
     * @mbggenerated
     */
    @InsertProvider(type=SubjectSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(Subject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_subject
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, name, address, synopsis, visible, sortid, pid",
        "from tb_subject",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="synopsis", property="synopsis", jdbcType=JdbcType.VARCHAR),
        @Result(column="visible", property="visible", jdbcType=JdbcType.TINYINT),
        @Result(column="sortid", property="sortid", jdbcType=JdbcType.INTEGER),
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER)
    })
    Subject selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_subject
     *
     * @mbggenerated
     */
    @UpdateProvider(type=SubjectSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Subject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_subject
     *
     * @mbggenerated
     */
    @Update({
        "update tb_subject",
        "set name = #{name,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "synopsis = #{synopsis,jdbcType=VARCHAR},",
          "visible = #{visible,jdbcType=TINYINT},",
          "sortid = #{sortid,jdbcType=INTEGER},",
          "pid = #{pid,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Subject record);
}