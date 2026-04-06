package listings;


import com.prgrossman.music.domain.instrument.InstrumentType;

import java.util.UUID;

public class DrumListing extends InstrumentListing {

    public DrumListing (){
    }

    @Override
    public InstrumentType getInstrumentType() {
        return InstrumentType.DRUM;
    }
}
