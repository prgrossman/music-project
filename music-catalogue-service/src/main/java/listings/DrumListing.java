package listings;


import com.prgrossman.music.domain.instrument.InstrumentType;

import java.util.UUID;

public class DrumListing extends InstrumentListing {

    public DrumListing (UUID listingId){
        super(listingId);
    }

    @Override
    public InstrumentType getType() {
        return InstrumentType.DRUM;
    }
}
