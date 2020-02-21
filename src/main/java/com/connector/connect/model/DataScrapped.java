package com.connector.connect.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
@Table(appliesTo = "data_scrapped")
public class DataScrapped {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Data> data;

    public DataScrapped() {
    }

    public DataScrapped(List<Data> data) {
        this.data = data;
    }
}
