package me.zhengjie.modules.salary.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import me.zhengjie.modules.salary.domain.Banner;
import me.zhengjie.modules.salary.pojo.vo.BannerVO;

public interface BannerMapper extends BaseMapper<Banner> {
    public BannerVO getHHH(Long id);
}
