
package Models;

import java.util.Date;
import lombok.Data;

@Data
public class Sale {
    
    private Long id_sale;
    private Integer id_employee;
    private Integer id_branch_office;
    private Double total_sale;
    private String description;
    private String date_sale;

    public Sale() {}

    public Sale(Long id_sale, Integer id_employee, Integer id_branch_office, Double total_sale, String description, String date_sale) {
        
            this.id_sale = id_sale;
            this.id_employee = id_employee;
            this.id_branch_office = id_branch_office;
            this.total_sale = total_sale;
            this.description = description;
            this.date_sale = date_sale;
            
    }
    
    
}
