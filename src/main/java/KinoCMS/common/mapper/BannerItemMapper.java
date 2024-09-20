package KinoCMS.common.mapper;

import KinoCMS.common.dto.BannerItemDto;
import KinoCMS.common.model.BannerItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BannerItemMapper {
    BannerItemDto toDto(BannerItem bannerItem);

    BannerItem toEntity(BannerItemDto bannerItemDto);
}