package me.zhengjie.modules.salary.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@TableName("banner")
public class Banner {
    private Long id;
    private String name;
}
