package groceryProject.webApi.responses.corporateCustomer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetAllCorporateCustomerResponse {
    private int id;
    private String email;
    private String password;
    private String address;
    private String phoneNumber;
    private String companyName;
    private String taxNumber;
}
