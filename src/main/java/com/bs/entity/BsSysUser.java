package com.bs.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (BsSysUser)表实体类
 *
 * @author makejava
 * @since 2020-02-12 16:16:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("serial")
public class BsSysUser extends Model<BsSysUser> {
    @TableId(type= IdType.AUTO)
    private Integer id;
        
    private String name;
        
    private String pass;
        
    private String status;
        
    private String roleid;

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    }