package listings;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.prgrossman.music.domain.instrument.InstrumentType;
import com.prgrossman.music.domain.product.Condition;

/**
 * Polymorphic JSON: @JsonTypeInfo is on InstrumentListing (base type).
 * `type` selects a concrete subtype, which must extend InstrumentListing (assignable in Java).
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)

/**
 * @JsonSubTypes is telling Jackson which concrete Listing
 * to instantiate when it sees e.g. "type": "GUITAR"
 */



@JsonSubTypes(
        {@JsonSubTypes.Type(
                value = DrumListing.class,
                name = "DRUM"
        ),
        @JsonSubTypes.Type(
                value = GuitarListing.class,
                name = "GUITAR"
        )}
)

public abstract class InstrumentListing {

    private int productId;
    private  int basePrice;
    private String modelName;
    private Condition condition;

    protected InstrumentListing() {
    }

    @JsonIgnore
    public abstract InstrumentType getType();


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }
}

//Instrument = physical object identity
//Listing = marketplace wrapper around it
