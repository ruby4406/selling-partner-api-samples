package lambda.utils.B2C;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Amount {

    @JsonProperty("currencyCode")
    public String currencyCode;

    @JsonProperty("amount")
    public float amount;
}
