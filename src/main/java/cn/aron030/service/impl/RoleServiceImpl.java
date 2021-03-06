package cn.aron030.service.impl;


import cn.aron030.dao.RoleDao;
import cn.aron030.domain.Role;
import cn.aron030.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoleServiceImpl implements RoleService {

    private RoleDao roleDao;

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }
    @Override
    public List<Role> list() {
        List<Role> roleList = roleDao.findAll();
        return roleList;
    }

    @Override
    public void save(Role role) {
        roleDao.save(role);
    }


}
