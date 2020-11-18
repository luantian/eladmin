package me.zhengjie.modules.salary.service;

import me.zhengjie.modules.salary.domain.Banner;
import me.zhengjie.modules.salary.mapper.BannerMapper;
import me.zhengjie.modules.salary.pojo.vo.BannerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerService {

    @Autowired
    private BannerMapper bannerMapper;

    public List<Banner> getBanners() {
        return bannerMapper.selectList(null);
    }

    public BannerVO getHHH(Long id) {
        return bannerMapper.getHHH(id);
    }
}
