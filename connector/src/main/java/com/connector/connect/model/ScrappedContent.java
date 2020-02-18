package com.connector.connect.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Table;


import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
@Table(appliesTo = "scrapped_content")
public class ScrappedContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<DataScrapped> dataScrapped;

    public ScrappedContent() {
    }

    public ScrappedContent(List<DataScrapped> dataScrapped) {
        this.dataScrapped = dataScrapped;
    }
}
