package com.hongtu.slice.db.test;

import com.hongtu.slice.db.model.generated.GidScore;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class SqlFactory {
    public static void main(String[] args){
        test();
    }
    public static void test(){
        String resource = "mapper/config/mybatisConfig.xml";
        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = SqlFactory.class.getClassLoader().getResourceAsStream(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sessionFactory.openSession();
        /**
         * 映射sql的标识字符串，
         * com.oumyye.mapping.UserMapping是userMapper.xml文件中mapper标签的namespace属性的值，
         * getUser是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
        String statement = "com.hongtu.slice.mapper.UserMapper.getAllUser";//映射sql的标识字符串
        //执行查询返回一个唯一user对象的sql
        List<GidScore> user = session.selectList(statement);
        System.out.println(user.toString());
    }
}
