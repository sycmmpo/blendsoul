package com.bs.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bs.entity.BsSysUser;
import com.bs.service.BsSysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (BsSysUser)表控制层
 *
 * @author makejava
 * @since 2020-02-12 16:16:28
 */
@RestController
@RequestMapping("bsSysUser")
public class BsSysUserController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private BsSysUserService bsSysUserService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param bsSysUser 查询实体
     * @return 所有数据
     */
    @GetMapping
    @CrossOrigin(origins = "*")
    public R selectAll(Page<BsSysUser> page, BsSysUser bsSysUser) {
        return success(this.bsSysUserService.page(page, new QueryWrapper<>(bsSysUser)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.bsSysUserService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param bsSysUser 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody BsSysUser bsSysUser) {
        return success(this.bsSysUserService.save(bsSysUser));
    }

    /**
     * 修改数据
     *
     * @param bsSysUser 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody BsSysUser bsSysUser) {
        return success(this.bsSysUserService.updateById(bsSysUser));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.bsSysUserService.removeByIds(idList));
    }
}