package ai.acintyo.ezykle.dto;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EykleDto {
	
	    @Id     
	    private Integer id;
	
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
	   
	    private String created_at;
	    
	    private String updated_at;
	    
	    private String deleted_at;
	    
	    private String status;
	   
	    private String wishListId;
	    
	    private String ezykle_type;
}
