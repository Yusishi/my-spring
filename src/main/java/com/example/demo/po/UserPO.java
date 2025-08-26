package com.example.demo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "t_user")
public class UserPO {

    /**
     * 使用雪花算法作为主键ID
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    private String name;


}
