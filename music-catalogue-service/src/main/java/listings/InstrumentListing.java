package listings;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.prgrossman.music.domain.instrument.InstrumentType;
import java.util.UUID;

/**
 * Polymorphic JSON: @JsonTypeInfo is on InstrumentListing (base type).
 * `type` selects a concrete subtype, which must extend InstrumentListing (assignable in Java).
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type",
        visible = true
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
    private final UUID listingId;
    protected InstrumentListing(UUID listingId) {
        this.listingId = listingId;
    }

    public abstract InstrumentType getType();

}

//Instrument = physical object identity
//Listing = marketplace wrapper around it
