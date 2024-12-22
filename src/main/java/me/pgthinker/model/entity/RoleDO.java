package me.pgthinker.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("user_role")
public class RoleDO {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private String description;
}
