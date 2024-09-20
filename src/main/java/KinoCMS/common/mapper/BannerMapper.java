package KinoCMS.common.mapper;


import KinoCMS.common.dto.BannerDto;
import KinoCMS.common.model.Banner;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = BannerItemMapper.class)
public interface BannerMapper {
    BannerDto toDto(Banner banner);

    Banner toEntity(BannerDto bannerDto);
}