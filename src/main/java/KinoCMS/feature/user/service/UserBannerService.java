package KinoCMS.feature.user.service;

import KinoCMS.common.dto.BannerDto;
import KinoCMS.common.mapper.BannerMapper;
import KinoCMS.common.model.Banner;
import KinoCMS.common.service.BannerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserBannerService {

    private final BannerService bannerService;
    private final BannerMapper bannerMapper;

    public UserBannerService(BannerService bannerService, BannerMapper bannerMapper) {
        this.bannerService = bannerService;
        this.bannerMapper = bannerMapper;
    }

    public List<BannerDto> getAllBanners() {
        List<Banner> banners = bannerService.getAllBanners();
        return banners.stream()
                .map(bannerMapper::toDto)
                .collect(Collectors.toList());
    }
}