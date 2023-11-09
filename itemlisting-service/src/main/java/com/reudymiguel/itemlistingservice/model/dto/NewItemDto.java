package com.reudymiguel.itemlistingservice.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.reudymiguel.itemlistingservice.model.entity.Category;
import com.reudymiguel.itemlistingservice.model.entity.Condition;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NewItemDto {

    @JsonProperty(value = "item_name")
    private String itemName;

    private String description;

    private double price;

    private int quantity;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Enumerated(EnumType.STRING)
    private Condition condition;

//    private User seller;

    private String image;

    private String tags;

}
