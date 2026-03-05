package listings;


import com.prgrossman.music.domain.instrument.InstrumentType;

import java.util.UUID;

public class GuitarListing extends InstrumentListing {

    public GuitarListing(UUID listingId) {
        super(listingId);
    }

    @Override
    public InstrumentType getType() {
        return InstrumentType.GUITAR;
    }
}
