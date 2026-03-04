package com.prgrossman.music.domain.instrument;

import com.prgrossman.music.domain.product.Condition;
import com.prgrossman.music.domain.product.Product;
import com.prgrossman.music.domain.product.ProductType;

public abstract class Instrument extends Product {
    private String modelName;
    private Condition condition;

    public abstract InstrumentType getInstrumentType();

    protected Instrument( int productId, int basePrice, String modelName, Condition condition){
        super(productId, basePrice);
        if(modelName == null || modelName.isBlank()){
            throw new IllegalArgumentException("Model name required.");
        }
        if(condition == null){
            throw new IllegalArgumentException("Condition required");
        }

    }

    public String getModelName() {
        return modelName;
    }

    public Condition getCondition() {
        return condition;
    }

    @Override
    public ProductType getProductType(){
        return ProductType.INSTRUMENT;
    }

}
