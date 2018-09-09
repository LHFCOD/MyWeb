package com.hongtu.slice.db.client;

import com.hongtu.slice.db.model.generated.Chapter;
import com.hongtu.slice.db.model.generated.Subject;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class DaoFactory {
    private SqlSessionFactory factory;

    public DaoFactory(String resource) {
        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = DaoFactory.class.getClassLoader().getResourceAsStream(resource);
        //构建sqlSession的工厂
        factory = new SqlSessionFactoryBuilder().build(is);
    }

    public List<Subject> getSubjects() {
        SqlSession session = factory.openSession();
        String statement = "com.hongtu.slice.mapper.UserMapper.getAllSubject";//映射sql的标识字符串
        //执行查询返回一个唯一user对象的sql
        try {
            return session.selectList(statement);
        } finally {
            session.close();
        }
    }
    public List<Chapter> getChaperByPid(int pid) {
        SqlSession session = factory.openSession();
        String statement = "com.hongtu.slice.mapper.UserMapper.getChapterByPid";//映射sql的标识字符串
        //执行查询返回一个唯一user对象的sql
        try {
            return session.selectList(statement,pid);
        } finally {
            session.close();
        }
    }
}
