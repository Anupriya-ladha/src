
package com.indusnet.Restaurant_booking.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tables")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Table {

    @Id
    private String id;

    private String restaurantId; 
    private int size;
    private String location; 
}
