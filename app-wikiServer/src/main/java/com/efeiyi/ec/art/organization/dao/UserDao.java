package com.efeiyi.ec.art.organization.dao;


import com.efeiyi.ec.art.organization.model.MyUser;
import com.ming800.core.base.dao.BaseDao;

import java.util.LinkedHashMap;

/**
 * Created by IntelliJ IDEA.
 * User: ming
 * Date: 12-10-16
 * Time: 下午4:18
 * To change this template use File | Settings | File Templates.
 */
public interface UserDao extends BaseDao<MyUser> {


    public MyUser getUniqueMyUserByConditions(String branchName, String queryHql, LinkedHashMap<String, Object> queryParamMap);

}
