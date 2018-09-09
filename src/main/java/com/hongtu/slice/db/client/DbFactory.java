package com.hongtu.slice.db.client;

public class DbFactory {
    private static DaoFactory daoFactory;
    public static DaoFactory getInstance(){
        if(daoFactory==null){
            String resource = "mapper/config/mybatisConfig.xml";
            daoFactory=new DaoFactory(resource);
        }
        return daoFactory;
    }
}
