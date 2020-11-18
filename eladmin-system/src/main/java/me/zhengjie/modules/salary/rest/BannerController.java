package me.zhengjie.modules.salary.rest;

import me.zhengjie.modules.salary.domain.Banner;
import me.zhengjie.modules.salary.pojo.vo.BannerVO;
import me.zhengjie.modules.salary.service.BannerService;
import me.zhengjie.modules.system.domain.User;
import me.zhengjie.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BannerController {

    @Autowired
    private BannerService bannerService;

    @GetMapping("/banner")
    public List<Banner> getBanners() {
        return bannerService.getBanners();
    }

    @GetMapping("/banner/{id}")
    public BannerVO getBannerById(
            @PathVariable Long id
    ) {
        return bannerService.getHHH(id);
    }

}
