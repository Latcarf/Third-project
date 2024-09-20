package KinoCMS.common.service;

import KinoCMS.common.model.Banner;
import KinoCMS.common.repository.BannerRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerService {

    private final BannerRepository bannerRepository;

    public BannerService(BannerRepository bannerRepository) {
        this.bannerRepository = bannerRepository;
    }

    public Banner getBannerById(Long id) {
        return bannerRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Banner not found"));
    }

    public List<Banner> getAllBanners() {
        return bannerRepository.findAll();
    }
}
