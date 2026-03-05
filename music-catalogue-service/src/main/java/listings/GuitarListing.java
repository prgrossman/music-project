package listings;


import com.prgrossman.music.domain.instrument.InstrumentType;

import java.util.UUID;

public class GuitarListing extends InstrumentListing {

    public GuitarListing() {
    }

    @Override
    public InstrumentType getType() {
        return InstrumentType.GUITAR;
    }
}
