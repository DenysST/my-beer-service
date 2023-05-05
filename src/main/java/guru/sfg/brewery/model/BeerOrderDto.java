package guru.sfg.brewery.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import guru.sfg.brewery.model.serializers.OffsetDateTimeDeserializer;
import guru.sfg.brewery.model.serializers.OffsetDateTimeToStringSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerOrderDto {

    @JsonProperty("id")
    private UUID id = null;

    @JsonProperty("version")
    private Integer version = null;

    @JsonSerialize(using = OffsetDateTimeToStringSerializer.class)
    @JsonDeserialize(using = OffsetDateTimeDeserializer.class)
    @JsonProperty("createdDate")
    private OffsetDateTime createdDate = null;

    @JsonSerialize(using = OffsetDateTimeToStringSerializer.class)
    @JsonDeserialize(using = OffsetDateTimeDeserializer.class)
    @JsonProperty("lastModifiedDate")
    private OffsetDateTime lastModifiedDate = null;

    private UUID customerId;
    private String customerRef;
    private List<BeerOrderLineDto> beerOrderLines;
    private String orderStatus;
    private String orderStatusCallbackUrl;
}
