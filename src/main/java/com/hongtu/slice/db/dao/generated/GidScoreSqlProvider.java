package com.hongtu.slice.db.dao.generated;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.hongtu.slice.db.model.generated.GidScore;

public class GidScoreSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gid_score
     *
     * @mbggenerated
     */
    public String insertSelective(GidScore record) {
        BEGIN();
        INSERT_INTO("gid_score");
        
        if (record.getGid() != null) {
            VALUES("gid", "#{gid,jdbcType=BIGINT}");
        }
        
        if (record.getModel() != null) {
            VALUES("model", "#{model,jdbcType=VARCHAR}");
        }
        
        if (record.getDesc() != null) {
            VALUES("desc", "#{desc,jdbcType=VARCHAR}");
        }
        
        if (record.getTarget() != null) {
            VALUES("target", "#{target,jdbcType=VARCHAR}");
        }
        
        if (record.getScore() != null) {
            VALUES("score", "#{score,jdbcType=DOUBLE}");
        }
        
        if (record.getInfo() != null) {
            VALUES("info", "#{info,jdbcType=VARCHAR}");
        }
        
        if (record.getTime() != null) {
            VALUES("time", "#{time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=INTEGER}");
        }
        
        if (record.getUpdateTime() != null) {
            VALUES("update_time", "#{updateTime,jdbcType=INTEGER}");
        }
        
        if (record.getNote1() != null) {
            VALUES("note1", "#{note1,jdbcType=VARCHAR}");
        }
        
        if (record.getNote2() != null) {
            VALUES("note2", "#{note2,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gid_score
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(GidScore record) {
        BEGIN();
        UPDATE("gid_score");
        
        if (record.getGid() != null) {
            SET("gid = #{gid,jdbcType=BIGINT}");
        }
        
        if (record.getModel() != null) {
            SET("model = #{model,jdbcType=VARCHAR}");
        }
        
        if (record.getDesc() != null) {
            SET("desc = #{desc,jdbcType=VARCHAR}");
        }
        
        if (record.getTarget() != null) {
            SET("target = #{target,jdbcType=VARCHAR}");
        }
        
        if (record.getScore() != null) {
            SET("score = #{score,jdbcType=DOUBLE}");
        }
        
        if (record.getInfo() != null) {
            SET("info = #{info,jdbcType=VARCHAR}");
        }
        
        if (record.getTime() != null) {
            SET("time = #{time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=INTEGER}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("update_time = #{updateTime,jdbcType=INTEGER}");
        }
        
        if (record.getNote1() != null) {
            SET("note1 = #{note1,jdbcType=VARCHAR}");
        }
        
        if (record.getNote2() != null) {
            SET("note2 = #{note2,jdbcType=VARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }
}