package com.prgrossman.music.domain.instrument;

import com.prgrossman.music.domain.product.Condition;

public class Guitar extends Instrument{

    @Override
    public InstrumentType getInstrumentType(){
        return InstrumentType.GUITAR;
    }

    public Guitar(int productId, int basePrice, String modelName, Condition condition) {
        super(productId, basePrice, modelName, condition);
    }


}

//getters only if outside objects need to read it.
//don't need getters because nothing outside the object needs to read it.