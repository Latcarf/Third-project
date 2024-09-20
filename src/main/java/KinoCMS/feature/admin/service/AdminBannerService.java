package KinoCMS.feature.admin.service;

import KinoCMS.common.dto.BannerDto;
import KinoCMS.common.mapper.BannerMapper;
import KinoCMS.common.model.Banner;
import KinoCMS.common.repository.BannerRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminBannerService {
    private final BannerMapper bannerMapper;
    private final BannerRepository bannerRepository;

    public AdminBannerService(BannerMapper bannerMapper, BannerRepository bannerRepository) {
        this.bannerMapper = bannerMapper;
        this.bannerRepository = bannerRepository;
    }

    public void createBanner(BannerDto bannerDto) {
        Banner banner = bannerMapper.toEntity(bannerDto);
        bannerRepository.save(banner);
    }

}
