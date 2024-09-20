package KinoCMS.common.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "banners")
public class Banner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "banners_id", nullable = false)
    private Long id;

    @Column(name = "background_banner", nullable = false)
    private String backgroundBanner;

    @OneToMany(mappedBy = "banner", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BannerItem> items;
}