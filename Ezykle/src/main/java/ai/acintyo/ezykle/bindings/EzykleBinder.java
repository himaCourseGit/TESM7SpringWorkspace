package ai.acintyo.ezykle.bindings;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor


public class EzykleBinder {

	
    private String name;
   
    private String imageUrl;
    
    private String description;
   
    private Integer category_id;
    
    private Integer subcategory_id;
   
    private Integer quantity;
    
    private Long mrp;
   
    private Double c_gst;
    
    private Double s_gst;
    
    private Long  discounted_price;
   
    private LocalDateTime created_at;
    
    private LocalDateTime updated_at;
    
    private LocalDateTime deleted_at;
    
    private String status;
   
    private String wishListId;
    
    private String ezykle_type;

}
