package KinoCMS.common.dto;

import lombok.Data;

import java.util.List;

@Data
public class BannerDto {
    private Long id;
    private String backgroundBanner;
    private List<BannerItemDto> items;
}
