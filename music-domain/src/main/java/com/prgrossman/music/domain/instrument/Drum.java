package com.prgrossman.music.domain.instrument;

import com.prgrossman.music.domain.product.Condition;

public class Drum extends Instrument {


    public Drum(int productId, int basePrice, String modelName, Condition condition) {
        super(productId, basePrice, modelName, condition);
    }

    public InstrumentType getInstrumentType(){
        return InstrumentType.DRUM;
    }


}
