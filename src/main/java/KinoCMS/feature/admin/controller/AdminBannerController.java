package KinoCMS.feature.admin.controller;

import KinoCMS.common.dto.BannerDto;
import KinoCMS.feature.admin.service.AdminBannerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/banners")
public class AdminBannerController {

    private final AdminBannerService adminBannerService;

    public AdminBannerController(AdminBannerService adminBannerService) {
        this.adminBannerService = adminBannerService;
    }

    @GetMapping
    public String createBanner(Model model) {
        model.addAttribute("banner", new BannerDto());
        return "";
    }

        @PostMapping
        public String createBanner(@RequestBody BannerDto bannerDto) {
        adminBannerService.createBanner(bannerDto);
        return "";
    }

}
