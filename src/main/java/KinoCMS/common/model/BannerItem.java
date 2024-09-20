package KinoCMS.common.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "banner_items")
public class BannerItem {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "banner_items_id", nullable = false)
    private Long id;

    @Column(name = "photo_url", nullable = false)
    private String photoUrl;

    @Column(name = "text_content", nullable = false)
    private String textContent;

    @ManyToOne
    @JoinColumn(name = "banner_id", nullable = false)
    private Banner banner;
}
