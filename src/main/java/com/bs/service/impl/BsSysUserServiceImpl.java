package com.bs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bs.dao.BsSysUserDao;
import com.bs.entity.BsSysUser;
import com.bs.service.BsSysUserService;
import org.springframework.stereotype.Service;

/**
 * (BsSysUser)表服务实现类
 *
 * @author makejava
 * @since 2020-02-12 16:16:27
 */
@Service("bsSysUserService")
public class BsSysUserServiceImpl extends ServiceImpl<BsSysUserDao, BsSysUser> implements BsSysUserService {

}