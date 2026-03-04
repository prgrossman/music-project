package listings;



import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.UUID;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY, //type already exists
        property = "type",
        visible = true
)


public abstract class InstrumentListing {
    private final UUID listingId;
    protected InstrumentListing(UUID listingId) {
        this.listingId = listingId;
    }



}

//Instrument = physical object identity
//        Listing = marketplace wrapper around it
