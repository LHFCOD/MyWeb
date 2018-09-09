package com.hongtu.slice.db.test;

import com.hongtu.slice.db.client.DaoFactory;
import com.hongtu.slice.db.client.DbFactory;
import com.hongtu.slice.db.model.generated.Chapter;
import com.hongtu.slice.db.model.generated.Subject;
import java.util.List;

public class TestDb {
    public static void main(String[] args){
        test();
    }
    public static void test(){
       DaoFactory daoFactory= DbFactory.getInstance();
       List<Chapter> subjects=daoFactory.getChaperByPid(1);
       System.out.println(subjects);
    }
}
