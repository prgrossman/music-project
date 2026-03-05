package com.prgrossman.music.domain.instrument;

import com.prgrossman.music.domain.product.Condition;

public class Drum extends Instrument {

    @Override
    public InstrumentType getInstrumentType(){
        return InstrumentType.DRUM;
    }

    public Drum(int productId, double basePrice, String modelName, Condition condition) {
        super(productId, basePrice, modelName, condition);
    }

}
